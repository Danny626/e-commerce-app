package com.ainur.ecommerce.kafka;

import com.ainur.ecommerce.customer.CustomerResponse;
import com.ainur.ecommerce.order.PaymentMethod;
import com.ainur.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
