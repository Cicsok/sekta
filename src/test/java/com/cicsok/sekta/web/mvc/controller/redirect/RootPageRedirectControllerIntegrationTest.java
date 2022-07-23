package com.cicsok.sekta.web.mvc.controller.redirect;

import com.cicsok.sekta.web.rest.marker.ControllerIntegrationTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ControllerIntegrationTest
public class RootPageRedirectControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void redirectShouldReturnWithTheCorrectRedirectExpressionAndDestinationPageURI() throws Exception {
        // Given

        // When and Then
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(status().is3xxRedirection())
                .andExpect(status().isFound())
                .andExpect(redirectedUrl("/dummy"));
    }
}
