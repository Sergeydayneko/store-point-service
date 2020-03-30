package ru.dayneko.storepointservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dayneko.storepointservice.model.entity.ProductEntity;

public interface ProductEntityRepository extends JpaRepository<ProductEntity, Long> {
}
