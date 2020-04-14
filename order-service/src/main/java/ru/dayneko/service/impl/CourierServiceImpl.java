package ru.dayneko.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import ru.dayneko.model.dto.CourierDto;
import ru.dayneko.repository.CourierRepository;
import ru.dayneko.service.CourierService;
import ru.dayneko.util.DTOUtils;

@RequiredArgsConstructor
@Service
public class CourierServiceImpl implements CourierService {

    private final CourierRepository courierRepository;

    @Override
    public Flux<CourierDto> getAllCouriers() {
        return courierRepository.findAll().map(DTOUtils::convertCourierEntityToDto);
    }

    @Override
    public Flux<CourierDto> getAllCouriersWithFreeState() {
        return null;
    }
}
