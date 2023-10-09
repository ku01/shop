/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.public_;


import dev.ku01.shop.db.public_.tables.Item;
import dev.ku01.shop.db.public_.tables.Order;
import dev.ku01.shop.db.public_.tables.OrderItem;
import dev.ku01.shop.db.public_.tables.User;
import dev.ku01.shop.db.public_.tables.records.ItemRecord;
import dev.ku01.shop.db.public_.tables.records.OrderItemRecord;
import dev.ku01.shop.db.public_.tables.records.OrderRecord;
import dev.ku01.shop.db.public_.tables.records.UserRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ItemRecord> ITEM_ID_PK = Internal.createUniqueKey(Item.ITEM, DSL.name("item_id_pk"), new TableField[] { Item.ITEM.ID }, true);
    public static final UniqueKey<OrderRecord> ORDER_ID_PK = Internal.createUniqueKey(Order.ORDER, DSL.name("order_id_pk"), new TableField[] { Order.ORDER.ID }, true);
    public static final UniqueKey<OrderItemRecord> ORDER_ITEM_ORDER_ID_ITEM_ID_PK = Internal.createUniqueKey(OrderItem.ORDER_ITEM, DSL.name("order_item_order_id_item_id_pk"), new TableField[] { OrderItem.ORDER_ITEM.ORDER_ID, OrderItem.ORDER_ITEM.ITEM_ID }, true);
    public static final UniqueKey<UserRecord> USER_ID_PK = Internal.createUniqueKey(User.USER, DSL.name("user_id_pk"), new TableField[] { User.USER.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<OrderRecord, UserRecord> ORDER__ORDER_USER_ID_FK = Internal.createForeignKey(Order.ORDER, DSL.name("order_user_id_fk"), new TableField[] { Order.ORDER.USER_ID }, Keys.USER_ID_PK, new TableField[] { User.USER.ID }, true);
    public static final ForeignKey<OrderItemRecord, ItemRecord> ORDER_ITEM__ORDER_ITEM_ITEM_ID_FK = Internal.createForeignKey(OrderItem.ORDER_ITEM, DSL.name("order_item_item_id_fk"), new TableField[] { OrderItem.ORDER_ITEM.ITEM_ID }, Keys.ITEM_ID_PK, new TableField[] { Item.ITEM.ID }, true);
    public static final ForeignKey<OrderItemRecord, OrderRecord> ORDER_ITEM__ORDER_ITEM_ORDER_ID_FK = Internal.createForeignKey(OrderItem.ORDER_ITEM, DSL.name("order_item_order_id_fk"), new TableField[] { OrderItem.ORDER_ITEM.ORDER_ID }, Keys.ORDER_ID_PK, new TableField[] { Order.ORDER.ID }, true);
}
