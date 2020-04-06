package ru.dayneko.storepointservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dayneko.storepointservice.model.dto.StorePointDto;
import ru.dayneko.storepointservice.repository.StorePointEntityRepository;
import ru.dayneko.storepointservice.service.StorePointEntityService;
import ru.dayneko.storepointservice.util.DTOUtils;

import javax.persistence.EntityNotFoundException;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StorePointEntityImpl implements StorePointEntityService {

    private final StorePointEntityRepository storePointEntityRepository;

    @Override
    public StorePointDto getStorePointById(long id) {
        return storePointEntityRepository.findById(id)
                .map(DTOUtils::convertStorePointDto)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Set<StorePointDto> getAllStorePoints() {
        return storePointEntityRepository.findAll()
                .stream()
                .map(DTOUtils::convertStorePointDto)
                .collect(Collectors.toSet());
    }
}
