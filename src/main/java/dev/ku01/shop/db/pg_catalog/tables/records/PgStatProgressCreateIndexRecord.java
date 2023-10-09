/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.PgStatProgressCreateIndex;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatProgressCreateIndexRecord extends TableRecordImpl<PgStatProgressCreateIndexRecord> implements Record16<Integer, Long, String, Long, Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_create_index.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_create_index.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_create_index.datid</code>.
     */
    public void setDatid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_create_index.datid</code>.
     */
    public Long getDatid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_create_index.datname</code>.
     */
    public void setDatname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_create_index.datname</code>.
     */
    public String getDatname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_create_index.relid</code>.
     */
    public void setRelid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_create_index.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(3);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_create_index.index_relid</code>.
     */
    public void setIndexRelid(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_create_index.index_relid</code>.
     */
    public Long getIndexRelid() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_create_index.command</code>.
     */
    public void setCommand(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_create_index.command</code>.
     */
    public String getCommand() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_create_index.phase</code>.
     */
    public void setPhase(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_create_index.phase</code>.
     */
    public String getPhase() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_create_index.lockers_total</code>.
     */
    public void setLockersTotal(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_create_index.lockers_total</code>.
     */
    public Long getLockersTotal() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_create_index.lockers_done</code>.
     */
    public void setLockersDone(Long value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_create_index.lockers_done</code>.
     */
    public Long getLockersDone() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_create_index.current_locker_pid</code>.
     */
    public void setCurrentLockerPid(Long value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_create_index.current_locker_pid</code>.
     */
    public Long getCurrentLockerPid() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_create_index.blocks_total</code>.
     */
    public void setBlocksTotal(Long value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_create_index.blocks_total</code>.
     */
    public Long getBlocksTotal() {
        return (Long) get(10);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_create_index.blocks_done</code>.
     */
    public void setBlocksDone(Long value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_create_index.blocks_done</code>.
     */
    public Long getBlocksDone() {
        return (Long) get(11);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_create_index.tuples_total</code>.
     */
    public void setTuplesTotal(Long value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_create_index.tuples_total</code>.
     */
    public Long getTuplesTotal() {
        return (Long) get(12);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_create_index.tuples_done</code>.
     */
    public void setTuplesDone(Long value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_create_index.tuples_done</code>.
     */
    public Long getTuplesDone() {
        return (Long) get(13);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_create_index.partitions_total</code>.
     */
    public void setPartitionsTotal(Long value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_create_index.partitions_total</code>.
     */
    public Long getPartitionsTotal() {
        return (Long) get(14);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_create_index.partitions_done</code>.
     */
    public void setPartitionsDone(Long value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_create_index.partitions_done</code>.
     */
    public Long getPartitionsDone() {
        return (Long) get(15);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<Integer, Long, String, Long, Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<Integer, Long, String, Long, Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long, Long> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.PID;
    }

    @Override
    public Field<Long> field2() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.DATID;
    }

    @Override
    public Field<String> field3() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.DATNAME;
    }

    @Override
    public Field<Long> field4() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.RELID;
    }

    @Override
    public Field<Long> field5() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.INDEX_RELID;
    }

    @Override
    public Field<String> field6() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.COMMAND;
    }

    @Override
    public Field<String> field7() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.PHASE;
    }

    @Override
    public Field<Long> field8() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.LOCKERS_TOTAL;
    }

    @Override
    public Field<Long> field9() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.LOCKERS_DONE;
    }

    @Override
    public Field<Long> field10() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.CURRENT_LOCKER_PID;
    }

    @Override
    public Field<Long> field11() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.BLOCKS_TOTAL;
    }

    @Override
    public Field<Long> field12() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.BLOCKS_DONE;
    }

    @Override
    public Field<Long> field13() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.TUPLES_TOTAL;
    }

    @Override
    public Field<Long> field14() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.TUPLES_DONE;
    }

    @Override
    public Field<Long> field15() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.PARTITIONS_TOTAL;
    }

    @Override
    public Field<Long> field16() {
        return PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX.PARTITIONS_DONE;
    }

    @Override
    public Integer component1() {
        return getPid();
    }

    @Override
    public Long component2() {
        return getDatid();
    }

    @Override
    public String component3() {
        return getDatname();
    }

    @Override
    public Long component4() {
        return getRelid();
    }

    @Override
    public Long component5() {
        return getIndexRelid();
    }

    @Override
    public String component6() {
        return getCommand();
    }

    @Override
    public String component7() {
        return getPhase();
    }

    @Override
    public Long component8() {
        return getLockersTotal();
    }

    @Override
    public Long component9() {
        return getLockersDone();
    }

    @Override
    public Long component10() {
        return getCurrentLockerPid();
    }

    @Override
    public Long component11() {
        return getBlocksTotal();
    }

    @Override
    public Long component12() {
        return getBlocksDone();
    }

    @Override
    public Long component13() {
        return getTuplesTotal();
    }

    @Override
    public Long component14() {
        return getTuplesDone();
    }

    @Override
    public Long component15() {
        return getPartitionsTotal();
    }

    @Override
    public Long component16() {
        return getPartitionsDone();
    }

    @Override
    public Integer value1() {
        return getPid();
    }

    @Override
    public Long value2() {
        return getDatid();
    }

    @Override
    public String value3() {
        return getDatname();
    }

    @Override
    public Long value4() {
        return getRelid();
    }

    @Override
    public Long value5() {
        return getIndexRelid();
    }

    @Override
    public String value6() {
        return getCommand();
    }

    @Override
    public String value7() {
        return getPhase();
    }

    @Override
    public Long value8() {
        return getLockersTotal();
    }

    @Override
    public Long value9() {
        return getLockersDone();
    }

    @Override
    public Long value10() {
        return getCurrentLockerPid();
    }

    @Override
    public Long value11() {
        return getBlocksTotal();
    }

    @Override
    public Long value12() {
        return getBlocksDone();
    }

    @Override
    public Long value13() {
        return getTuplesTotal();
    }

    @Override
    public Long value14() {
        return getTuplesDone();
    }

    @Override
    public Long value15() {
        return getPartitionsTotal();
    }

    @Override
    public Long value16() {
        return getPartitionsDone();
    }

    @Override
    public PgStatProgressCreateIndexRecord value1(Integer value) {
        setPid(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value2(Long value) {
        setDatid(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value3(String value) {
        setDatname(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value4(Long value) {
        setRelid(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value5(Long value) {
        setIndexRelid(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value6(String value) {
        setCommand(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value7(String value) {
        setPhase(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value8(Long value) {
        setLockersTotal(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value9(Long value) {
        setLockersDone(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value10(Long value) {
        setCurrentLockerPid(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value11(Long value) {
        setBlocksTotal(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value12(Long value) {
        setBlocksDone(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value13(Long value) {
        setTuplesTotal(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value14(Long value) {
        setTuplesDone(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value15(Long value) {
        setPartitionsTotal(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord value16(Long value) {
        setPartitionsDone(value);
        return this;
    }

    @Override
    public PgStatProgressCreateIndexRecord values(Integer value1, Long value2, String value3, Long value4, Long value5, String value6, String value7, Long value8, Long value9, Long value10, Long value11, Long value12, Long value13, Long value14, Long value15, Long value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatProgressCreateIndexRecord
     */
    public PgStatProgressCreateIndexRecord() {
        super(PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX);
    }

    /**
     * Create a detached, initialised PgStatProgressCreateIndexRecord
     */
    public PgStatProgressCreateIndexRecord(Integer pid, Long datid, String datname, Long relid, Long indexRelid, String command, String phase, Long lockersTotal, Long lockersDone, Long currentLockerPid, Long blocksTotal, Long blocksDone, Long tuplesTotal, Long tuplesDone, Long partitionsTotal, Long partitionsDone) {
        super(PgStatProgressCreateIndex.PG_STAT_PROGRESS_CREATE_INDEX);

        setPid(pid);
        setDatid(datid);
        setDatname(datname);
        setRelid(relid);
        setIndexRelid(indexRelid);
        setCommand(command);
        setPhase(phase);
        setLockersTotal(lockersTotal);
        setLockersDone(lockersDone);
        setCurrentLockerPid(currentLockerPid);
        setBlocksTotal(blocksTotal);
        setBlocksDone(blocksDone);
        setTuplesTotal(tuplesTotal);
        setTuplesDone(tuplesDone);
        setPartitionsTotal(partitionsTotal);
        setPartitionsDone(partitionsDone);
        resetChangedOnNotNull();
    }
}
