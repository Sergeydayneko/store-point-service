package ru.dayneko.storepointservice.service;

import ru.dayneko.storepointservice.model.dto.ProductDto;

import java.util.Set;

public interface ProductService {

    ProductDto getProductById(long productId);

    Set<ProductDto> getAllProducts();
}
