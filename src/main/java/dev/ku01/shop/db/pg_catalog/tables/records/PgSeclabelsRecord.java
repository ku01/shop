/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.PgSeclabels;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSeclabelsRecord extends TableRecordImpl<PgSeclabelsRecord> implements Record8<Long, Long, Integer, String, Long, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_seclabels.objoid</code>.
     */
    public void setObjoid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.objoid</code>.
     */
    public Long getObjoid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabels.classoid</code>.
     */
    public void setClassoid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.classoid</code>.
     */
    public Long getClassoid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabels.objsubid</code>.
     */
    public void setObjsubid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.objsubid</code>.
     */
    public Integer getObjsubid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabels.objtype</code>.
     */
    public void setObjtype(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.objtype</code>.
     */
    public String getObjtype() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabels.objnamespace</code>.
     */
    public void setObjnamespace(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.objnamespace</code>.
     */
    public Long getObjnamespace() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabels.objname</code>.
     */
    public void setObjname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.objname</code>.
     */
    public String getObjname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabels.provider</code>.
     */
    public void setProvider(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.provider</code>.
     */
    public String getProvider() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabels.label</code>.
     */
    public void setLabel(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabels.label</code>.
     */
    public String getLabel() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, Integer, String, Long, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, Long, Integer, String, Long, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgSeclabels.PG_SECLABELS.OBJOID;
    }

    @Override
    public Field<Long> field2() {
        return PgSeclabels.PG_SECLABELS.CLASSOID;
    }

    @Override
    public Field<Integer> field3() {
        return PgSeclabels.PG_SECLABELS.OBJSUBID;
    }

    @Override
    public Field<String> field4() {
        return PgSeclabels.PG_SECLABELS.OBJTYPE;
    }

    @Override
    public Field<Long> field5() {
        return PgSeclabels.PG_SECLABELS.OBJNAMESPACE;
    }

    @Override
    public Field<String> field6() {
        return PgSeclabels.PG_SECLABELS.OBJNAME;
    }

    @Override
    public Field<String> field7() {
        return PgSeclabels.PG_SECLABELS.PROVIDER;
    }

    @Override
    public Field<String> field8() {
        return PgSeclabels.PG_SECLABELS.LABEL;
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
        return getObjtype();
    }

    @Override
    public Long component5() {
        return getObjnamespace();
    }

    @Override
    public String component6() {
        return getObjname();
    }

    @Override
    public String component7() {
        return getProvider();
    }

    @Override
    public String component8() {
        return getLabel();
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
        return getObjtype();
    }

    @Override
    public Long value5() {
        return getObjnamespace();
    }

    @Override
    public String value6() {
        return getObjname();
    }

    @Override
    public String value7() {
        return getProvider();
    }

    @Override
    public String value8() {
        return getLabel();
    }

    @Override
    public PgSeclabelsRecord value1(Long value) {
        setObjoid(value);
        return this;
    }

    @Override
    public PgSeclabelsRecord value2(Long value) {
        setClassoid(value);
        return this;
    }

    @Override
    public PgSeclabelsRecord value3(Integer value) {
        setObjsubid(value);
        return this;
    }

    @Override
    public PgSeclabelsRecord value4(String value) {
        setObjtype(value);
        return this;
    }

    @Override
    public PgSeclabelsRecord value5(Long value) {
        setObjnamespace(value);
        return this;
    }

    @Override
    public PgSeclabelsRecord value6(String value) {
        setObjname(value);
        return this;
    }

    @Override
    public PgSeclabelsRecord value7(String value) {
        setProvider(value);
        return this;
    }

    @Override
    public PgSeclabelsRecord value8(String value) {
        setLabel(value);
        return this;
    }

    @Override
    public PgSeclabelsRecord values(Long value1, Long value2, Integer value3, String value4, Long value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgSeclabelsRecord
     */
    public PgSeclabelsRecord() {
        super(PgSeclabels.PG_SECLABELS);
    }

    /**
     * Create a detached, initialised PgSeclabelsRecord
     */
    public PgSeclabelsRecord(Long objoid, Long classoid, Integer objsubid, String objtype, Long objnamespace, String objname, String provider, String label) {
        super(PgSeclabels.PG_SECLABELS);

        setObjoid(objoid);
        setClassoid(classoid);
        setObjsubid(objsubid);
        setObjtype(objtype);
        setObjnamespace(objnamespace);
        setObjname(objname);
        setProvider(provider);
        setLabel(label);
        resetChangedOnNotNull();
    }
}
