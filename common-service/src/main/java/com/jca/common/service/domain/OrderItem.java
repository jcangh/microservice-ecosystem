package com.jca.common.service.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class OrderItem extends Base {

    private Product product;
    private int quantity;
    private Double total;
}
