package com.appskimo.app.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.Arrays;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;

@Component
public class UserHandler {

    public Mono<ServerResponse> users(ServerRequest request) {
        return ServerResponse.ok()
            .contentType(APPLICATION_JSON_UTF8)
            .body(
                BodyInserters.fromObject(
                    Arrays.asList(1, 2, 3, 4, 5)
                )
            );
    }

}
