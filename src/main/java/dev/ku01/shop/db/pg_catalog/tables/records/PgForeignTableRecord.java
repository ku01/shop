/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.PgForeignTable;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgForeignTableRecord extends UpdatableRecordImpl<PgForeignTableRecord> implements Record3<Long, Long, String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_foreign_table.ftrelid</code>.
     */
    public void setFtrelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_table.ftrelid</code>.
     */
    public Long getFtrelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_table.ftserver</code>.
     */
    public void setFtserver(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_table.ftserver</code>.
     */
    public Long getFtserver() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_table.ftoptions</code>.
     */
    public void setFtoptions(String[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_table.ftoptions</code>.
     */
    public String[] getFtoptions() {
        return (String[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, String[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Long, String[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgForeignTable.PG_FOREIGN_TABLE.FTRELID;
    }

    @Override
    public Field<Long> field2() {
        return PgForeignTable.PG_FOREIGN_TABLE.FTSERVER;
    }

    @Override
    public Field<String[]> field3() {
        return PgForeignTable.PG_FOREIGN_TABLE.FTOPTIONS;
    }

    @Override
    public Long component1() {
        return getFtrelid();
    }

    @Override
    public Long component2() {
        return getFtserver();
    }

    @Override
    public String[] component3() {
        return getFtoptions();
    }

    @Override
    public Long value1() {
        return getFtrelid();
    }

    @Override
    public Long value2() {
        return getFtserver();
    }

    @Override
    public String[] value3() {
        return getFtoptions();
    }

    @Override
    public PgForeignTableRecord value1(Long value) {
        setFtrelid(value);
        return this;
    }

    @Override
    public PgForeignTableRecord value2(Long value) {
        setFtserver(value);
        return this;
    }

    @Override
    public PgForeignTableRecord value3(String[] value) {
        setFtoptions(value);
        return this;
    }

    @Override
    public PgForeignTableRecord values(Long value1, Long value2, String[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgForeignTableRecord
     */
    public PgForeignTableRecord() {
        super(PgForeignTable.PG_FOREIGN_TABLE);
    }

    /**
     * Create a detached, initialised PgForeignTableRecord
     */
    public PgForeignTableRecord(Long ftrelid, Long ftserver, String[] ftoptions) {
        super(PgForeignTable.PG_FOREIGN_TABLE);

        setFtrelid(ftrelid);
        setFtserver(ftserver);
        setFtoptions(ftoptions);
        resetChangedOnNotNull();
    }
}
