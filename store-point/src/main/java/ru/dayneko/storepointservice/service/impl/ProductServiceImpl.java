package ru.dayneko.storepointservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dayneko.storepointservice.model.dto.ProductDto;
import ru.dayneko.storepointservice.repository.ProductEntityRepository;
import ru.dayneko.storepointservice.service.ProductService;
import ru.dayneko.storepointservice.util.DTOUtils;

import javax.persistence.EntityNotFoundException;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductEntityRepository productEntityRepository;

    @Override
    public ProductDto getProductById(long productId) {
        return productEntityRepository.findById(productId)
                .map(DTOUtils::convertToProductDto)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Set<ProductDto> getAllProducts() {
        return productEntityRepository.findAll()
                .stream()
                .map(DTOUtils::convertToProductDto)
                .collect(Collectors.toSet());
    }
}
