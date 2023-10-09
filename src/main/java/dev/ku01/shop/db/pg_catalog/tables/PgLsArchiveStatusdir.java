/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables;


import dev.ku01.shop.db.pg_catalog.PgCatalog;
import dev.ku01.shop.db.pg_catalog.tables.records.PgLsArchiveStatusdirRecord;

import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row3;
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
public class PgLsArchiveStatusdir extends TableImpl<PgLsArchiveStatusdirRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_ls_archive_statusdir</code>
     */
    public static final PgLsArchiveStatusdir PG_LS_ARCHIVE_STATUSDIR = new PgLsArchiveStatusdir();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgLsArchiveStatusdirRecord> getRecordType() {
        return PgLsArchiveStatusdirRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ls_archive_statusdir.name</code>.
     */
    public final TableField<PgLsArchiveStatusdirRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_ls_archive_statusdir.size</code>.
     */
    public final TableField<PgLsArchiveStatusdirRecord, Long> SIZE = createField(DSL.name("size"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_ls_archive_statusdir.modification</code>.
     */
    public final TableField<PgLsArchiveStatusdirRecord, OffsetDateTime> MODIFICATION = createField(DSL.name("modification"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgLsArchiveStatusdir(Name alias, Table<PgLsArchiveStatusdirRecord> aliased) {
        this(alias, aliased, new Field[] {
        });
    }

    private PgLsArchiveStatusdir(Name alias, Table<PgLsArchiveStatusdirRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_archive_statusdir</code> table
     * reference
     */
    public PgLsArchiveStatusdir(String alias) {
        this(DSL.name(alias), PG_LS_ARCHIVE_STATUSDIR);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_archive_statusdir</code> table
     * reference
     */
    public PgLsArchiveStatusdir(Name alias) {
        this(alias, PG_LS_ARCHIVE_STATUSDIR);
    }

    /**
     * Create a <code>pg_catalog.pg_ls_archive_statusdir</code> table reference
     */
    public PgLsArchiveStatusdir() {
        this(DSL.name("pg_ls_archive_statusdir"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgLsArchiveStatusdir as(String alias) {
        return new PgLsArchiveStatusdir(DSL.name(alias), this, parameters);
    }

    @Override
    public PgLsArchiveStatusdir as(Name alias) {
        return new PgLsArchiveStatusdir(alias, this, parameters);
    }

    @Override
    public PgLsArchiveStatusdir as(Table<?> alias) {
        return new PgLsArchiveStatusdir(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLsArchiveStatusdir rename(String name) {
        return new PgLsArchiveStatusdir(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLsArchiveStatusdir rename(Name name) {
        return new PgLsArchiveStatusdir(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLsArchiveStatusdir rename(Table<?> name) {
        return new PgLsArchiveStatusdir(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Long, OffsetDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgLsArchiveStatusdir call() {
        PgLsArchiveStatusdir result = new PgLsArchiveStatusdir(DSL.name("pg_ls_archive_statusdir"), null, new Field[] {});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super String, ? super Long, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super Long, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
