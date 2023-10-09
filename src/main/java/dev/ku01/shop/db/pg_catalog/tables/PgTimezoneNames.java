/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables;


import dev.ku01.shop.db.pg_catalog.PgCatalog;
import dev.ku01.shop.db.pg_catalog.tables.records.PgTimezoneNamesRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.YearToSecond;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTimezoneNames extends TableImpl<PgTimezoneNamesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_timezone_names</code>
     */
    public static final PgTimezoneNames PG_TIMEZONE_NAMES = new PgTimezoneNames();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTimezoneNamesRecord> getRecordType() {
        return PgTimezoneNamesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_timezone_names.name</code>.
     */
    public final TableField<PgTimezoneNamesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_timezone_names.abbrev</code>.
     */
    public final TableField<PgTimezoneNamesRecord, String> ABBREV = createField(DSL.name("abbrev"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_timezone_names.utc_offset</code>.
     */
    public final TableField<PgTimezoneNamesRecord, YearToSecond> UTC_OFFSET = createField(DSL.name("utc_offset"), SQLDataType.INTERVAL, this, "");

    /**
     * The column <code>pg_catalog.pg_timezone_names.is_dst</code>.
     */
    public final TableField<PgTimezoneNamesRecord, Boolean> IS_DST = createField(DSL.name("is_dst"), SQLDataType.BOOLEAN, this, "");

    private PgTimezoneNames(Name alias, Table<PgTimezoneNamesRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgTimezoneNames(Name alias, Table<PgTimezoneNamesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_timezone_names</code> table
     * reference
     */
    public PgTimezoneNames(String alias) {
        this(DSL.name(alias), PG_TIMEZONE_NAMES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_timezone_names</code> table
     * reference
     */
    public PgTimezoneNames(Name alias) {
        this(alias, PG_TIMEZONE_NAMES);
    }

    /**
     * Create a <code>pg_catalog.pg_timezone_names</code> table reference
     */
    public PgTimezoneNames() {
        this(DSL.name("pg_timezone_names"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgTimezoneNames as(String alias) {
        return new PgTimezoneNames(DSL.name(alias), this, parameters);
    }

    @Override
    public PgTimezoneNames as(Name alias) {
        return new PgTimezoneNames(alias, this, parameters);
    }

    @Override
    public PgTimezoneNames as(Table<?> alias) {
        return new PgTimezoneNames(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTimezoneNames rename(String name) {
        return new PgTimezoneNames(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTimezoneNames rename(Name name) {
        return new PgTimezoneNames(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTimezoneNames rename(Table<?> name) {
        return new PgTimezoneNames(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, YearToSecond, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgTimezoneNames call() {
        PgTimezoneNames result = new PgTimezoneNames(DSL.name("pg_timezone_names"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super String, ? super YearToSecond, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super String, ? super YearToSecond, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
