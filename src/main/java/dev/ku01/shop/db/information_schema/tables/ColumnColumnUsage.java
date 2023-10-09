/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.information_schema.tables;


import dev.ku01.shop.db.information_schema.InformationSchema;
import dev.ku01.shop.db.information_schema.tables.records.ColumnColumnUsageRecord;

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
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnColumnUsage extends TableImpl<ColumnColumnUsageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.column_column_usage</code>
     */
    public static final ColumnColumnUsage COLUMN_COLUMN_USAGE = new ColumnColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ColumnColumnUsageRecord> getRecordType() {
        return ColumnColumnUsageRecord.class;
    }

    /**
     * The column
     * <code>information_schema.column_column_usage.table_catalog</code>.
     */
    public final TableField<ColumnColumnUsageRecord, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_column_usage.table_schema</code>.
     */
    public final TableField<ColumnColumnUsageRecord, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_column_usage.table_name</code>.
     */
    public final TableField<ColumnColumnUsageRecord, String> TABLE_NAME = createField(DSL.name("table_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_column_usage.column_name</code>.
     */
    public final TableField<ColumnColumnUsageRecord, String> COLUMN_NAME = createField(DSL.name("column_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.column_column_usage.dependent_column</code>.
     */
    public final TableField<ColumnColumnUsageRecord, String> DEPENDENT_COLUMN = createField(DSL.name("dependent_column"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ColumnColumnUsage(Name alias, Table<ColumnColumnUsageRecord> aliased) {
        this(alias, aliased, null);
    }

    private ColumnColumnUsage(Name alias, Table<ColumnColumnUsageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "column_column_usage" as  SELECT DISTINCT (current_database())::information_schema.sql_identifier AS table_catalog,
          (n.nspname)::information_schema.sql_identifier AS table_schema,
          (c.relname)::information_schema.sql_identifier AS table_name,
          (ac.attname)::information_schema.sql_identifier AS column_name,
          (ad.attname)::information_schema.sql_identifier AS dependent_column
         FROM pg_namespace n,
          pg_class c,
          pg_depend d,
          pg_attribute ac,
          pg_attribute ad,
          pg_attrdef atd
        WHERE ((n.oid = c.relnamespace) AND (c.oid = ac.attrelid) AND (c.oid = ad.attrelid) AND (ac.attnum <> ad.attnum) AND (ad.attrelid = atd.adrelid) AND (ad.attnum = atd.adnum) AND (d.classid = ('pg_attrdef'::regclass)::oid) AND (d.refclassid = ('pg_class'::regclass)::oid) AND (d.objid = atd.oid) AND (d.refobjid = ac.attrelid) AND (d.refobjsubid = ac.attnum) AND (ad.attgenerated <> ''::"char") AND pg_has_role(c.relowner, 'USAGE'::text));
        """));
    }

    /**
     * Create an aliased <code>information_schema.column_column_usage</code>
     * table reference
     */
    public ColumnColumnUsage(String alias) {
        this(DSL.name(alias), COLUMN_COLUMN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.column_column_usage</code>
     * table reference
     */
    public ColumnColumnUsage(Name alias) {
        this(alias, COLUMN_COLUMN_USAGE);
    }

    /**
     * Create a <code>information_schema.column_column_usage</code> table
     * reference
     */
    public ColumnColumnUsage() {
        this(DSL.name("column_column_usage"), null);
    }

    public <O extends Record> ColumnColumnUsage(Table<O> child, ForeignKey<O, ColumnColumnUsageRecord> key) {
        super(child, key, COLUMN_COLUMN_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ColumnColumnUsage as(String alias) {
        return new ColumnColumnUsage(DSL.name(alias), this);
    }

    @Override
    public ColumnColumnUsage as(Name alias) {
        return new ColumnColumnUsage(alias, this);
    }

    @Override
    public ColumnColumnUsage as(Table<?> alias) {
        return new ColumnColumnUsage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnColumnUsage rename(String name) {
        return new ColumnColumnUsage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnColumnUsage rename(Name name) {
        return new ColumnColumnUsage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ColumnColumnUsage rename(Table<?> name) {
        return new ColumnColumnUsage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
