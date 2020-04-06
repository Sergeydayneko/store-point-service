package ru.dayneko.storepointservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ProductDto {

    private Long productId;

    private String productName;

    private TypeDto typeDto;

    private BrandDto brandDto;

}
