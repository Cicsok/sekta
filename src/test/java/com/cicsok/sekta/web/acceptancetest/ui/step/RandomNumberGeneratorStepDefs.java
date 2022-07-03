package com.cicsok.sekta.web.acceptancetest.ui.step;

import com.cicsok.sekta.web.acceptancetest.ui.page.RandomNumberGeneratorPage;
import com.cicsok.sekta.web.acceptancetest.ui.provider.PageProvider;
import com.cicsok.sekta.web.acceptancetest.ui.provider.URLProvider;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

@AllArgsConstructor
public class RandomNumberGeneratorStepDefs {

    private final WebDriver webDriver;
    private final URLProvider urlProvider;

    private final PageProvider<RandomNumberGeneratorPage> pageProvider;

    @Given("we are expecting a random number between min and max")
    public void expectingRandomNumberBetweenMinAndMax() {
    }

    @And("I am on random-number-generator page")
    public void iAmOnRandomNumberGeneratorPage() {
        webDriver.get(urlProvider.getRandomNumberUrl());
        pageProvider.initPage(webDriver);
    }

    @When("^I enter min ([^\"]*)$")
    public void whenIEnterMin(final String min) {
        pageProvider.getPage().enterMinField(min);
    }

    @When("^I enter max ([^\"]*)$")
    public void whenIEnterMax(final String max) {
        pageProvider.getPage().enterMaxField(max);
    }

    @And("^I press Generate button")
    public void whenIPressGenerateButton() {
        pageProvider.getPage().pressGenerateButton();
    }

    @Then("I should receive a random number between {int} and {int}")
    public void iShouldReceiveARandomNumberBetweenAnd(final int min, final int max) {
        final var result = Integer.parseInt(pageProvider.getPage().getResult());
        assertTrue(result >= min && result <= max);
    }
}