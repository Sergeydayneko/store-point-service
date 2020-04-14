package ru.dayneko.model.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@Document("courier")
public class CourierEntity {

    @MongoId
    private String courierId;

    @Field("courierName")
    @NotNull
    private String courierName;

    @Field("managedAddresses")
    @NotNull
    @NotEmpty
    private Set<String> managedAddresses;

    @Field("isAvailable")
    @NotNull
    private boolean isAvailable;
}
