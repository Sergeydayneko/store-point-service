package ru.dayneko.util;

import ru.dayneko.model.entity.CourierEntity;
import ru.dayneko.model.dto.CourierDto;

import javax.validation.constraints.NotNull;

public class DTOUtils {
    private DTOUtils() {
        throw new IllegalStateException("UTIL class not for initializing");
    }

    public static CourierDto convertCourierEntityToDto(@NotNull CourierEntity courierEntity) {
        return CourierDto.builder()
                .personalId(courierEntity.getPersonalId())
                .courierName(courierEntity.getCourierName())
                .isAvailable(courierEntity.isAvailable())
                .managedAddresses(courierEntity.getManagedAddresses())
                .build();
    }

    public static CourierEntity convertCourierDtoToEntity(@NotNull CourierDto courierDto) {
        return CourierEntity.builder()
                .personalId(courierDto.getPersonalId())
                .courierName(courierDto.getCourierName())
                .managedAddresses(courierDto.getManagedAddresses())
                .isAvailable(courierDto.isAvailable())
                .build();
    }
}
