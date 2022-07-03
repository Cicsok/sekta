package com.cicsok.sekta.web.acceptancetest.api.hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class APITestHook {

    @Before("@api")
    public void beforeAPISteps() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8082;
        RestAssured.basePath = "/sekta/api/";
    }

    @After("@api")
    public void afterAPISteps() {
        RestAssured.reset();
    }
}
