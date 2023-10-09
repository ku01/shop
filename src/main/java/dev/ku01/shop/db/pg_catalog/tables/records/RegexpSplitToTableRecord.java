/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.RegexpSplitToTable;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RegexpSplitToTableRecord extends TableRecordImpl<RegexpSplitToTableRecord> implements Record1<String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>pg_catalog.regexp_split_to_table.regexp_split_to_table</code>.
     */
    public void setRegexpSplitToTable(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.regexp_split_to_table.regexp_split_to_table</code>.
     */
    public String getRegexpSplitToTable() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RegexpSplitToTable.REGEXP_SPLIT_TO_TABLE.REGEXP_SPLIT_TO_TABLE_;
    }

    @Override
    public String component1() {
        return getRegexpSplitToTable();
    }

    @Override
    public String value1() {
        return getRegexpSplitToTable();
    }

    @Override
    public RegexpSplitToTableRecord value1(String value) {
        setRegexpSplitToTable(value);
        return this;
    }

    @Override
    public RegexpSplitToTableRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RegexpSplitToTableRecord
     */
    public RegexpSplitToTableRecord() {
        super(RegexpSplitToTable.REGEXP_SPLIT_TO_TABLE);
    }

    /**
     * Create a detached, initialised RegexpSplitToTableRecord
     */
    public RegexpSplitToTableRecord(String regexpSplitToTable) {
        super(RegexpSplitToTable.REGEXP_SPLIT_TO_TABLE);

        setRegexpSplitToTable(regexpSplitToTable);
        resetChangedOnNotNull();
    }
}
