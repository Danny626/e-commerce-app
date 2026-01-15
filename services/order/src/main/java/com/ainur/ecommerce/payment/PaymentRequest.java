package com.ainur.ecommerce.payment;

import com.ainur.ecommerce.customer.CustomerResponse;
import com.ainur.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
