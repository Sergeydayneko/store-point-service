package ru.dayneko.storepointservice.service;

import ru.dayneko.storepointservice.model.dto.StorePointDto;

import java.util.Set;

public interface StorePointEntityService {

    StorePointDto getStorePointById(long id);

    Set<StorePointDto> getAllStorePoints();
}
