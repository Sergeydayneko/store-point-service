package ru.dayneko.storepointservice.service;

import ru.dayneko.storepointservice.model.dto.BrandDto;

import java.util.Set;

public interface BrandService {

    BrandDto getBrandById(long brandId);
    Set<BrandDto> getAllBrands();
}
