package ru.dayneko.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.dayneko.model.dto.CourierDto;
import ru.dayneko.model.entity.CourierEntity;
import ru.dayneko.repository.CourierRepository;
import ru.dayneko.service.CourierService;
import ru.dayneko.util.DTOUtils;

@RequiredArgsConstructor
@Service
@Slf4j
public class CourierServiceImpl implements CourierService {

    private final CourierRepository courierRepository;
    private final ReactiveMongoTemplate mongoTemplate;

    @Override
    public Flux<CourierDto> getAllCouriers() {
        return courierRepository.findAll().map(DTOUtils::convertCourierEntityToDto);
    }

    @Override
    public Flux<CourierDto> getAllCouriersWithFreeState() {
        return null;
    }

    @Override
    public Mono<CourierDto> createCourier(CourierDto courierDto) {
        return Mono.just(courierDto)
                .map(DTOUtils::convertCourierDtoToEntity)
                .flatMap(courierRepository::save)
                .map(DTOUtils::convertCourierEntityToDto)
                .doOnError(err -> log.error(err.getMessage()));
    }

    @Override
    public Mono<CourierDto> updateCourier(CourierDto courierDto) {
        Query query = new Query();
        query.addCriteria(Criteria.where("courierName").is(courierDto.getCourierName()));

        Update update = new Update();
        update.set("managedAddresses", courierDto.getManagedAddresses());

        return mongoTemplate
                .findAndModify(query, update, CourierEntity.class)
                .map(DTOUtils::convertCourierEntityToDto);
    }

    @Override
    public Mono<CourierDto> deleteCourier(CourierDto courierDto) {
        return courierRepository
                .deleteByCourierName(courierDto.getCourierName())
                .map(DTOUtils::convertCourierEntityToDto);
    }
}
