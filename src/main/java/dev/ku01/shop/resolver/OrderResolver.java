package dev.ku01.shop.resolver;

import dev.ku01.shop.model.Item;
import dev.ku01.shop.model.Order;
import dev.ku01.shop.model.OrderItem;
import dev.ku01.shop.model.User;
import graphql.kickstart.tools.GraphQLResolver;
import org.jooq.DSLContext;

import java.util.List;

import static dev.ku01.shop.db.public_.Tables.*;
import static dev.ku01.shop.db.public_.tables.Order.ORDER;

public class OrderResolver implements GraphQLResolver<Order> {
    private final DSLContext dsl;

    public OrderResolver(DSLContext dsl) {
        this.dsl = dsl;
    }

    public List<Order> findOrders(String country) {
        var select = dsl.select(ORDER.ID,
                        ORDER.TOTAL,
                        USER.ID,
                        USER.NAME,
                        USER.EMAIL,
                        USER.COUNTRY,
                        ORDER_ITEM.QUANTITY,
                        ORDER_ITEM.AMOUNT,
                        ITEM.ID,
                        ITEM.SKU,
                        ITEM.DESCRIPTION,
                        ITEM.PRICE)
                .from(ORDER)
                .join(USER).on(ORDER.USER_ID.eq(USER.ID))
                .join(ORDER_ITEM).on(ORDER.ID.eq(ORDER_ITEM.ORDER_ID))
                .join(ITEM).on(ITEM.ID.eq(ORDER_ITEM.ITEM_ID));
        var result = (country != null ? select.where(USER.COUNTRY.eq(country)) : select)
                .orderBy(ORDER.ID, ORDER_ITEM.ITEM_ID)
                .fetchGroups(ORDER);

        return result.keySet().stream().map(order -> {
            var rows = result.get(order);
            var firstRow = rows.stream().findFirst().orElseThrow();
            return new Order(order.getId(),
                    new User(
                            firstRow.get(USER.ID),
                            firstRow.get(USER.NAME),
                            firstRow.get(USER.EMAIL),
                            firstRow.get(USER.COUNTRY)
                    ),
                    order.getTotal(),
                    rows.stream().map(i -> new OrderItem(
                            i.get(ORDER.ID),
                            i.get(ORDER_ITEM.QUANTITY),
                            i.get(ORDER_ITEM.AMOUNT),
                            new Item(
                                    i.get(ITEM.ID),
                                    i.get(ITEM.SKU),
                                    i.get(ITEM.DESCRIPTION),
                                    i.get(ITEM.PRICE)
                            )
                    )).toList()
            );
        }).toList();
    }
}
