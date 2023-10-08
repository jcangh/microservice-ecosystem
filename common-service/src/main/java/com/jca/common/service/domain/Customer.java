package com.jca.common.service.domain;

import com.jca.common.service.domain.enums.BaseStatus;
import com.jca.common.service.domain.enums.Domain;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Customer extends Base {

    private String name;
    private Domain domain;
    private BaseStatus status;
}
