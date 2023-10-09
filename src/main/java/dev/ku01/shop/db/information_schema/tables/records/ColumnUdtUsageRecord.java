/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.information_schema.tables.records;


import dev.ku01.shop.db.information_schema.tables.ColumnUdtUsage;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnUdtUsageRecord extends TableRecordImpl<ColumnUdtUsageRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.column_udt_usage.udt_catalog</code>.
     */
    public void setUdtCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.column_udt_usage.udt_catalog</code>.
     */
    public String getUdtCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.column_udt_usage.udt_schema</code>.
     */
    public void setUdtSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.column_udt_usage.udt_schema</code>.
     */
    public String getUdtSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.column_udt_usage.udt_name</code>.
     */
    public void setUdtName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.column_udt_usage.udt_name</code>.
     */
    public String getUdtName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.column_udt_usage.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.column_udt_usage.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.column_udt_usage.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.column_udt_usage.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.column_udt_usage.table_name</code>.
     */
    public void setTableName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.column_udt_usage.table_name</code>.
     */
    public String getTableName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.column_udt_usage.column_name</code>.
     */
    public void setColumnName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.column_udt_usage.column_name</code>.
     */
    public String getColumnName() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ColumnUdtUsage.COLUMN_UDT_USAGE.UDT_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return ColumnUdtUsage.COLUMN_UDT_USAGE.UDT_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return ColumnUdtUsage.COLUMN_UDT_USAGE.UDT_NAME;
    }

    @Override
    public Field<String> field4() {
        return ColumnUdtUsage.COLUMN_UDT_USAGE.TABLE_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return ColumnUdtUsage.COLUMN_UDT_USAGE.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return ColumnUdtUsage.COLUMN_UDT_USAGE.TABLE_NAME;
    }

    @Override
    public Field<String> field7() {
        return ColumnUdtUsage.COLUMN_UDT_USAGE.COLUMN_NAME;
    }

    @Override
    public String component1() {
        return getUdtCatalog();
    }

    @Override
    public String component2() {
        return getUdtSchema();
    }

    @Override
    public String component3() {
        return getUdtName();
    }

    @Override
    public String component4() {
        return getTableCatalog();
    }

    @Override
    public String component5() {
        return getTableSchema();
    }

    @Override
    public String component6() {
        return getTableName();
    }

    @Override
    public String component7() {
        return getColumnName();
    }

    @Override
    public String value1() {
        return getUdtCatalog();
    }

    @Override
    public String value2() {
        return getUdtSchema();
    }

    @Override
    public String value3() {
        return getUdtName();
    }

    @Override
    public String value4() {
        return getTableCatalog();
    }

    @Override
    public String value5() {
        return getTableSchema();
    }

    @Override
    public String value6() {
        return getTableName();
    }

    @Override
    public String value7() {
        return getColumnName();
    }

    @Override
    public ColumnUdtUsageRecord value1(String value) {
        setUdtCatalog(value);
        return this;
    }

    @Override
    public ColumnUdtUsageRecord value2(String value) {
        setUdtSchema(value);
        return this;
    }

    @Override
    public ColumnUdtUsageRecord value3(String value) {
        setUdtName(value);
        return this;
    }

    @Override
    public ColumnUdtUsageRecord value4(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public ColumnUdtUsageRecord value5(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public ColumnUdtUsageRecord value6(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public ColumnUdtUsageRecord value7(String value) {
        setColumnName(value);
        return this;
    }

    @Override
    public ColumnUdtUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnUdtUsageRecord
     */
    public ColumnUdtUsageRecord() {
        super(ColumnUdtUsage.COLUMN_UDT_USAGE);
    }

    /**
     * Create a detached, initialised ColumnUdtUsageRecord
     */
    public ColumnUdtUsageRecord(String udtCatalog, String udtSchema, String udtName, String tableCatalog, String tableSchema, String tableName, String columnName) {
        super(ColumnUdtUsage.COLUMN_UDT_USAGE);

        setUdtCatalog(udtCatalog);
        setUdtSchema(udtSchema);
        setUdtName(udtName);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        resetChangedOnNotNull();
    }
}
