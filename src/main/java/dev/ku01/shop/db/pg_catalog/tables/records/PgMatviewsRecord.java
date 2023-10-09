/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.PgMatviews;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgMatviewsRecord extends TableRecordImpl<PgMatviewsRecord> implements Record7<String, String, String, String, Boolean, Boolean, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_matviews.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_matviews.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_matviews.matviewname</code>.
     */
    public void setMatviewname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_matviews.matviewname</code>.
     */
    public String getMatviewname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_matviews.matviewowner</code>.
     */
    public void setMatviewowner(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_matviews.matviewowner</code>.
     */
    public String getMatviewowner() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_matviews.tablespace</code>.
     */
    public void setTablespace(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_matviews.tablespace</code>.
     */
    public String getTablespace() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_matviews.hasindexes</code>.
     */
    public void setHasindexes(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_matviews.hasindexes</code>.
     */
    public Boolean getHasindexes() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_matviews.ispopulated</code>.
     */
    public void setIspopulated(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_matviews.ispopulated</code>.
     */
    public Boolean getIspopulated() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_matviews.definition</code>.
     */
    public void setDefinition(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_matviews.definition</code>.
     */
    public String getDefinition() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, Boolean, Boolean, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, Boolean, Boolean, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgMatviews.PG_MATVIEWS.SCHEMANAME;
    }

    @Override
    public Field<String> field2() {
        return PgMatviews.PG_MATVIEWS.MATVIEWNAME;
    }

    @Override
    public Field<String> field3() {
        return PgMatviews.PG_MATVIEWS.MATVIEWOWNER;
    }

    @Override
    public Field<String> field4() {
        return PgMatviews.PG_MATVIEWS.TABLESPACE;
    }

    @Override
    public Field<Boolean> field5() {
        return PgMatviews.PG_MATVIEWS.HASINDEXES;
    }

    @Override
    public Field<Boolean> field6() {
        return PgMatviews.PG_MATVIEWS.ISPOPULATED;
    }

    @Override
    public Field<String> field7() {
        return PgMatviews.PG_MATVIEWS.DEFINITION;
    }

    @Override
    public String component1() {
        return getSchemaname();
    }

    @Override
    public String component2() {
        return getMatviewname();
    }

    @Override
    public String component3() {
        return getMatviewowner();
    }

    @Override
    public String component4() {
        return getTablespace();
    }

    @Override
    public Boolean component5() {
        return getHasindexes();
    }

    @Override
    public Boolean component6() {
        return getIspopulated();
    }

    @Override
    public String component7() {
        return getDefinition();
    }

    @Override
    public String value1() {
        return getSchemaname();
    }

    @Override
    public String value2() {
        return getMatviewname();
    }

    @Override
    public String value3() {
        return getMatviewowner();
    }

    @Override
    public String value4() {
        return getTablespace();
    }

    @Override
    public Boolean value5() {
        return getHasindexes();
    }

    @Override
    public Boolean value6() {
        return getIspopulated();
    }

    @Override
    public String value7() {
        return getDefinition();
    }

    @Override
    public PgMatviewsRecord value1(String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    public PgMatviewsRecord value2(String value) {
        setMatviewname(value);
        return this;
    }

    @Override
    public PgMatviewsRecord value3(String value) {
        setMatviewowner(value);
        return this;
    }

    @Override
    public PgMatviewsRecord value4(String value) {
        setTablespace(value);
        return this;
    }

    @Override
    public PgMatviewsRecord value5(Boolean value) {
        setHasindexes(value);
        return this;
    }

    @Override
    public PgMatviewsRecord value6(Boolean value) {
        setIspopulated(value);
        return this;
    }

    @Override
    public PgMatviewsRecord value7(String value) {
        setDefinition(value);
        return this;
    }

    @Override
    public PgMatviewsRecord values(String value1, String value2, String value3, String value4, Boolean value5, Boolean value6, String value7) {
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
     * Create a detached PgMatviewsRecord
     */
    public PgMatviewsRecord() {
        super(PgMatviews.PG_MATVIEWS);
    }

    /**
     * Create a detached, initialised PgMatviewsRecord
     */
    public PgMatviewsRecord(String schemaname, String matviewname, String matviewowner, String tablespace, Boolean hasindexes, Boolean ispopulated, String definition) {
        super(PgMatviews.PG_MATVIEWS);

        setSchemaname(schemaname);
        setMatviewname(matviewname);
        setMatviewowner(matviewowner);
        setTablespace(tablespace);
        setHasindexes(hasindexes);
        setIspopulated(ispopulated);
        setDefinition(definition);
        resetChangedOnNotNull();
    }
}
