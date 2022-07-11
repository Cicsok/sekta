package com.cicsok.sekta.web.acceptancetest.ui.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DummyPage extends Page {

    @FindBy(id = "date")
    private WebElement date;

    @FindBy(id = "time")
    private WebElement time;

    public DummyPage(final WebDriver driver) {
        super(driver);
    }

    @Override
    protected String getPageTitle() {
        return "Dummy Page";
    }

    public String getDate() {
        return date.getText();
    }

    public String getTime() {
        return time.getText();
    }
}