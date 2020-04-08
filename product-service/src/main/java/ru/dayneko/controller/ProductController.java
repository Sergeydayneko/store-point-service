package ru.dayneko.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
public class ProductController {

    @GetMapping("/product")
    public Mono<String> getProduct() {
        return Mono.justOrEmpty("Hello");
    }
}
