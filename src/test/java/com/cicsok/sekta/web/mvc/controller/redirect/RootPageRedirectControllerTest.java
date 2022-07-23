package com.cicsok.sekta.web.mvc.controller.redirect;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class RootPageRedirectControllerTest {

    private RootPageRedirectController underTest;

    @Before
    public void init() {
        underTest = new RootPageRedirectController();
    }

    @Test
    public void redirectShouldReturnWithTheCorrectRedirectExpressionAndDestinationPageURI() {
        // Given
        final var expectedRedirectExpression = "redirect:/dummy";

        // When
        final var actualRedirectExpression = underTest.redirect();

        // Then
        assertThat(actualRedirectExpression, notNullValue());
        assertThat(actualRedirectExpression, equalTo(expectedRedirectExpression));
    }
}
