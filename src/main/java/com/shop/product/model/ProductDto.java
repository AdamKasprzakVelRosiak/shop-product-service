package com.shop.product.model;

import com.shop.product.ProductType;

import java.math.BigDecimal;

public record ProductDto(
        Long id,
        String name,
        String description,
        BigDecimal price,
        ProductType type,
        String brand,
        String model,
        Boolean isAvailable
) {
}
