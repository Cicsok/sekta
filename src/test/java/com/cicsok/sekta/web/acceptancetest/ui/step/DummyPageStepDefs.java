package com.cicsok.sekta.web.acceptancetest.ui.step;

import com.cicsok.sekta.web.acceptancetest.ui.page.DummyPage;
import com.cicsok.sekta.web.acceptancetest.ui.provider.PageProvider;
import com.cicsok.sekta.web.acceptancetest.ui.provider.URLProvider;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class DummyPageStepDefs {

    private final WebDriver webDriver;
    private final URLProvider urlProvider;

    private final PageProvider<DummyPage> pageProvider;

    @Given("the Dummy page URL is opened")
    public void theDummyPageURLIsDefined() {
        webDriver.get(urlProvider.getDummyPageURL());
    }

    @When("the Dummy page is loaded")
    public void theDummyPageIsLoaded() {
        pageProvider.initPage(webDriver);
    }

    @Then("I see the date UI element with {string} value on the Dummy page")
    public void iSeeTheDateUIElementWithValueOnTheDummyPage(final String expectedUIElementValue) {
        final var actualUIElementValue = pageProvider.getPage().getDate();
        assertThat(actualUIElementValue, equalTo(expectedUIElementValue));
    }

    @And("I see the time UI element with {string} value on the Dummy page")
    public void iSeeTheTimeUIElementWithValueOnTheDummyPage(final String expectedUIElementValue) {
        final var actualUIElementValue = pageProvider.getPage().getTime();
        assertThat(actualUIElementValue, equalTo(expectedUIElementValue));
    }


}