/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.PgStatProgressBasebackup;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatProgressBasebackupRecord extends TableRecordImpl<PgStatProgressBasebackupRecord> implements Record6<Integer, String, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_basebackup.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_basebackup.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_basebackup.phase</code>.
     */
    public void setPhase(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_basebackup.phase</code>.
     */
    public String getPhase() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_basebackup.backup_total</code>.
     */
    public void setBackupTotal(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_basebackup.backup_total</code>.
     */
    public Long getBackupTotal() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_basebackup.backup_streamed</code>.
     */
    public void setBackupStreamed(Long value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_basebackup.backup_streamed</code>.
     */
    public Long getBackupStreamed() {
        return (Long) get(3);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_basebackup.tablespaces_total</code>.
     */
    public void setTablespacesTotal(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_basebackup.tablespaces_total</code>.
     */
    public Long getTablespacesTotal() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_progress_basebackup.tablespaces_streamed</code>.
     */
    public void setTablespacesStreamed(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_progress_basebackup.tablespaces_streamed</code>.
     */
    public Long getTablespacesStreamed() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, Long, Long, Long, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, Long, Long, Long, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PgStatProgressBasebackup.PG_STAT_PROGRESS_BASEBACKUP.PID;
    }

    @Override
    public Field<String> field2() {
        return PgStatProgressBasebackup.PG_STAT_PROGRESS_BASEBACKUP.PHASE;
    }

    @Override
    public Field<Long> field3() {
        return PgStatProgressBasebackup.PG_STAT_PROGRESS_BASEBACKUP.BACKUP_TOTAL;
    }

    @Override
    public Field<Long> field4() {
        return PgStatProgressBasebackup.PG_STAT_PROGRESS_BASEBACKUP.BACKUP_STREAMED;
    }

    @Override
    public Field<Long> field5() {
        return PgStatProgressBasebackup.PG_STAT_PROGRESS_BASEBACKUP.TABLESPACES_TOTAL;
    }

    @Override
    public Field<Long> field6() {
        return PgStatProgressBasebackup.PG_STAT_PROGRESS_BASEBACKUP.TABLESPACES_STREAMED;
    }

    @Override
    public Integer component1() {
        return getPid();
    }

    @Override
    public String component2() {
        return getPhase();
    }

    @Override
    public Long component3() {
        return getBackupTotal();
    }

    @Override
    public Long component4() {
        return getBackupStreamed();
    }

    @Override
    public Long component5() {
        return getTablespacesTotal();
    }

    @Override
    public Long component6() {
        return getTablespacesStreamed();
    }

    @Override
    public Integer value1() {
        return getPid();
    }

    @Override
    public String value2() {
        return getPhase();
    }

    @Override
    public Long value3() {
        return getBackupTotal();
    }

    @Override
    public Long value4() {
        return getBackupStreamed();
    }

    @Override
    public Long value5() {
        return getTablespacesTotal();
    }

    @Override
    public Long value6() {
        return getTablespacesStreamed();
    }

    @Override
    public PgStatProgressBasebackupRecord value1(Integer value) {
        setPid(value);
        return this;
    }

    @Override
    public PgStatProgressBasebackupRecord value2(String value) {
        setPhase(value);
        return this;
    }

    @Override
    public PgStatProgressBasebackupRecord value3(Long value) {
        setBackupTotal(value);
        return this;
    }

    @Override
    public PgStatProgressBasebackupRecord value4(Long value) {
        setBackupStreamed(value);
        return this;
    }

    @Override
    public PgStatProgressBasebackupRecord value5(Long value) {
        setTablespacesTotal(value);
        return this;
    }

    @Override
    public PgStatProgressBasebackupRecord value6(Long value) {
        setTablespacesStreamed(value);
        return this;
    }

    @Override
    public PgStatProgressBasebackupRecord values(Integer value1, String value2, Long value3, Long value4, Long value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatProgressBasebackupRecord
     */
    public PgStatProgressBasebackupRecord() {
        super(PgStatProgressBasebackup.PG_STAT_PROGRESS_BASEBACKUP);
    }

    /**
     * Create a detached, initialised PgStatProgressBasebackupRecord
     */
    public PgStatProgressBasebackupRecord(Integer pid, String phase, Long backupTotal, Long backupStreamed, Long tablespacesTotal, Long tablespacesStreamed) {
        super(PgStatProgressBasebackup.PG_STAT_PROGRESS_BASEBACKUP);

        setPid(pid);
        setPhase(phase);
        setBackupTotal(backupTotal);
        setBackupStreamed(backupStreamed);
        setTablespacesTotal(tablespacesTotal);
        setTablespacesStreamed(tablespacesStreamed);
        resetChangedOnNotNull();
    }
}
