/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.PgBackendMemoryContexts;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgBackendMemoryContextsRecord extends TableRecordImpl<PgBackendMemoryContextsRecord> implements Record9<String, String, String, Integer, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_backend_memory_contexts.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_backend_memory_contexts.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_backend_memory_contexts.ident</code>.
     */
    public void setIdent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_backend_memory_contexts.ident</code>.
     */
    public String getIdent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_backend_memory_contexts.parent</code>.
     */
    public void setParent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_backend_memory_contexts.parent</code>.
     */
    public String getParent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_backend_memory_contexts.level</code>.
     */
    public void setLevel(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_backend_memory_contexts.level</code>.
     */
    public Integer getLevel() {
        return (Integer) get(3);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_backend_memory_contexts.total_bytes</code>.
     */
    public void setTotalBytes(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_backend_memory_contexts.total_bytes</code>.
     */
    public Long getTotalBytes() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_backend_memory_contexts.total_nblocks</code>.
     */
    public void setTotalNblocks(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_backend_memory_contexts.total_nblocks</code>.
     */
    public Long getTotalNblocks() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_backend_memory_contexts.free_bytes</code>.
     */
    public void setFreeBytes(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_backend_memory_contexts.free_bytes</code>.
     */
    public Long getFreeBytes() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_backend_memory_contexts.free_chunks</code>.
     */
    public void setFreeChunks(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_backend_memory_contexts.free_chunks</code>.
     */
    public Long getFreeChunks() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_backend_memory_contexts.used_bytes</code>.
     */
    public void setUsedBytes(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_backend_memory_contexts.used_bytes</code>.
     */
    public Long getUsedBytes() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, Integer, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, String, String, Integer, Long, Long, Long, Long, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgBackendMemoryContexts.PG_BACKEND_MEMORY_CONTEXTS.NAME;
    }

    @Override
    public Field<String> field2() {
        return PgBackendMemoryContexts.PG_BACKEND_MEMORY_CONTEXTS.IDENT;
    }

    @Override
    public Field<String> field3() {
        return PgBackendMemoryContexts.PG_BACKEND_MEMORY_CONTEXTS.PARENT;
    }

    @Override
    public Field<Integer> field4() {
        return PgBackendMemoryContexts.PG_BACKEND_MEMORY_CONTEXTS.LEVEL;
    }

    @Override
    public Field<Long> field5() {
        return PgBackendMemoryContexts.PG_BACKEND_MEMORY_CONTEXTS.TOTAL_BYTES;
    }

    @Override
    public Field<Long> field6() {
        return PgBackendMemoryContexts.PG_BACKEND_MEMORY_CONTEXTS.TOTAL_NBLOCKS;
    }

    @Override
    public Field<Long> field7() {
        return PgBackendMemoryContexts.PG_BACKEND_MEMORY_CONTEXTS.FREE_BYTES;
    }

    @Override
    public Field<Long> field8() {
        return PgBackendMemoryContexts.PG_BACKEND_MEMORY_CONTEXTS.FREE_CHUNKS;
    }

    @Override
    public Field<Long> field9() {
        return PgBackendMemoryContexts.PG_BACKEND_MEMORY_CONTEXTS.USED_BYTES;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String component2() {
        return getIdent();
    }

    @Override
    public String component3() {
        return getParent();
    }

    @Override
    public Integer component4() {
        return getLevel();
    }

    @Override
    public Long component5() {
        return getTotalBytes();
    }

    @Override
    public Long component6() {
        return getTotalNblocks();
    }

    @Override
    public Long component7() {
        return getFreeBytes();
    }

    @Override
    public Long component8() {
        return getFreeChunks();
    }

    @Override
    public Long component9() {
        return getUsedBytes();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public String value2() {
        return getIdent();
    }

    @Override
    public String value3() {
        return getParent();
    }

    @Override
    public Integer value4() {
        return getLevel();
    }

    @Override
    public Long value5() {
        return getTotalBytes();
    }

    @Override
    public Long value6() {
        return getTotalNblocks();
    }

    @Override
    public Long value7() {
        return getFreeBytes();
    }

    @Override
    public Long value8() {
        return getFreeChunks();
    }

    @Override
    public Long value9() {
        return getUsedBytes();
    }

    @Override
    public PgBackendMemoryContextsRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public PgBackendMemoryContextsRecord value2(String value) {
        setIdent(value);
        return this;
    }

    @Override
    public PgBackendMemoryContextsRecord value3(String value) {
        setParent(value);
        return this;
    }

    @Override
    public PgBackendMemoryContextsRecord value4(Integer value) {
        setLevel(value);
        return this;
    }

    @Override
    public PgBackendMemoryContextsRecord value5(Long value) {
        setTotalBytes(value);
        return this;
    }

    @Override
    public PgBackendMemoryContextsRecord value6(Long value) {
        setTotalNblocks(value);
        return this;
    }

    @Override
    public PgBackendMemoryContextsRecord value7(Long value) {
        setFreeBytes(value);
        return this;
    }

    @Override
    public PgBackendMemoryContextsRecord value8(Long value) {
        setFreeChunks(value);
        return this;
    }

    @Override
    public PgBackendMemoryContextsRecord value9(Long value) {
        setUsedBytes(value);
        return this;
    }

    @Override
    public PgBackendMemoryContextsRecord values(String value1, String value2, String value3, Integer value4, Long value5, Long value6, Long value7, Long value8, Long value9) {
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
     * Create a detached PgBackendMemoryContextsRecord
     */
    public PgBackendMemoryContextsRecord() {
        super(PgBackendMemoryContexts.PG_BACKEND_MEMORY_CONTEXTS);
    }

    /**
     * Create a detached, initialised PgBackendMemoryContextsRecord
     */
    public PgBackendMemoryContextsRecord(String name, String ident, String parent, Integer level, Long totalBytes, Long totalNblocks, Long freeBytes, Long freeChunks, Long usedBytes) {
        super(PgBackendMemoryContexts.PG_BACKEND_MEMORY_CONTEXTS);

        setName(name);
        setIdent(ident);
        setParent(parent);
        setLevel(level);
        setTotalBytes(totalBytes);
        setTotalNblocks(totalNblocks);
        setFreeBytes(freeBytes);
        setFreeChunks(freeChunks);
        setUsedBytes(usedBytes);
        resetChangedOnNotNull();
    }
}
