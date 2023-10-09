/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.PgStatGetIo;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatGetIoRecord extends TableRecordImpl<PgStatGetIoRecord> implements Record18<String, String, String, Long, Double, Long, Double, Long, Double, Long, Double, Long, Long, Long, Long, Long, Double, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.backend_type</code>.
     */
    public void setBackendType(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.backend_type</code>.
     */
    public String getBackendType() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.object</code>.
     */
    public void setObject(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.object</code>.
     */
    public String getObject() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.context</code>.
     */
    public void setContext(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.context</code>.
     */
    public String getContext() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.reads</code>.
     */
    public void setReads(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.reads</code>.
     */
    public Long getReads() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.read_time</code>.
     */
    public void setReadTime(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.read_time</code>.
     */
    public Double getReadTime() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.writes</code>.
     */
    public void setWrites(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.writes</code>.
     */
    public Long getWrites() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.write_time</code>.
     */
    public void setWriteTime(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.write_time</code>.
     */
    public Double getWriteTime() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.writebacks</code>.
     */
    public void setWritebacks(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.writebacks</code>.
     */
    public Long getWritebacks() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.writeback_time</code>.
     */
    public void setWritebackTime(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.writeback_time</code>.
     */
    public Double getWritebackTime() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.extends</code>.
     */
    public void setExtends(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.extends</code>.
     */
    public Long getExtends() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.extend_time</code>.
     */
    public void setExtendTime(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.extend_time</code>.
     */
    public Double getExtendTime() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.op_bytes</code>.
     */
    public void setOpBytes(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.op_bytes</code>.
     */
    public Long getOpBytes() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.hits</code>.
     */
    public void setHits(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.hits</code>.
     */
    public Long getHits() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.evictions</code>.
     */
    public void setEvictions(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.evictions</code>.
     */
    public Long getEvictions() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.reuses</code>.
     */
    public void setReuses(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.reuses</code>.
     */
    public Long getReuses() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.fsyncs</code>.
     */
    public void setFsyncs(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.fsyncs</code>.
     */
    public Long getFsyncs() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.fsync_time</code>.
     */
    public void setFsyncTime(Double value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.fsync_time</code>.
     */
    public Double getFsyncTime() {
        return (Double) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_io.stats_reset</code>.
     */
    public void setStatsReset(OffsetDateTime value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_io.stats_reset</code>.
     */
    public OffsetDateTime getStatsReset() {
        return (OffsetDateTime) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, String, Long, Double, Long, Double, Long, Double, Long, Double, Long, Long, Long, Long, Long, Double, OffsetDateTime> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<String, String, String, Long, Double, Long, Double, Long, Double, Long, Double, Long, Long, Long, Long, Long, Double, OffsetDateTime> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgStatGetIo.PG_STAT_GET_IO.BACKEND_TYPE;
    }

    @Override
    public Field<String> field2() {
        return PgStatGetIo.PG_STAT_GET_IO.OBJECT;
    }

    @Override
    public Field<String> field3() {
        return PgStatGetIo.PG_STAT_GET_IO.CONTEXT;
    }

    @Override
    public Field<Long> field4() {
        return PgStatGetIo.PG_STAT_GET_IO.READS;
    }

    @Override
    public Field<Double> field5() {
        return PgStatGetIo.PG_STAT_GET_IO.READ_TIME;
    }

    @Override
    public Field<Long> field6() {
        return PgStatGetIo.PG_STAT_GET_IO.WRITES;
    }

    @Override
    public Field<Double> field7() {
        return PgStatGetIo.PG_STAT_GET_IO.WRITE_TIME;
    }

    @Override
    public Field<Long> field8() {
        return PgStatGetIo.PG_STAT_GET_IO.WRITEBACKS;
    }

    @Override
    public Field<Double> field9() {
        return PgStatGetIo.PG_STAT_GET_IO.WRITEBACK_TIME;
    }

    @Override
    public Field<Long> field10() {
        return PgStatGetIo.PG_STAT_GET_IO.EXTENDS;
    }

    @Override
    public Field<Double> field11() {
        return PgStatGetIo.PG_STAT_GET_IO.EXTEND_TIME;
    }

    @Override
    public Field<Long> field12() {
        return PgStatGetIo.PG_STAT_GET_IO.OP_BYTES;
    }

    @Override
    public Field<Long> field13() {
        return PgStatGetIo.PG_STAT_GET_IO.HITS;
    }

    @Override
    public Field<Long> field14() {
        return PgStatGetIo.PG_STAT_GET_IO.EVICTIONS;
    }

    @Override
    public Field<Long> field15() {
        return PgStatGetIo.PG_STAT_GET_IO.REUSES;
    }

    @Override
    public Field<Long> field16() {
        return PgStatGetIo.PG_STAT_GET_IO.FSYNCS;
    }

    @Override
    public Field<Double> field17() {
        return PgStatGetIo.PG_STAT_GET_IO.FSYNC_TIME;
    }

    @Override
    public Field<OffsetDateTime> field18() {
        return PgStatGetIo.PG_STAT_GET_IO.STATS_RESET;
    }

    @Override
    public String component1() {
        return getBackendType();
    }

    @Override
    public String component2() {
        return getObject();
    }

    @Override
    public String component3() {
        return getContext();
    }

    @Override
    public Long component4() {
        return getReads();
    }

    @Override
    public Double component5() {
        return getReadTime();
    }

    @Override
    public Long component6() {
        return getWrites();
    }

    @Override
    public Double component7() {
        return getWriteTime();
    }

    @Override
    public Long component8() {
        return getWritebacks();
    }

    @Override
    public Double component9() {
        return getWritebackTime();
    }

    @Override
    public Long component10() {
        return getExtends();
    }

    @Override
    public Double component11() {
        return getExtendTime();
    }

    @Override
    public Long component12() {
        return getOpBytes();
    }

    @Override
    public Long component13() {
        return getHits();
    }

    @Override
    public Long component14() {
        return getEvictions();
    }

    @Override
    public Long component15() {
        return getReuses();
    }

    @Override
    public Long component16() {
        return getFsyncs();
    }

    @Override
    public Double component17() {
        return getFsyncTime();
    }

    @Override
    public OffsetDateTime component18() {
        return getStatsReset();
    }

    @Override
    public String value1() {
        return getBackendType();
    }

    @Override
    public String value2() {
        return getObject();
    }

    @Override
    public String value3() {
        return getContext();
    }

    @Override
    public Long value4() {
        return getReads();
    }

    @Override
    public Double value5() {
        return getReadTime();
    }

    @Override
    public Long value6() {
        return getWrites();
    }

    @Override
    public Double value7() {
        return getWriteTime();
    }

    @Override
    public Long value8() {
        return getWritebacks();
    }

    @Override
    public Double value9() {
        return getWritebackTime();
    }

    @Override
    public Long value10() {
        return getExtends();
    }

    @Override
    public Double value11() {
        return getExtendTime();
    }

    @Override
    public Long value12() {
        return getOpBytes();
    }

    @Override
    public Long value13() {
        return getHits();
    }

    @Override
    public Long value14() {
        return getEvictions();
    }

    @Override
    public Long value15() {
        return getReuses();
    }

    @Override
    public Long value16() {
        return getFsyncs();
    }

    @Override
    public Double value17() {
        return getFsyncTime();
    }

    @Override
    public OffsetDateTime value18() {
        return getStatsReset();
    }

    @Override
    public PgStatGetIoRecord value1(String value) {
        setBackendType(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value2(String value) {
        setObject(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value3(String value) {
        setContext(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value4(Long value) {
        setReads(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value5(Double value) {
        setReadTime(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value6(Long value) {
        setWrites(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value7(Double value) {
        setWriteTime(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value8(Long value) {
        setWritebacks(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value9(Double value) {
        setWritebackTime(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value10(Long value) {
        setExtends(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value11(Double value) {
        setExtendTime(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value12(Long value) {
        setOpBytes(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value13(Long value) {
        setHits(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value14(Long value) {
        setEvictions(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value15(Long value) {
        setReuses(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value16(Long value) {
        setFsyncs(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value17(Double value) {
        setFsyncTime(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord value18(OffsetDateTime value) {
        setStatsReset(value);
        return this;
    }

    @Override
    public PgStatGetIoRecord values(String value1, String value2, String value3, Long value4, Double value5, Long value6, Double value7, Long value8, Double value9, Long value10, Double value11, Long value12, Long value13, Long value14, Long value15, Long value16, Double value17, OffsetDateTime value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatGetIoRecord
     */
    public PgStatGetIoRecord() {
        super(PgStatGetIo.PG_STAT_GET_IO);
    }

    /**
     * Create a detached, initialised PgStatGetIoRecord
     */
    public PgStatGetIoRecord(String backendType, String object, String context, Long reads, Double readTime, Long writes, Double writeTime, Long writebacks, Double writebackTime, Long extends_, Double extendTime, Long opBytes, Long hits, Long evictions, Long reuses, Long fsyncs, Double fsyncTime, OffsetDateTime statsReset) {
        super(PgStatGetIo.PG_STAT_GET_IO);

        setBackendType(backendType);
        setObject(object);
        setContext(context);
        setReads(reads);
        setReadTime(readTime);
        setWrites(writes);
        setWriteTime(writeTime);
        setWritebacks(writebacks);
        setWritebackTime(writebackTime);
        setExtends(extends_);
        setExtendTime(extendTime);
        setOpBytes(opBytes);
        setHits(hits);
        setEvictions(evictions);
        setReuses(reuses);
        setFsyncs(fsyncs);
        setFsyncTime(fsyncTime);
        setStatsReset(statsReset);
        resetChangedOnNotNull();
    }
}
