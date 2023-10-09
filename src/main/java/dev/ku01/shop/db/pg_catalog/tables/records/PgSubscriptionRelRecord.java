/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.PgSubscriptionRel;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSubscriptionRelRecord extends UpdatableRecordImpl<PgSubscriptionRelRecord> implements Record4<Long, Long, String, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_subscription_rel.srsubid</code>.
     */
    public void setSrsubid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_subscription_rel.srsubid</code>.
     */
    public Long getSrsubid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_subscription_rel.srrelid</code>.
     */
    public void setSrrelid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_subscription_rel.srrelid</code>.
     */
    public Long getSrrelid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_subscription_rel.srsubstate</code>.
     */
    public void setSrsubstate(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_subscription_rel.srsubstate</code>.
     */
    public String getSrsubstate() {
        return (String) get(2);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setSrsublsn(Object value) {
        set(3, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getSrsublsn() {
        return get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, String, Object> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, Long, String, Object> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgSubscriptionRel.PG_SUBSCRIPTION_REL.SRSUBID;
    }

    @Override
    public Field<Long> field2() {
        return PgSubscriptionRel.PG_SUBSCRIPTION_REL.SRRELID;
    }

    @Override
    public Field<String> field3() {
        return PgSubscriptionRel.PG_SUBSCRIPTION_REL.SRSUBSTATE;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field4() {
        return PgSubscriptionRel.PG_SUBSCRIPTION_REL.SRSUBLSN;
    }

    @Override
    public Long component1() {
        return getSrsubid();
    }

    @Override
    public Long component2() {
        return getSrrelid();
    }

    @Override
    public String component3() {
        return getSrsubstate();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object component4() {
        return getSrsublsn();
    }

    @Override
    public Long value1() {
        return getSrsubid();
    }

    @Override
    public Long value2() {
        return getSrrelid();
    }

    @Override
    public String value3() {
        return getSrsubstate();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object value4() {
        return getSrsublsn();
    }

    @Override
    public PgSubscriptionRelRecord value1(Long value) {
        setSrsubid(value);
        return this;
    }

    @Override
    public PgSubscriptionRelRecord value2(Long value) {
        setSrrelid(value);
        return this;
    }

    @Override
    public PgSubscriptionRelRecord value3(String value) {
        setSrsubstate(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public PgSubscriptionRelRecord value4(Object value) {
        setSrsublsn(value);
        return this;
    }

    @Override
    public PgSubscriptionRelRecord values(Long value1, Long value2, String value3, Object value4) {
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
     * Create a detached PgSubscriptionRelRecord
     */
    public PgSubscriptionRelRecord() {
        super(PgSubscriptionRel.PG_SUBSCRIPTION_REL);
    }

    /**
     * Create a detached, initialised PgSubscriptionRelRecord
     */
    public PgSubscriptionRelRecord(Long srsubid, Long srrelid, String srsubstate, Object srsublsn) {
        super(PgSubscriptionRel.PG_SUBSCRIPTION_REL);

        setSrsubid(srsubid);
        setSrrelid(srrelid);
        setSrsubstate(srsubstate);
        setSrsublsn(srsublsn);
        resetChangedOnNotNull();
    }
}
