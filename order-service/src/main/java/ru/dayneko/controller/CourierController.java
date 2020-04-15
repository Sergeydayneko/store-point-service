package ru.dayneko.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.dayneko.model.dto.CourierDto;
import ru.dayneko.service.CourierService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class CourierController {

    private final CourierService courierService;

    @GetMapping("/couriers")
    public Flux<CourierDto> getAllCourirs() {
        return courierService.getAllCouriers();
    }

    @PostMapping("/courier")
    public Mono<CourierDto> createCourier(@RequestBody @NotNull @Valid CourierDto courierDto) {
        return courierService.createCourier(courierDto);
    }

    @PutMapping("/courier")
    public Mono<CourierDto> updateCourierByPersonalId(@RequestBody @NotNull @Valid CourierDto courierDto) {
        return courierService.updateCourierByPersonalId(courierDto);
    }

    @DeleteMapping("/courier/{courierId}")
    public Mono<Long> deleteCourierByPersonalId(@PathVariable(name = "courierId") Long courierId) {
        return courierService.deleteCourierByPersonalId(courierId);
    }
}
