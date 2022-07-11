package com.cicsok.sekta.web.rest.controller;

import com.cicsok.sekta.web.rest.marker.ControllerIntegrationTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.function.Supplier;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@ControllerIntegrationTest
public class DummyRESTControllerIntegrationTest {

    private static final int YEAR = 2022;
    private static final Month MONTH = Month.JUNE;
    private static final int DAY = 9;

    private static final int HOUR = 8;
    private static final int MINUTE = 7;
    private static final int SECOND = 0;

    private static final LocalDateTime ACTUAL_DATE_TIME = LocalDateTime.of(YEAR, MONTH, DAY, HOUR, MINUTE, SECOND);

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Supplier<LocalDateTime> actualDateTimeSupplier;

    @Test
    public void retrieveShouldRespondWithActualDateTime() throws Exception {
        // Given
        given(actualDateTimeSupplier.get()).willReturn(ACTUAL_DATE_TIME);

        // When and Then
        mockMvc.perform(MockMvcRequestBuilders.get("/api/dummy"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.date").value("2022-06-09"))
                .andExpect(jsonPath("$.time").value("08:07:00"));
    }
}
