package ru.dayneko.service;

import reactor.core.publisher.Flux;
import ru.dayneko.model.dto.CourierDto;

public interface CourierService {

    Flux<CourierDto> getAllCouriers();

    Flux<CourierDto> getAllCouriersWithFreeState();
}
