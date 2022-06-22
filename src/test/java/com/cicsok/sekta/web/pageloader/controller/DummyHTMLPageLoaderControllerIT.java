package com.cicsok.sekta.web.pageloader.controller;

import com.cicsok.sekta.web.rest.marker.ControllerIntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@ControllerIntegrationTest
public class DummyHTMLPageLoaderControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void loadPageShouldReturnWithTheCorrectViewName() throws Exception {
        // Given

        // When and Then
        mockMvc.perform(MockMvcRequestBuilders.get("/dummy"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(model().size(0))
                .andExpect(view().name("dummy"));

    }
}
