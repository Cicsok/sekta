package com.cicsok.sekta.web.rest.controller;

import com.cicsok.sekta.web.rest.factory.DummyResponseFactory;
import com.cicsok.sekta.web.rest.marker.RESTAPIController;
import com.cicsok.sekta.web.rest.response.DummyResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RESTAPIController
@AllArgsConstructor
@ApiOperation("Dummy API")
public class DummyRESTController {

    private final DummyResponseFactory factory;

    @GetMapping(path = "/dummy")
    @ApiOperation(value = "Get dummy data", notes = "Returns dummy data")
    @ApiResponses(value = @ApiResponse(code = 200, message = "Successfully retrieved"))
    public ResponseEntity<DummyResponse> retrieve() {
        final var responseData = factory.create();

        return ResponseEntity.ok(responseData);
    }
}
