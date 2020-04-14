package ru.dayneko.util;

import ru.dayneko.model.entity.CourierEntity;
import ru.dayneko.model.dto.CourierDto;

public class DTOUtils {
    private DTOUtils() {
        throw new IllegalStateException("UTIL class not for initializing");
    }

    public static CourierDto convertCourierEntityToDto(CourierEntity courierEntity) {
        return CourierDto.builder()
                .courierName(courierEntity.getCourierName())
                .isAvailable(courierEntity.isAvailable())
                .managedAddresses(courierEntity.getManagedAddresses())
                .build();
    }
}
