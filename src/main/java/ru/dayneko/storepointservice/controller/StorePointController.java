package ru.dayneko.storepointservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dayneko.storepointservice.model.dto.StorePointDto;
import ru.dayneko.storepointservice.service.StorePointEntityService;

import java.util.Set;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StorePointController {

    private final StorePointEntityService storePointEntityService;


    @GetMapping("/point")
    public StorePointDto getStorePointById(@RequestAttribute long storePointId) {
        return storePointEntityService.getStorePointById(storePointId);
    }

    @GetMapping("/points")
    public Set<StorePointDto> getAllStorePoints() {
        return storePointEntityService.getAllStorePoints();
    }
}
