package com.ainur.ecommerce.order;

import com.ainur.ecommerce.customer.CustomerClient;
import com.ainur.ecommerce.exception.BusinessException;
import com.ainur.ecommerce.product.ProductClient;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final CustomerClient customerClient;
    private final ProductClient productClient;

    public Integer createOrder(@Valid OrderRequest request) {
        // check the customer --> OpenFeign
        var customer = this.customerClient.findCustomerById(request.customerId())
                .orElseThrow(() -> new BusinessException("Cannot create order:: No customer exists with the provided ID"));

        // purchase the products --> product-ms (RestTemplate)


        // persist order

        // persist order lines

        // start payment process

        // send the order confirmation --> notification-ms (kafka)
        return null;
    }
}
