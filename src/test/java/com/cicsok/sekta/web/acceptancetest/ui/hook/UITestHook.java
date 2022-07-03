package com.cicsok.sekta.web.acceptancetest.ui.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.AllArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.context.support.GenericWebApplicationContext;

@AllArgsConstructor
public class UITestHook {

    private final GenericWebApplicationContext applicationContext;

    @Before("@ui")
    public void beforeUISteps() {
        setUpChromeDriver();
        applicationContext.registerBean("chromeDriver", WebDriver.class, () -> new ChromeDriver());
    }

    @After("@ui")
    public void afterUISteps() {
        applicationContext.getBean(WebDriver.class).quit();
    }

    private void setUpChromeDriver() {
        WebDriverManager.chromedriver().setup();
    }
}
