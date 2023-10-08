package com.jca.common.service.domain;

import com.jca.common.service.domain.enums.BaseStatus;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Product extends Base {

    private String name;
    private Double price;
    private BaseStatus status;
}
