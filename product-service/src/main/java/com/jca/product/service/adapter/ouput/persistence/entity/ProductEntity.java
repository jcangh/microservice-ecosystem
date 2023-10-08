package com.jca.product.service.adapter.ouput.persistence.entity;

import com.jca.common.service.domain.enums.BaseStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    private String id;
    private String name;
    private Double price;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;

    @PrePersist
    public void beforeCreate() {
        setId(UUID.randomUUID().toString());
    }

}
