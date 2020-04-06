package ru.dayneko.storepointservice.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Entity
@Table(name = "brand")
@EqualsAndHashCode(exclude = {"productEntities"})
public class BrandEntity {

    @Id
    @Column(name = "brand_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long brandId;

    @Column(name = "brand_name")
    @Size(min = 1, max = 50)
    @NotNull
    private String brandName;

    @ToString.Exclude
    @OneToMany(mappedBy = "brandEntity")
    @JsonBackReference
    private List<ProductEntity> productEntities;
}
