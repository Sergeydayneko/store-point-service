package ru.dayneko.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import ru.dayneko.model.SumOrder;

public interface OrderRepository extends ReactiveMongoRepository<SumOrder, String> {
}
