package com.jca.product.service.domain;

import com.jca.common.service.domain.enums.BaseStatus;

public record ProductSearch(String name, Double price, BaseStatus status) {
}
