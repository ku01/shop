/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.public_.tables;


import dev.ku01.shop.db.public_.Keys;
import dev.ku01.shop.db.public_.Public;
import dev.ku01.shop.db.public_.tables.records.ItemRecord;

import java.math.BigDecimal;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Item extends TableImpl<ItemRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.item</code>
     */
    public static final Item ITEM = new Item();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ItemRecord> getRecordType() {
        return ItemRecord.class;
    }

    /**
     * The column <code>public.item.id</code>.
     */
    public final TableField<ItemRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.item.sku</code>.
     */
    public final TableField<ItemRecord, String> SKU = createField(DSL.name("sku"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.item.description</code>.
     */
    public final TableField<ItemRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.item.price</code>.
     */
    public final TableField<ItemRecord, BigDecimal> PRICE = createField(DSL.name("price"), SQLDataType.NUMERIC(19, 2).nullable(false), this, "");

    private Item(Name alias, Table<ItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private Item(Name alias, Table<ItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.item</code> table reference
     */
    public Item(String alias) {
        this(DSL.name(alias), ITEM);
    }

    /**
     * Create an aliased <code>public.item</code> table reference
     */
    public Item(Name alias) {
        this(alias, ITEM);
    }

    /**
     * Create a <code>public.item</code> table reference
     */
    public Item() {
        this(DSL.name("item"), null);
    }

    public <O extends Record> Item(Table<O> child, ForeignKey<O, ItemRecord> key) {
        super(child, key, ITEM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<ItemRecord, Integer> getIdentity() {
        return (Identity<ItemRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ItemRecord> getPrimaryKey() {
        return Keys.ITEM_ID_PK;
    }

    @Override
    public Item as(String alias) {
        return new Item(DSL.name(alias), this);
    }

    @Override
    public Item as(Name alias) {
        return new Item(alias, this);
    }

    @Override
    public Item as(Table<?> alias) {
        return new Item(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Item rename(String name) {
        return new Item(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Item rename(Name name) {
        return new Item(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Item rename(Table<?> name) {
        return new Item(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, BigDecimal> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super String, ? super String, ? super BigDecimal, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super String, ? super String, ? super BigDecimal, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
