package com.cicsok.sekta.web.acceptancetest.ui.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RandomNumberGeneratorPage extends Page {

    @FindBy(id = "min")
    private WebElement minField;

    @FindBy(id = "max")
    private WebElement maxField;

    @FindBy(id = "generate")
    private WebElement generateButton;

    @FindBy(id = "result")
    private WebElement result;

    public RandomNumberGeneratorPage(final WebDriver driver) {
        super(driver);
    }

    @Override
    protected String getPageTitle() {
        return "Random Number Generator";
    }

    public void enterMinField(final String min) {
        minField.sendKeys(min);
    }

    public void enterMaxField(final String max) {
        maxField.sendKeys(max);
    }

    public void pressGenerateButton() {
        generateButton.click();
    }

    public String getResult() {
        return result.getText();
    }
}