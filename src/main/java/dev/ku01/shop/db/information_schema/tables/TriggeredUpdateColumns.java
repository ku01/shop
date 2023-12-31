/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.information_schema.tables;


import dev.ku01.shop.db.information_schema.InformationSchema;
import dev.ku01.shop.db.information_schema.tables.records.TriggeredUpdateColumnsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
public class TriggeredUpdateColumns extends TableImpl<TriggeredUpdateColumnsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.triggered_update_columns</code>
     */
    public static final TriggeredUpdateColumns TRIGGERED_UPDATE_COLUMNS = new TriggeredUpdateColumns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TriggeredUpdateColumnsRecord> getRecordType() {
        return TriggeredUpdateColumnsRecord.class;
    }

    /**
     * The column
     * <code>information_schema.triggered_update_columns.trigger_catalog</code>.
     */
    public final TableField<TriggeredUpdateColumnsRecord, String> TRIGGER_CATALOG = createField(DSL.name("trigger_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.triggered_update_columns.trigger_schema</code>.
     */
    public final TableField<TriggeredUpdateColumnsRecord, String> TRIGGER_SCHEMA = createField(DSL.name("trigger_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.triggered_update_columns.trigger_name</code>.
     */
    public final TableField<TriggeredUpdateColumnsRecord, String> TRIGGER_NAME = createField(DSL.name("trigger_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.triggered_update_columns.event_object_catalog</code>.
     */
    public final TableField<TriggeredUpdateColumnsRecord, String> EVENT_OBJECT_CATALOG = createField(DSL.name("event_object_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.triggered_update_columns.event_object_schema</code>.
     */
    public final TableField<TriggeredUpdateColumnsRecord, String> EVENT_OBJECT_SCHEMA = createField(DSL.name("event_object_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.triggered_update_columns.event_object_table</code>.
     */
    public final TableField<TriggeredUpdateColumnsRecord, String> EVENT_OBJECT_TABLE = createField(DSL.name("event_object_table"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.triggered_update_columns.event_object_column</code>.
     */
    public final TableField<TriggeredUpdateColumnsRecord, String> EVENT_OBJECT_COLUMN = createField(DSL.name("event_object_column"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private TriggeredUpdateColumns(Name alias, Table<TriggeredUpdateColumnsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TriggeredUpdateColumns(Name alias, Table<TriggeredUpdateColumnsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "triggered_update_columns" as  SELECT (current_database())::information_schema.sql_identifier AS trigger_catalog,
          (n.nspname)::information_schema.sql_identifier AS trigger_schema,
          (t.tgname)::information_schema.sql_identifier AS trigger_name,
          (current_database())::information_schema.sql_identifier AS event_object_catalog,
          (n.nspname)::information_schema.sql_identifier AS event_object_schema,
          (c.relname)::information_schema.sql_identifier AS event_object_table,
          (a.attname)::information_schema.sql_identifier AS event_object_column
         FROM pg_namespace n,
          pg_class c,
          pg_trigger t,
          ( SELECT ta0.tgoid,
                  (ta0.tgat).x AS tgattnum,
                  (ta0.tgat).n AS tgattpos
                 FROM ( SELECT pg_trigger.oid AS tgoid,
                          information_schema._pg_expandarray(pg_trigger.tgattr) AS tgat
                         FROM pg_trigger) ta0) ta,
          pg_attribute a
        WHERE ((n.oid = c.relnamespace) AND (c.oid = t.tgrelid) AND (t.oid = ta.tgoid) AND ((a.attrelid = t.tgrelid) AND (a.attnum = ta.tgattnum)) AND (NOT t.tgisinternal) AND (NOT pg_is_other_temp_schema(n.oid)) AND (pg_has_role(c.relowner, 'USAGE'::text) OR has_column_privilege(c.oid, a.attnum, 'INSERT, UPDATE, REFERENCES'::text)));
        """));
    }

    /**
     * Create an aliased
     * <code>information_schema.triggered_update_columns</code> table reference
     */
    public TriggeredUpdateColumns(String alias) {
        this(DSL.name(alias), TRIGGERED_UPDATE_COLUMNS);
    }

    /**
     * Create an aliased
     * <code>information_schema.triggered_update_columns</code> table reference
     */
    public TriggeredUpdateColumns(Name alias) {
        this(alias, TRIGGERED_UPDATE_COLUMNS);
    }

    /**
     * Create a <code>information_schema.triggered_update_columns</code> table
     * reference
     */
    public TriggeredUpdateColumns() {
        this(DSL.name("triggered_update_columns"), null);
    }

    public <O extends Record> TriggeredUpdateColumns(Table<O> child, ForeignKey<O, TriggeredUpdateColumnsRecord> key) {
        super(child, key, TRIGGERED_UPDATE_COLUMNS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public TriggeredUpdateColumns as(String alias) {
        return new TriggeredUpdateColumns(DSL.name(alias), this);
    }

    @Override
    public TriggeredUpdateColumns as(Name alias) {
        return new TriggeredUpdateColumns(alias, this);
    }

    @Override
    public TriggeredUpdateColumns as(Table<?> alias) {
        return new TriggeredUpdateColumns(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TriggeredUpdateColumns rename(String name) {
        return new TriggeredUpdateColumns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TriggeredUpdateColumns rename(Name name) {
        return new TriggeredUpdateColumns(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TriggeredUpdateColumns rename(Table<?> name) {
        return new TriggeredUpdateColumns(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
