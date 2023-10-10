package dev.ku01.shop.query;

import dev.ku01.shop.model.Order;
import dev.ku01.shop.model.OrderItem;
import dev.ku01.shop.resolver.OrderItemResolver;
import dev.ku01.shop.resolver.OrderResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;

import java.util.List;

public class Query implements GraphQLQueryResolver {
    private final OrderResolver orderResolver;
    private final OrderItemResolver orderItemResolver;

    public Query(OrderResolver orderResolver, OrderItemResolver orderItemResolver) {
        this.orderResolver = orderResolver;
        this.orderItemResolver = orderItemResolver;
    }

    public List<Order> getOrders(String country) {
        return orderResolver.findOrders(country);
    }

    public List<OrderItem> getOrderItems() {
        return orderItemResolver.findOrderItems();
    }
}
