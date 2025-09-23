package com.coding.exercise.bankapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class ApplicationConfig {

    /**
     * OpenAPI configuration replacing legacy Springfox Swagger.
     * Exposes Swagger UI at /swagger-ui.html and OpenAPI spec at /v3/api-docs.
     */
    @Bean
    public OpenAPI bankAppOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("BANKING APPLICATION REST API")
                .description("API for Banking Application.")
                .version("1.0.0"))
            .externalDocs(new ExternalDocumentation()
                .description("H2 Console")
                .url("/bank-api/h2-console"));
    }
}
