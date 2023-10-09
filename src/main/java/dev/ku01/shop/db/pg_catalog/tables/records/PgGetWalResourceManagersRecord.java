/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.PgGetWalResourceManagers;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgGetWalResourceManagersRecord extends TableRecordImpl<PgGetWalResourceManagersRecord> implements Record3<Integer, String, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_get_wal_resource_managers.rm_id</code>.
     */
    public void setRmId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_wal_resource_managers.rm_id</code>.
     */
    public Integer getRmId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_wal_resource_managers.rm_name</code>.
     */
    public void setRmName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_wal_resource_managers.rm_name</code>.
     */
    public String getRmName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_get_wal_resource_managers.rm_builtin</code>.
     */
    public void setRmBuiltin(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_get_wal_resource_managers.rm_builtin</code>.
     */
    public Boolean getRmBuiltin() {
        return (Boolean) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Boolean> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, Boolean> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PgGetWalResourceManagers.PG_GET_WAL_RESOURCE_MANAGERS.RM_ID;
    }

    @Override
    public Field<String> field2() {
        return PgGetWalResourceManagers.PG_GET_WAL_RESOURCE_MANAGERS.RM_NAME;
    }

    @Override
    public Field<Boolean> field3() {
        return PgGetWalResourceManagers.PG_GET_WAL_RESOURCE_MANAGERS.RM_BUILTIN;
    }

    @Override
    public Integer component1() {
        return getRmId();
    }

    @Override
    public String component2() {
        return getRmName();
    }

    @Override
    public Boolean component3() {
        return getRmBuiltin();
    }

    @Override
    public Integer value1() {
        return getRmId();
    }

    @Override
    public String value2() {
        return getRmName();
    }

    @Override
    public Boolean value3() {
        return getRmBuiltin();
    }

    @Override
    public PgGetWalResourceManagersRecord value1(Integer value) {
        setRmId(value);
        return this;
    }

    @Override
    public PgGetWalResourceManagersRecord value2(String value) {
        setRmName(value);
        return this;
    }

    @Override
    public PgGetWalResourceManagersRecord value3(Boolean value) {
        setRmBuiltin(value);
        return this;
    }

    @Override
    public PgGetWalResourceManagersRecord values(Integer value1, String value2, Boolean value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgGetWalResourceManagersRecord
     */
    public PgGetWalResourceManagersRecord() {
        super(PgGetWalResourceManagers.PG_GET_WAL_RESOURCE_MANAGERS);
    }

    /**
     * Create a detached, initialised PgGetWalResourceManagersRecord
     */
    public PgGetWalResourceManagersRecord(Integer rmId, String rmName, Boolean rmBuiltin) {
        super(PgGetWalResourceManagers.PG_GET_WAL_RESOURCE_MANAGERS);

        setRmId(rmId);
        setRmName(rmName);
        setRmBuiltin(rmBuiltin);
        resetChangedOnNotNull();
    }
}