package com.cicsok.sekta.web.rest.controller;

import com.cicsok.sekta.web.rest.factory.DummyResponseFactory;
import com.cicsok.sekta.web.rest.response.DummyResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.BDDMockito.given;

public class DummyRESTControllerTest {

    private static final String DATE = "2022-06-09";
    private static final String TIME = "08:07:00";

    @Mock
    private DummyResponseFactory factoryMock;

    private DummyRESTController underTest;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);

        underTest = new DummyRESTController(factoryMock);
    }

    @Test
    public void retrieveShouldRespondWithActualDateTime() {
        // Given
        final var expectedBody = DummyResponse.builder()
                .date(DATE)
                .time(TIME)
                .build();

        given(factoryMock.create()).willReturn(expectedBody);

        // When
        final var actualResponse = underTest.retrieve();

        // Then
        assertThat(actualResponse, notNullValue());
        assertThat(actualResponse.getStatusCode(), equalTo(HttpStatus.OK));
        assertThat(actualResponse.getBody(), equalTo(expectedBody));
    }

}
