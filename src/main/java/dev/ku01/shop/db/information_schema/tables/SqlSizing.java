/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.information_schema.tables;


import dev.ku01.shop.db.information_schema.InformationSchema;
import dev.ku01.shop.db.information_schema.tables.records.SqlSizingRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
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
public class SqlSizing extends TableImpl<SqlSizingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.sql_sizing</code>
     */
    public static final SqlSizing SQL_SIZING = new SqlSizing();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SqlSizingRecord> getRecordType() {
        return SqlSizingRecord.class;
    }

    /**
     * The column <code>information_schema.sql_sizing.sizing_id</code>.
     */
    public final TableField<SqlSizingRecord, Integer> SIZING_ID = createField(DSL.name("sizing_id"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.sql_sizing.sizing_name</code>.
     */
    public final TableField<SqlSizingRecord, String> SIZING_NAME = createField(DSL.name("sizing_name"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.sql_sizing.supported_value</code>.
     */
    public final TableField<SqlSizingRecord, Integer> SUPPORTED_VALUE = createField(DSL.name("supported_value"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.sql_sizing.comments</code>.
     */
    public final TableField<SqlSizingRecord, String> COMMENTS = createField(DSL.name("comments"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    private SqlSizing(Name alias, Table<SqlSizingRecord> aliased) {
        this(alias, aliased, null);
    }

    private SqlSizing(Name alias, Table<SqlSizingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.sql_sizing</code> table
     * reference
     */
    public SqlSizing(String alias) {
        this(DSL.name(alias), SQL_SIZING);
    }

    /**
     * Create an aliased <code>information_schema.sql_sizing</code> table
     * reference
     */
    public SqlSizing(Name alias) {
        this(alias, SQL_SIZING);
    }

    /**
     * Create a <code>information_schema.sql_sizing</code> table reference
     */
    public SqlSizing() {
        this(DSL.name("sql_sizing"), null);
    }

    public <O extends Record> SqlSizing(Table<O> child, ForeignKey<O, SqlSizingRecord> key) {
        super(child, key, SQL_SIZING);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public SqlSizing as(String alias) {
        return new SqlSizing(DSL.name(alias), this);
    }

    @Override
    public SqlSizing as(Name alias) {
        return new SqlSizing(alias, this);
    }

    @Override
    public SqlSizing as(Table<?> alias) {
        return new SqlSizing(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlSizing rename(String name) {
        return new SqlSizing(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlSizing rename(Name name) {
        return new SqlSizing(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlSizing rename(Table<?> name) {
        return new SqlSizing(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super String, ? super Integer, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super String, ? super Integer, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
