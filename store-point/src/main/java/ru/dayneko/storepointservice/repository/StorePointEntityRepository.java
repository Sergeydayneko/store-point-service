package ru.dayneko.storepointservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dayneko.storepointservice.model.entity.StorePointEntity;

public interface StorePointEntityRepository extends JpaRepository<StorePointEntity, Long> {
}
