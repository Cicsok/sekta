package com.cicsok.sekta.web.pageloader.controller;

import com.cicsok.sekta.web.rest.marker.ControllerIntegrationTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@ControllerIntegrationTest
public class DummyHTMLPageLoaderControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void loadPageShouldReturnWithTheCorrectViewName() throws Exception {
        // Given

        // When and Then
        mockMvc.perform(MockMvcRequestBuilders.get("/dummy"))
                .andExpect(status().isOk())
                .andExpect(model().size(0))
                .andExpect(view().name("dummy"));

    }
}
