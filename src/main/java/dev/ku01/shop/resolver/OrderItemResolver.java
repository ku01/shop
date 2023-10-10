package dev.ku01.shop.resolver;

import dev.ku01.shop.model.Item;
import dev.ku01.shop.model.OrderItem;
import graphql.kickstart.tools.GraphQLResolver;
import org.jooq.DSLContext;

import java.util.List;

import static dev.ku01.shop.db.public_.Tables.ITEM;
import static dev.ku01.shop.db.public_.Tables.ORDER_ITEM;

public class OrderItemResolver implements GraphQLResolver<OrderItem> {
    private final DSLContext dsl;

    public OrderItemResolver(DSLContext dsl) {
        this.dsl = dsl;
    }

    public List<OrderItem> findOrderItems() {
        return dsl.select(ORDER_ITEM.ORDER_ID,
                        ORDER_ITEM.QUANTITY,
                        ORDER_ITEM.AMOUNT,
                        ITEM.ID,
                        ITEM.SKU,
                        ITEM.DESCRIPTION,
                        ITEM.PRICE)
                .from(ORDER_ITEM)
                .join(ITEM).on(ORDER_ITEM.ITEM_ID.eq(ITEM.ID))
                .orderBy(ORDER_ITEM.ORDER_ID, ORDER_ITEM.ITEM_ID)
                .fetch()
                .map(i -> new OrderItem(
                        i.get(ORDER_ITEM.ORDER_ID),
                        i.get(ORDER_ITEM.QUANTITY),
                        i.get(ORDER_ITEM.AMOUNT),
                        new Item(
                                i.get(ITEM.ID),
                                i.get(ITEM.SKU),
                                i.get(ITEM.DESCRIPTION),
                                i.get(ITEM.PRICE)
                        )
                ));
    }
}
