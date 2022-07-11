package com.cicsok.sekta.web.acceptancetest.runner;

import com.cicsok.sekta.web.app.SEKTAWebRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/acceptance-test/features"},
        glue = "com/cicsok/sekta/web/acceptancetest")
@CucumberContextConfiguration
@SpringBootTest(classes = SEKTAWebRunner.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ActiveProfiles("ci")
public class TestRunner {
}
