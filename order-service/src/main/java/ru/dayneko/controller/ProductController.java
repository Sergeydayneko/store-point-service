package ru.dayneko.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.dayneko.model.SumOrder;
import ru.dayneko.repository.OrderRepository;


@RestController
@RequiredArgsConstructor
public class ProductController {
    private final OrderRepository orderRepository;

    @GetMapping("/product")
    public Mono<String> getProduct() {
        return Mono.justOrEmpty("Hello");
    }

    @GetMapping("/prod")
    public Mono<SumOrder> getOrder() {
        return Mono.just(new SumOrder("test"))
                .flatMap(orderRepository::save)
                .switchIfEmpty(Mono.justOrEmpty(new SumOrder("kek"))); // для nullable(аналог defaultIfEmpty)
    }

    @GetMapping("/prods")
    public Flux<SumOrder> getAllOrders() {
        return orderRepository.findAll();
    }
}
