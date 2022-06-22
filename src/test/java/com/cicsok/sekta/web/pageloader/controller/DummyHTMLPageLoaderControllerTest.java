package com.cicsok.sekta.web.pageloader.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class DummyHTMLPageLoaderControllerTest {

    private DummyHTMLPageLoaderController underTest;

    @BeforeEach
    public void init() {
        underTest = new DummyHTMLPageLoaderController();
    }

    @Test
    public void loadPageShouldReturnWithTheCorrectViewName() {
        // Given
        final var expectedViewName = "dummy";

        // When
        final var actualView = underTest.loadPage();

        // Then
        assertThat(actualView, notNullValue());
        assertThat(actualView.getViewName(), equalTo(expectedViewName));
    }
}
