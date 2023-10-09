/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.PgTablespaceDatabases;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTablespaceDatabasesRecord extends TableRecordImpl<PgTablespaceDatabasesRecord> implements Record1<Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>pg_catalog.pg_tablespace_databases.pg_tablespace_databases</code>.
     */
    public void setPgTablespaceDatabases(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_tablespace_databases.pg_tablespace_databases</code>.
     */
    public Long getPgTablespaceDatabases() {
        return (Long) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<Long> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgTablespaceDatabases.PG_TABLESPACE_DATABASES.PG_TABLESPACE_DATABASES_;
    }

    @Override
    public Long component1() {
        return getPgTablespaceDatabases();
    }

    @Override
    public Long value1() {
        return getPgTablespaceDatabases();
    }

    @Override
    public PgTablespaceDatabasesRecord value1(Long value) {
        setPgTablespaceDatabases(value);
        return this;
    }

    @Override
    public PgTablespaceDatabasesRecord values(Long value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgTablespaceDatabasesRecord
     */
    public PgTablespaceDatabasesRecord() {
        super(PgTablespaceDatabases.PG_TABLESPACE_DATABASES);
    }

    /**
     * Create a detached, initialised PgTablespaceDatabasesRecord
     */
    public PgTablespaceDatabasesRecord(Long pgTablespaceDatabases) {
        super(PgTablespaceDatabases.PG_TABLESPACE_DATABASES);

        setPgTablespaceDatabases(pgTablespaceDatabases);
        resetChangedOnNotNull();
    }
}
