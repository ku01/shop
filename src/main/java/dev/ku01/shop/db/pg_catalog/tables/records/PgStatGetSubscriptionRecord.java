/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.PgStatGetSubscription;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatGetSubscriptionRecord extends TableRecordImpl<PgStatGetSubscriptionRecord> implements Record9<Long, Long, Integer, Integer, Object, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_get_subscription.subid</code>.
     */
    public void setSubid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_subscription.subid</code>.
     */
    public Long getSubid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_subscription.relid</code>.
     */
    public void setRelid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_subscription.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_subscription.pid</code>.
     */
    public void setPid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_subscription.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_subscription.leader_pid</code>.
     */
    public void setLeaderPid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_subscription.leader_pid</code>.
     */
    public Integer getLeaderPid() {
        return (Integer) get(3);
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
    public void setReceivedLsn(Object value) {
        set(4, value);
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
    public Object getReceivedLsn() {
        return get(4);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_get_subscription.last_msg_send_time</code>.
     */
    public void setLastMsgSendTime(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_get_subscription.last_msg_send_time</code>.
     */
    public OffsetDateTime getLastMsgSendTime() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_get_subscription.last_msg_receipt_time</code>.
     */
    public void setLastMsgReceiptTime(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_get_subscription.last_msg_receipt_time</code>.
     */
    public OffsetDateTime getLastMsgReceiptTime() {
        return (OffsetDateTime) get(6);
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
    public void setLatestEndLsn(Object value) {
        set(7, value);
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
    public Object getLatestEndLsn() {
        return get(7);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_get_subscription.latest_end_time</code>.
     */
    public void setLatestEndTime(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_get_subscription.latest_end_time</code>.
     */
    public OffsetDateTime getLatestEndTime() {
        return (OffsetDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, Integer, Integer, Object, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Long, Integer, Integer, Object, OffsetDateTime, OffsetDateTime, Object, OffsetDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgStatGetSubscription.PG_STAT_GET_SUBSCRIPTION.SUBID;
    }

    @Override
    public Field<Long> field2() {
        return PgStatGetSubscription.PG_STAT_GET_SUBSCRIPTION.RELID;
    }

    @Override
    public Field<Integer> field3() {
        return PgStatGetSubscription.PG_STAT_GET_SUBSCRIPTION.PID;
    }

    @Override
    public Field<Integer> field4() {
        return PgStatGetSubscription.PG_STAT_GET_SUBSCRIPTION.LEADER_PID;
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
    public Field<Object> field5() {
        return PgStatGetSubscription.PG_STAT_GET_SUBSCRIPTION.RECEIVED_LSN;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return PgStatGetSubscription.PG_STAT_GET_SUBSCRIPTION.LAST_MSG_SEND_TIME;
    }

    @Override
    public Field<OffsetDateTime> field7() {
        return PgStatGetSubscription.PG_STAT_GET_SUBSCRIPTION.LAST_MSG_RECEIPT_TIME;
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
    public Field<Object> field8() {
        return PgStatGetSubscription.PG_STAT_GET_SUBSCRIPTION.LATEST_END_LSN;
    }

    @Override
    public Field<OffsetDateTime> field9() {
        return PgStatGetSubscription.PG_STAT_GET_SUBSCRIPTION.LATEST_END_TIME;
    }

    @Override
    public Long component1() {
        return getSubid();
    }

    @Override
    public Long component2() {
        return getRelid();
    }

    @Override
    public Integer component3() {
        return getPid();
    }

    @Override
    public Integer component4() {
        return getLeaderPid();
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
    public Object component5() {
        return getReceivedLsn();
    }

    @Override
    public OffsetDateTime component6() {
        return getLastMsgSendTime();
    }

    @Override
    public OffsetDateTime component7() {
        return getLastMsgReceiptTime();
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
    public Object component8() {
        return getLatestEndLsn();
    }

    @Override
    public OffsetDateTime component9() {
        return getLatestEndTime();
    }

    @Override
    public Long value1() {
        return getSubid();
    }

    @Override
    public Long value2() {
        return getRelid();
    }

    @Override
    public Integer value3() {
        return getPid();
    }

    @Override
    public Integer value4() {
        return getLeaderPid();
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
    public Object value5() {
        return getReceivedLsn();
    }

    @Override
    public OffsetDateTime value6() {
        return getLastMsgSendTime();
    }

    @Override
    public OffsetDateTime value7() {
        return getLastMsgReceiptTime();
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
    public Object value8() {
        return getLatestEndLsn();
    }

    @Override
    public OffsetDateTime value9() {
        return getLatestEndTime();
    }

    @Override
    public PgStatGetSubscriptionRecord value1(Long value) {
        setSubid(value);
        return this;
    }

    @Override
    public PgStatGetSubscriptionRecord value2(Long value) {
        setRelid(value);
        return this;
    }

    @Override
    public PgStatGetSubscriptionRecord value3(Integer value) {
        setPid(value);
        return this;
    }

    @Override
    public PgStatGetSubscriptionRecord value4(Integer value) {
        setLeaderPid(value);
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
    public PgStatGetSubscriptionRecord value5(Object value) {
        setReceivedLsn(value);
        return this;
    }

    @Override
    public PgStatGetSubscriptionRecord value6(OffsetDateTime value) {
        setLastMsgSendTime(value);
        return this;
    }

    @Override
    public PgStatGetSubscriptionRecord value7(OffsetDateTime value) {
        setLastMsgReceiptTime(value);
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
    public PgStatGetSubscriptionRecord value8(Object value) {
        setLatestEndLsn(value);
        return this;
    }

    @Override
    public PgStatGetSubscriptionRecord value9(OffsetDateTime value) {
        setLatestEndTime(value);
        return this;
    }

    @Override
    public PgStatGetSubscriptionRecord values(Long value1, Long value2, Integer value3, Integer value4, Object value5, OffsetDateTime value6, OffsetDateTime value7, Object value8, OffsetDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatGetSubscriptionRecord
     */
    public PgStatGetSubscriptionRecord() {
        super(PgStatGetSubscription.PG_STAT_GET_SUBSCRIPTION);
    }

    /**
     * Create a detached, initialised PgStatGetSubscriptionRecord
     */
    public PgStatGetSubscriptionRecord(Long subid, Long relid, Integer pid, Integer leaderPid, Object receivedLsn, OffsetDateTime lastMsgSendTime, OffsetDateTime lastMsgReceiptTime, Object latestEndLsn, OffsetDateTime latestEndTime) {
        super(PgStatGetSubscription.PG_STAT_GET_SUBSCRIPTION);

        setSubid(subid);
        setRelid(relid);
        setPid(pid);
        setLeaderPid(leaderPid);
        setReceivedLsn(receivedLsn);
        setLastMsgSendTime(lastMsgSendTime);
        setLastMsgReceiptTime(lastMsgReceiptTime);
        setLatestEndLsn(latestEndLsn);
        setLatestEndTime(latestEndTime);
        resetChangedOnNotNull();
    }
}
