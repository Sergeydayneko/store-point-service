package ru.dayneko.storepointservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.dayneko.storepointservice.model.dto.BrandDto;
import ru.dayneko.storepointservice.service.BrandService;

import javax.validation.constraints.NotNull;
import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store")
public class BrandController {

    private final BrandService brandService;

    @GetMapping("/brand")
    public BrandDto getBrandById(@NotNull @RequestParam(name = "brandId") Long brandId) {
        return brandService.getBrandById(brandId);
    }

    @GetMapping("/brands")
    public Set<BrandDto> getAllBrands() {
        return brandService.getAllBrands();
    }
}

