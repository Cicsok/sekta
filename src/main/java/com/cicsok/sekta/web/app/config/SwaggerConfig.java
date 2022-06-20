package com.cicsok.sekta.web.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class SwaggerConfig {

    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cicsok.sekta.web.rest.controller"))
                .paths(PathSelectors.ant("/sekta/api/*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("SEKTA REST API")
                .description("SEKTA API reference for developers")
                .version("1.0").build();
    }
}
