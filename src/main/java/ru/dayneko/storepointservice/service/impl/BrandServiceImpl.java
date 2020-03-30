package ru.dayneko.storepointservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dayneko.storepointservice.model.dto.BrandDto;
import ru.dayneko.storepointservice.repository.BrandEntityRepository;
import ru.dayneko.storepointservice.service.BrandService;
import ru.dayneko.storepointservice.util.DTOUtils;

import javax.persistence.EntityNotFoundException;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {

    private final BrandEntityRepository brandEntityRepository;

    @Override
    @Transactional(readOnly = true)
    public BrandDto getBrandById(long brandId) {
        return brandEntityRepository.findById(brandId)
                .map(DTOUtils::convertToBrandDto)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    @Transactional(readOnly = true)
    public Set<BrandDto> getAllBrands() {
        return brandEntityRepository.findAll()
                .stream()
                .map(DTOUtils::convertToBrandDto)
                .collect(Collectors.toSet());
    }
}
