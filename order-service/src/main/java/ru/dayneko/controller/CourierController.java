package ru.dayneko.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ru.dayneko.model.dto.CourierDto;
import ru.dayneko.service.CourierService;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class CourierController {

    private final CourierService courierService;

    @GetMapping("/couriers")
    public Flux<CourierDto> getAllCourirs() {
        return courierService.getAllCouriers();
    }
}
