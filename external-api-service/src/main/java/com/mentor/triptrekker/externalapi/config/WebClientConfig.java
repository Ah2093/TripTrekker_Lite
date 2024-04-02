package com.mentor.triptrekker.externalapi.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl("test.api.amadeus.com/v2")
                // move them to the app config, and use env var
                .defaultHeader(HttpHeaders.AUTHORIZATION, "Bearer " + "WaH23cjdMnErK0IqovM19CxPrSXduMsP" + ":" + "ptxT5PaUgBxTb0lG")
                .build();
    }
}
