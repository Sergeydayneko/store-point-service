package ru.dayneko.storepointservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dayneko.storepointservice.model.entity.TypeEntity;

public interface TypeEntityRepository extends JpaRepository<TypeEntity, Long> {
}
