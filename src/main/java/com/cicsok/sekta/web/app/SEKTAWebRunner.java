package com.cicsok.sekta.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cicsok.sekta")
public class SEKTAWebRunner {

    public static void main(final String[] args) {
        SpringApplication.run(SEKTAWebRunner.class, args);
    }
}
