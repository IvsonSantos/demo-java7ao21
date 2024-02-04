package com.example.demojava7ao21.junit5;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Collections;

class WebTest {

    @org.junit.jupiter.api.Test
    public void givenPrototypeScope_whenSetNames_thenDifferentNames() {

        WebClient client = WebClient.builder()
                .baseUrl("http://localhost:8080")
                .defaultCookie("cookieKey", "cookieValue")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultUriVariables(Collections.singletonMap("url", "http://localhost:8080"))
                .build();

        WebClient.UriSpec<WebClient.RequestBodySpec> uriSpec = client.post();

        WebClient.RequestBodySpec bodySpec = uriSpec.uri(URI.create("/resource"));

    }

}
