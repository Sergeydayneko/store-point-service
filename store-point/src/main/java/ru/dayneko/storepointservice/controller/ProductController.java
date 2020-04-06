package ru.dayneko.storepointservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.dayneko.storepointservice.model.dto.ProductDto;
import ru.dayneko.storepointservice.service.ProductService;

import javax.validation.constraints.NotNull;
import java.util.Set;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product")
    public ProductDto getProductById(@NotNull @RequestParam("productId") long productId) {
        return productService.getProductById(productId);
    }

    @GetMapping("/products")
    public Set<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }
}
