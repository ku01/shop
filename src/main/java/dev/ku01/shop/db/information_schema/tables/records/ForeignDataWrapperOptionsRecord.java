/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.information_schema.tables.records;


import dev.ku01.shop.db.information_schema.tables.ForeignDataWrapperOptions;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ForeignDataWrapperOptionsRecord extends TableRecordImpl<ForeignDataWrapperOptionsRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.foreign_data_wrapper_options.foreign_data_wrapper_catalog</code>.
     */
    public void setForeignDataWrapperCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_data_wrapper_options.foreign_data_wrapper_catalog</code>.
     */
    public String getForeignDataWrapperCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_data_wrapper_options.foreign_data_wrapper_name</code>.
     */
    public void setForeignDataWrapperName(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_data_wrapper_options.foreign_data_wrapper_name</code>.
     */
    public String getForeignDataWrapperName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_data_wrapper_options.option_name</code>.
     */
    public void setOptionName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_data_wrapper_options.option_name</code>.
     */
    public String getOptionName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.foreign_data_wrapper_options.option_value</code>.
     */
    public void setOptionValue(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.foreign_data_wrapper_options.option_value</code>.
     */
    public String getOptionValue() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS.FOREIGN_DATA_WRAPPER_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS.FOREIGN_DATA_WRAPPER_NAME;
    }

    @Override
    public Field<String> field3() {
        return ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS.OPTION_NAME;
    }

    @Override
    public Field<String> field4() {
        return ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS.OPTION_VALUE;
    }

    @Override
    public String component1() {
        return getForeignDataWrapperCatalog();
    }

    @Override
    public String component2() {
        return getForeignDataWrapperName();
    }

    @Override
    public String component3() {
        return getOptionName();
    }

    @Override
    public String component4() {
        return getOptionValue();
    }

    @Override
    public String value1() {
        return getForeignDataWrapperCatalog();
    }

    @Override
    public String value2() {
        return getForeignDataWrapperName();
    }

    @Override
    public String value3() {
        return getOptionName();
    }

    @Override
    public String value4() {
        return getOptionValue();
    }

    @Override
    public ForeignDataWrapperOptionsRecord value1(String value) {
        setForeignDataWrapperCatalog(value);
        return this;
    }

    @Override
    public ForeignDataWrapperOptionsRecord value2(String value) {
        setForeignDataWrapperName(value);
        return this;
    }

    @Override
    public ForeignDataWrapperOptionsRecord value3(String value) {
        setOptionName(value);
        return this;
    }

    @Override
    public ForeignDataWrapperOptionsRecord value4(String value) {
        setOptionValue(value);
        return this;
    }

    @Override
    public ForeignDataWrapperOptionsRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ForeignDataWrapperOptionsRecord
     */
    public ForeignDataWrapperOptionsRecord() {
        super(ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS);
    }

    /**
     * Create a detached, initialised ForeignDataWrapperOptionsRecord
     */
    public ForeignDataWrapperOptionsRecord(String foreignDataWrapperCatalog, String foreignDataWrapperName, String optionName, String optionValue) {
        super(ForeignDataWrapperOptions.FOREIGN_DATA_WRAPPER_OPTIONS);

        setForeignDataWrapperCatalog(foreignDataWrapperCatalog);
        setForeignDataWrapperName(foreignDataWrapperName);
        setOptionName(optionName);
        setOptionValue(optionValue);
        resetChangedOnNotNull();
    }
}
