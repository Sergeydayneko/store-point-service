package ru.dayneko.storepointservice.model.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "address")
public class AddressEntity {

    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @Column(name = "street_name")
    @NotNull
    @Size(min = 1, max = 50)
    private String streetName;

    @Column(name = "street_number")
    @NotNull
    private int number;

//    @OneToOne(mappedBy = "addressEntity", cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY, optional = false)
//    @JsonIgnore
//    private StorePointEntityService storePointEntity;
}
