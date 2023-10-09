/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables;


import dev.ku01.shop.db.pg_catalog.PgCatalog;
import dev.ku01.shop.db.pg_catalog.tables.records.PgStatIoRecord;

import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function18;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row18;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatIo extends TableImpl<PgStatIoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_io</code>
     */
    public static final PgStatIo PG_STAT_IO = new PgStatIo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatIoRecord> getRecordType() {
        return PgStatIoRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_io.backend_type</code>.
     */
    public final TableField<PgStatIoRecord, String> BACKEND_TYPE = createField(DSL.name("backend_type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.object</code>.
     */
    public final TableField<PgStatIoRecord, String> OBJECT = createField(DSL.name("object"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.context</code>.
     */
    public final TableField<PgStatIoRecord, String> CONTEXT = createField(DSL.name("context"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.reads</code>.
     */
    public final TableField<PgStatIoRecord, Long> READS = createField(DSL.name("reads"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.read_time</code>.
     */
    public final TableField<PgStatIoRecord, Double> READ_TIME = createField(DSL.name("read_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.writes</code>.
     */
    public final TableField<PgStatIoRecord, Long> WRITES = createField(DSL.name("writes"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.write_time</code>.
     */
    public final TableField<PgStatIoRecord, Double> WRITE_TIME = createField(DSL.name("write_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.writebacks</code>.
     */
    public final TableField<PgStatIoRecord, Long> WRITEBACKS = createField(DSL.name("writebacks"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.writeback_time</code>.
     */
    public final TableField<PgStatIoRecord, Double> WRITEBACK_TIME = createField(DSL.name("writeback_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.extends</code>.
     */
    public final TableField<PgStatIoRecord, Long> EXTENDS = createField(DSL.name("extends"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.extend_time</code>.
     */
    public final TableField<PgStatIoRecord, Double> EXTEND_TIME = createField(DSL.name("extend_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.op_bytes</code>.
     */
    public final TableField<PgStatIoRecord, Long> OP_BYTES = createField(DSL.name("op_bytes"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.hits</code>.
     */
    public final TableField<PgStatIoRecord, Long> HITS = createField(DSL.name("hits"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.evictions</code>.
     */
    public final TableField<PgStatIoRecord, Long> EVICTIONS = createField(DSL.name("evictions"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.reuses</code>.
     */
    public final TableField<PgStatIoRecord, Long> REUSES = createField(DSL.name("reuses"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.fsyncs</code>.
     */
    public final TableField<PgStatIoRecord, Long> FSYNCS = createField(DSL.name("fsyncs"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.fsync_time</code>.
     */
    public final TableField<PgStatIoRecord, Double> FSYNC_TIME = createField(DSL.name("fsync_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_io.stats_reset</code>.
     */
    public final TableField<PgStatIoRecord, OffsetDateTime> STATS_RESET = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatIo(Name alias, Table<PgStatIoRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatIo(Name alias, Table<PgStatIoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stat_io" as  SELECT backend_type,
         object,
         context,
         reads,
         read_time,
         writes,
         write_time,
         writebacks,
         writeback_time,
         extends,
         extend_time,
         op_bytes,
         hits,
         evictions,
         reuses,
         fsyncs,
         fsync_time,
         stats_reset
        FROM pg_stat_get_io() b(backend_type, object, context, reads, read_time, writes, write_time, writebacks, writeback_time, extends, extend_time, op_bytes, hits, evictions, reuses, fsyncs, fsync_time, stats_reset);
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_io</code> table reference
     */
    public PgStatIo(String alias) {
        this(DSL.name(alias), PG_STAT_IO);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_io</code> table reference
     */
    public PgStatIo(Name alias) {
        this(alias, PG_STAT_IO);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_io</code> table reference
     */
    public PgStatIo() {
        this(DSL.name("pg_stat_io"), null);
    }

    public <O extends Record> PgStatIo(Table<O> child, ForeignKey<O, PgStatIoRecord> key) {
        super(child, key, PG_STAT_IO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatIo as(String alias) {
        return new PgStatIo(DSL.name(alias), this);
    }

    @Override
    public PgStatIo as(Name alias) {
        return new PgStatIo(alias, this);
    }

    @Override
    public PgStatIo as(Table<?> alias) {
        return new PgStatIo(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatIo rename(String name) {
        return new PgStatIo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatIo rename(Name name) {
        return new PgStatIo(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatIo rename(Table<?> name) {
        return new PgStatIo(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, String, Long, Double, Long, Double, Long, Double, Long, Double, Long, Long, Long, Long, Long, Double, OffsetDateTime> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function18<? super String, ? super String, ? super String, ? super Long, ? super Double, ? super Long, ? super Double, ? super Long, ? super Double, ? super Long, ? super Double, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Double, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function18<? super String, ? super String, ? super String, ? super Long, ? super Double, ? super Long, ? super Double, ? super Long, ? super Double, ? super Long, ? super Double, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Double, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
