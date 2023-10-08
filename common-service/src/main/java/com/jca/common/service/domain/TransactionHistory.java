package com.jca.common.service.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class TransactionHistory extends  Base {
    private Product product;
    private Customer customer;
    private Payment payment;
}
