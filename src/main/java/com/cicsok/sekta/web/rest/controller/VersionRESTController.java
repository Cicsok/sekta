package com.cicsok.sekta.web.rest.controller;

import com.cicsok.sekta.web.rest.marker.RESTAPIController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@RESTAPIController
public class VersionRESTController {

    @GetMapping(path = "/version")
    public ResponseEntity<Map<String, String>> getVersion() {
        return ResponseEntity.ok(Map.of("version", "1.0"));
    }
}
