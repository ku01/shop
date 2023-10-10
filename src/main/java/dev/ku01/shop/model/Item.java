package dev.ku01.shop.model;

import java.math.BigDecimal;

public record Item(
        long id,
        String sku,
        String description,
        BigDecimal price
) {
}
