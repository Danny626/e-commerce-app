package com.ainur.ecommerce.kafka.order;

import com.ainur.ecommerce.kafka.payment.PaymentMethod;

import java.math.BigDecimal;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        Customer customer,
        List<Product> products
) {
}
