package ru.dayneko.storepointservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import ru.dayneko.storepointservice.model.entity.AddressEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class StorePointDto {

    private Long storePointId;

    private String storePointName;

    private AddressEntity address;
}
