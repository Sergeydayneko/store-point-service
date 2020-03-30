package ru.dayneko.storepointservice.model.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "store_point")
public class StorePointEntity {

    @Id
    @Column(name = "store_point_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storePointId;

    @Column(name = "store_point_name")
    @Size(min = 1, max = 100)
    @NotNull
    private String storePointName;

    @OneToOne
    @JoinColumn(name = "store_point_address_id")
    private AddressEntity address;
}
