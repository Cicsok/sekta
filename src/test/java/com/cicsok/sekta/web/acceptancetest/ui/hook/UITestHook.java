package com.cicsok.sekta.web.acceptancetest.ui.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.AllArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.web.context.support.GenericWebApplicationContext;

@AllArgsConstructor
public class UITestHook {

    private final GenericWebApplicationContext applicationContext;

    @Before("@ui")
    public void beforeUISteps() {
        setUpWebDriverManager();
        applicationContext.registerBean("firefoxDriver", WebDriver.class, this::createFirefoxDriver);
    }

    @After("@ui")
    public void afterUISteps() {
        applicationContext.getBean("firefoxDriver", WebDriver.class).quit();
    }

    private void setUpWebDriverManager() {
        WebDriverManager.firefoxdriver().setup();
    }

    private WebDriver createFirefoxDriver() {
        return new FirefoxDriver(new FirefoxOptions().setHeadless(true));
    }
}
