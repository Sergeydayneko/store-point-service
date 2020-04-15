package ru.dayneko.model.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Builder
@Data
public class CourierDto {

    private long personalId;

    private String courierName;

    private Set<String> managedAddresses;

    @Builder.Default
    private boolean isAvailable = true;
}
