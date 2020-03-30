package ru.dayneko.storepointservice.util;

import ru.dayneko.storepointservice.model.dto.BrandDto;
import ru.dayneko.storepointservice.model.dto.ProductDto;
import ru.dayneko.storepointservice.model.dto.StorePointDto;
import ru.dayneko.storepointservice.model.dto.TypeDto;
import ru.dayneko.storepointservice.model.entity.BrandEntity;
import ru.dayneko.storepointservice.model.entity.ProductEntity;
import ru.dayneko.storepointservice.model.entity.StorePointEntity;
import ru.dayneko.storepointservice.model.entity.TypeEntity;

import javax.validation.constraints.NotNull;

public class DTOUtils {

    private DTOUtils() {
        throw new IllegalStateException("UTIL class not for initializing");
    }

    public static StorePointDto convertStorePointDto(@NotNull StorePointEntity storePointEntity) {
        return new StorePointDto().setStorePointId(storePointEntity.getStorePointId())
                .setStorePointName(storePointEntity.getStorePointName())
                .setAddress(storePointEntity.getAddress());
    }

    public static BrandDto convertToBrandDto(@NotNull BrandEntity brandEntity) {
        return new BrandDto().setBrandId(brandEntity.getBrandId())
                .setBrandName(brandEntity.getBrandName());
    }

    public static TypeDto convertToTypeDto(@NotNull TypeEntity typeEntity) {
        return new TypeDto(typeEntity.getTypeId(), typeEntity.getTypeName());
    }

    public static ProductDto convertToProductDto(@NotNull ProductEntity productEntity) {
        BrandDto brandDto = convertToBrandDto(productEntity.getBrandEntity());

        TypeDto typeDto = convertToTypeDto(productEntity.getTypeEntity());

        return new ProductDto().setBrandDto(brandDto)
                .setTypeDto(typeDto)
                .setProductId(productEntity.getProductId())
                .setProductName(productEntity.getProductName());
    }
}
