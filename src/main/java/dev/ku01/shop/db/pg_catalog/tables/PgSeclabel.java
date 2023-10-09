/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables;


import dev.ku01.shop.db.pg_catalog.Keys;
import dev.ku01.shop.db.pg_catalog.PgCatalog;
import dev.ku01.shop.db.pg_catalog.tables.records.PgSeclabelRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
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
public class PgSeclabel extends TableImpl<PgSeclabelRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_seclabel</code>
     */
    public static final PgSeclabel PG_SECLABEL = new PgSeclabel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgSeclabelRecord> getRecordType() {
        return PgSeclabelRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_seclabel.objoid</code>.
     */
    public final TableField<PgSeclabelRecord, Long> OBJOID = createField(DSL.name("objoid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_seclabel.classoid</code>.
     */
    public final TableField<PgSeclabelRecord, Long> CLASSOID = createField(DSL.name("classoid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_seclabel.objsubid</code>.
     */
    public final TableField<PgSeclabelRecord, Integer> OBJSUBID = createField(DSL.name("objsubid"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_seclabel.provider</code>.
     */
    public final TableField<PgSeclabelRecord, String> PROVIDER = createField(DSL.name("provider"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_seclabel.label</code>.
     */
    public final TableField<PgSeclabelRecord, String> LABEL = createField(DSL.name("label"), SQLDataType.CLOB.nullable(false), this, "");

    private PgSeclabel(Name alias, Table<PgSeclabelRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgSeclabel(Name alias, Table<PgSeclabelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_seclabel</code> table reference
     */
    public PgSeclabel(String alias) {
        this(DSL.name(alias), PG_SECLABEL);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_seclabel</code> table reference
     */
    public PgSeclabel(Name alias) {
        this(alias, PG_SECLABEL);
    }

    /**
     * Create a <code>pg_catalog.pg_seclabel</code> table reference
     */
    public PgSeclabel() {
        this(DSL.name("pg_seclabel"), null);
    }

    public <O extends Record> PgSeclabel(Table<O> child, ForeignKey<O, PgSeclabelRecord> key) {
        super(child, key, PG_SECLABEL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgSeclabelRecord> getPrimaryKey() {
        return Keys.PG_SECLABEL_OBJECT_INDEX;
    }

    @Override
    public PgSeclabel as(String alias) {
        return new PgSeclabel(DSL.name(alias), this);
    }

    @Override
    public PgSeclabel as(Name alias) {
        return new PgSeclabel(alias, this);
    }

    @Override
    public PgSeclabel as(Table<?> alias) {
        return new PgSeclabel(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSeclabel rename(String name) {
        return new PgSeclabel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSeclabel rename(Name name) {
        return new PgSeclabel(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSeclabel rename(Table<?> name) {
        return new PgSeclabel(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, Integer, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Long, ? super Long, ? super Integer, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Long, ? super Long, ? super Integer, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
