package dev.ku01.shop.model;

import java.math.BigDecimal;

public record OrderItem(
        int orderId,
        int quantity,
        BigDecimal amount,
        Item item
) {
}
