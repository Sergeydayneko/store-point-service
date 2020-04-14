package ru.dayneko.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;
import ru.dayneko.model.entity.CourierEntity;

public interface CourierRepository extends ReactiveMongoRepository<CourierEntity, String> {

    Mono<CourierEntity> deleteByCourierName(String courierName);
}
