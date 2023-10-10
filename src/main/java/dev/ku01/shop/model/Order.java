package dev.ku01.shop.model;

import java.math.BigDecimal;
import java.util.List;

public record Order(
        long id,
        User user,
        BigDecimal total,
        List<OrderItem> orderItems
) {
}
