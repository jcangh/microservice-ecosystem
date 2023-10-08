package com.jca.common.service.domain;

import com.jca.common.service.domain.enums.PaymentMethod;
import com.jca.common.service.domain.enums.PaymentStatus;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@SuperBuilder
public class Payment extends Base {

    private String customerId;
    private Double price;
    private PaymentMethod paymentMethod;
    private PaymentStatus paymentStatus;
    private LocalDate dateProcess;
}
