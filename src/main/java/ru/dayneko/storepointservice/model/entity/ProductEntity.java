package ru.dayneko.storepointservice.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "product")
@Data
public class ProductEntity {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name = "product_name")
    @Size(min = 1, max = 100)
    private String productName;

    @ManyToOne(optional = false)
    @JoinColumn(name = "product_type", nullable = false, insertable = false, updatable = false)
    @JsonManagedReference
    private TypeEntity typeEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "product_brand")
    @JsonManagedReference
    private BrandEntity brandEntity;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "linked_store_product",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "store_id")

    )
    public Set<AddressEntity> addressEntities;
}
