package com.cicsok.sekta.web.acceptancetest.api.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;


public class VersionAPIStepDefs {

    private Response response = null;

    @When("^the client calls (.+) endpoint$")
    public void the_client_issues_GET_version(final String path) {
        response = RestAssured.get(path);
    }

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(final int statusCode) {
        response.then()
                .assertThat()
                .statusCode(equalTo(statusCode));
    }

    @And("^the client receives server version (.+)$")
    public void the_client_receives_server_version_body(final String version) {
        response.then()
                .assertThat()
                .body("version", equalTo(version));
    }
}