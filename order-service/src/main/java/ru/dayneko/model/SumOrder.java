package ru.dayneko.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("sumOrder")
@Data
public class SumOrder {

    @Id
    private String id;

    @NonNull
    private String name;
}
