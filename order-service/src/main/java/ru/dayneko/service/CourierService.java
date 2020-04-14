package ru.dayneko.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.dayneko.model.dto.CourierDto;

public interface CourierService {

    Flux<CourierDto> getAllCouriers();

    Flux<CourierDto> getAllCouriersWithFreeState();

    Mono<CourierDto> createCourier(CourierDto courierDto);

    Mono<CourierDto> updateCourier(CourierDto courierDto);

    Mono<CourierDto> deleteCourier(CourierDto courierDto);
}
