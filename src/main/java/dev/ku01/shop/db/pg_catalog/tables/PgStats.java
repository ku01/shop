/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables;


import dev.ku01.shop.db.pg_catalog.PgCatalog;
import dev.ku01.shop.db.pg_catalog.tables.records.PgStatsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function14;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row14;
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
public class PgStats extends TableImpl<PgStatsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stats</code>
     */
    public static final PgStats PG_STATS = new PgStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatsRecord> getRecordType() {
        return PgStatsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stats.schemaname</code>.
     */
    public final TableField<PgStatsRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.tablename</code>.
     */
    public final TableField<PgStatsRecord, String> TABLENAME = createField(DSL.name("tablename"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.attname</code>.
     */
    public final TableField<PgStatsRecord, String> ATTNAME = createField(DSL.name("attname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.inherited</code>.
     */
    public final TableField<PgStatsRecord, Boolean> INHERITED = createField(DSL.name("inherited"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.null_frac</code>.
     */
    public final TableField<PgStatsRecord, Float> NULL_FRAC = createField(DSL.name("null_frac"), SQLDataType.REAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.avg_width</code>.
     */
    public final TableField<PgStatsRecord, Integer> AVG_WIDTH = createField(DSL.name("avg_width"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.n_distinct</code>.
     */
    public final TableField<PgStatsRecord, Float> N_DISTINCT = createField(DSL.name("n_distinct"), SQLDataType.REAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.most_common_vals</code>.
     */
    public final TableField<PgStatsRecord, Object[]> MOST_COMMON_VALS = createField(DSL.name("most_common_vals"), SQLDataType.OTHER.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_stats.most_common_freqs</code>.
     */
    public final TableField<PgStatsRecord, Float[]> MOST_COMMON_FREQS = createField(DSL.name("most_common_freqs"), SQLDataType.REAL.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_stats.histogram_bounds</code>.
     */
    public final TableField<PgStatsRecord, Object[]> HISTOGRAM_BOUNDS = createField(DSL.name("histogram_bounds"), SQLDataType.OTHER.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_stats.correlation</code>.
     */
    public final TableField<PgStatsRecord, Float> CORRELATION = createField(DSL.name("correlation"), SQLDataType.REAL, this, "");

    /**
     * The column <code>pg_catalog.pg_stats.most_common_elems</code>.
     */
    public final TableField<PgStatsRecord, Object[]> MOST_COMMON_ELEMS = createField(DSL.name("most_common_elems"), SQLDataType.OTHER.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_stats.most_common_elem_freqs</code>.
     */
    public final TableField<PgStatsRecord, Float[]> MOST_COMMON_ELEM_FREQS = createField(DSL.name("most_common_elem_freqs"), SQLDataType.REAL.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_stats.elem_count_histogram</code>.
     */
    public final TableField<PgStatsRecord, Float[]> ELEM_COUNT_HISTOGRAM = createField(DSL.name("elem_count_histogram"), SQLDataType.REAL.array(), this, "");

    private PgStats(Name alias, Table<PgStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStats(Name alias, Table<PgStatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_stats" as  SELECT n.nspname AS schemaname,
          c.relname AS tablename,
          a.attname,
          s.stainherit AS inherited,
          s.stanullfrac AS null_frac,
          s.stawidth AS avg_width,
          s.stadistinct AS n_distinct,
              CASE
                  WHEN (s.stakind1 = 1) THEN s.stavalues1
                  WHEN (s.stakind2 = 1) THEN s.stavalues2
                  WHEN (s.stakind3 = 1) THEN s.stavalues3
                  WHEN (s.stakind4 = 1) THEN s.stavalues4
                  WHEN (s.stakind5 = 1) THEN s.stavalues5
                  ELSE NULL::anyarray
              END AS most_common_vals,
              CASE
                  WHEN (s.stakind1 = 1) THEN s.stanumbers1
                  WHEN (s.stakind2 = 1) THEN s.stanumbers2
                  WHEN (s.stakind3 = 1) THEN s.stanumbers3
                  WHEN (s.stakind4 = 1) THEN s.stanumbers4
                  WHEN (s.stakind5 = 1) THEN s.stanumbers5
                  ELSE NULL::real[]
              END AS most_common_freqs,
              CASE
                  WHEN (s.stakind1 = 2) THEN s.stavalues1
                  WHEN (s.stakind2 = 2) THEN s.stavalues2
                  WHEN (s.stakind3 = 2) THEN s.stavalues3
                  WHEN (s.stakind4 = 2) THEN s.stavalues4
                  WHEN (s.stakind5 = 2) THEN s.stavalues5
                  ELSE NULL::anyarray
              END AS histogram_bounds,
              CASE
                  WHEN (s.stakind1 = 3) THEN s.stanumbers1[1]
                  WHEN (s.stakind2 = 3) THEN s.stanumbers2[1]
                  WHEN (s.stakind3 = 3) THEN s.stanumbers3[1]
                  WHEN (s.stakind4 = 3) THEN s.stanumbers4[1]
                  WHEN (s.stakind5 = 3) THEN s.stanumbers5[1]
                  ELSE NULL::real
              END AS correlation,
              CASE
                  WHEN (s.stakind1 = 4) THEN s.stavalues1
                  WHEN (s.stakind2 = 4) THEN s.stavalues2
                  WHEN (s.stakind3 = 4) THEN s.stavalues3
                  WHEN (s.stakind4 = 4) THEN s.stavalues4
                  WHEN (s.stakind5 = 4) THEN s.stavalues5
                  ELSE NULL::anyarray
              END AS most_common_elems,
              CASE
                  WHEN (s.stakind1 = 4) THEN s.stanumbers1
                  WHEN (s.stakind2 = 4) THEN s.stanumbers2
                  WHEN (s.stakind3 = 4) THEN s.stanumbers3
                  WHEN (s.stakind4 = 4) THEN s.stanumbers4
                  WHEN (s.stakind5 = 4) THEN s.stanumbers5
                  ELSE NULL::real[]
              END AS most_common_elem_freqs,
              CASE
                  WHEN (s.stakind1 = 5) THEN s.stanumbers1
                  WHEN (s.stakind2 = 5) THEN s.stanumbers2
                  WHEN (s.stakind3 = 5) THEN s.stanumbers3
                  WHEN (s.stakind4 = 5) THEN s.stanumbers4
                  WHEN (s.stakind5 = 5) THEN s.stanumbers5
                  ELSE NULL::real[]
              END AS elem_count_histogram
         FROM (((pg_statistic s
           JOIN pg_class c ON ((c.oid = s.starelid)))
           JOIN pg_attribute a ON (((c.oid = a.attrelid) AND (a.attnum = s.staattnum))))
           LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))
        WHERE ((NOT a.attisdropped) AND has_column_privilege(c.oid, a.attnum, 'select'::text) AND ((c.relrowsecurity = false) OR (NOT row_security_active(c.oid))));
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stats</code> table reference
     */
    public PgStats(String alias) {
        this(DSL.name(alias), PG_STATS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stats</code> table reference
     */
    public PgStats(Name alias) {
        this(alias, PG_STATS);
    }

    /**
     * Create a <code>pg_catalog.pg_stats</code> table reference
     */
    public PgStats() {
        this(DSL.name("pg_stats"), null);
    }

    public <O extends Record> PgStats(Table<O> child, ForeignKey<O, PgStatsRecord> key) {
        super(child, key, PG_STATS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStats as(String alias) {
        return new PgStats(DSL.name(alias), this);
    }

    @Override
    public PgStats as(Name alias) {
        return new PgStats(alias, this);
    }

    @Override
    public PgStats as(Table<?> alias) {
        return new PgStats(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStats rename(String name) {
        return new PgStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStats rename(Name name) {
        return new PgStats(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStats rename(Table<?> name) {
        return new PgStats(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, String, String, Boolean, Float, Integer, Float, Object[], Float[], Object[], Float, Object[], Float[], Float[]> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function14<? super String, ? super String, ? super String, ? super Boolean, ? super Float, ? super Integer, ? super Float, ? super Object[], ? super Float[], ? super Object[], ? super Float, ? super Object[], ? super Float[], ? super Float[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function14<? super String, ? super String, ? super String, ? super Boolean, ? super Float, ? super Integer, ? super Float, ? super Object[], ? super Float[], ? super Object[], ? super Float, ? super Object[], ? super Float[], ? super Float[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}