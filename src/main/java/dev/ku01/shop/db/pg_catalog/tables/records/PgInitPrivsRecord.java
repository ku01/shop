/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.PgInitPrivs;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgInitPrivsRecord extends UpdatableRecordImpl<PgInitPrivsRecord> implements Record5<Long, Long, Integer, String, String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_init_privs.objoid</code>.
     */
    public void setObjoid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_init_privs.objoid</code>.
     */
    public Long getObjoid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_init_privs.classoid</code>.
     */
    public void setClassoid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_init_privs.classoid</code>.
     */
    public Long getClassoid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_init_privs.objsubid</code>.
     */
    public void setObjsubid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_init_privs.objsubid</code>.
     */
    public Integer getObjsubid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_init_privs.privtype</code>.
     */
    public void setPrivtype(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_init_privs.privtype</code>.
     */
    public String getPrivtype() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_init_privs.initprivs</code>.
     */
    public void setInitprivs(String[] value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_init_privs.initprivs</code>.
     */
    public String[] getInitprivs() {
        return (String[]) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<Long, Long, Integer> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, Integer, String, String[]> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, Long, Integer, String, String[]> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgInitPrivs.PG_INIT_PRIVS.OBJOID;
    }

    @Override
    public Field<Long> field2() {
        return PgInitPrivs.PG_INIT_PRIVS.CLASSOID;
    }

    @Override
    public Field<Integer> field3() {
        return PgInitPrivs.PG_INIT_PRIVS.OBJSUBID;
    }

    @Override
    public Field<String> field4() {
        return PgInitPrivs.PG_INIT_PRIVS.PRIVTYPE;
    }

    @Override
    public Field<String[]> field5() {
        return PgInitPrivs.PG_INIT_PRIVS.INITPRIVS;
    }

    @Override
    public Long component1() {
        return getObjoid();
    }

    @Override
    public Long component2() {
        return getClassoid();
    }

    @Override
    public Integer component3() {
        return getObjsubid();
    }

    @Override
    public String component4() {
        return getPrivtype();
    }

    @Override
    public String[] component5() {
        return getInitprivs();
    }

    @Override
    public Long value1() {
        return getObjoid();
    }

    @Override
    public Long value2() {
        return getClassoid();
    }

    @Override
    public Integer value3() {
        return getObjsubid();
    }

    @Override
    public String value4() {
        return getPrivtype();
    }

    @Override
    public String[] value5() {
        return getInitprivs();
    }

    @Override
    public PgInitPrivsRecord value1(Long value) {
        setObjoid(value);
        return this;
    }

    @Override
    public PgInitPrivsRecord value2(Long value) {
        setClassoid(value);
        return this;
    }

    @Override
    public PgInitPrivsRecord value3(Integer value) {
        setObjsubid(value);
        return this;
    }

    @Override
    public PgInitPrivsRecord value4(String value) {
        setPrivtype(value);
        return this;
    }

    @Override
    public PgInitPrivsRecord value5(String[] value) {
        setInitprivs(value);
        return this;
    }

    @Override
    public PgInitPrivsRecord values(Long value1, Long value2, Integer value3, String value4, String[] value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgInitPrivsRecord
     */
    public PgInitPrivsRecord() {
        super(PgInitPrivs.PG_INIT_PRIVS);
    }

    /**
     * Create a detached, initialised PgInitPrivsRecord
     */
    public PgInitPrivsRecord(Long objoid, Long classoid, Integer objsubid, String privtype, String[] initprivs) {
        super(PgInitPrivs.PG_INIT_PRIVS);

        setObjoid(objoid);
        setClassoid(classoid);
        setObjsubid(objsubid);
        setPrivtype(privtype);
        setInitprivs(initprivs);
        resetChangedOnNotNull();
    }
}
