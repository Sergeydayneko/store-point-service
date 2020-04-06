package ru.dayneko.storepointservice.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Type")
@EqualsAndHashCode(exclude = {"productEntities"})
public class TypeEntity {

    @Id
    @Column(name = "type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeId;

    @Column(name = "type_name")
    private String typeName;

    @ToString.Exclude
    @OneToMany(mappedBy = "typeEntity")
    @JsonBackReference
    private List<ProductEntity> productEntities;
}
