package ru.dayneko.model.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Builder
@Data
public class CourierDto {

    private String courierName;

    private Set<String> managedAddresses;

    private boolean isAvailable;
}
