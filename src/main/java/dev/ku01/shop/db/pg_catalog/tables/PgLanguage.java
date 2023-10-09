/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables;


import dev.ku01.shop.db.pg_catalog.Keys;
import dev.ku01.shop.db.pg_catalog.PgCatalog;
import dev.ku01.shop.db.pg_catalog.tables.records.PgLanguageRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgLanguage extends TableImpl<PgLanguageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_language</code>
     */
    public static final PgLanguage PG_LANGUAGE = new PgLanguage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgLanguageRecord> getRecordType() {
        return PgLanguageRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_language.oid</code>.
     */
    public final TableField<PgLanguageRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_language.lanname</code>.
     */
    public final TableField<PgLanguageRecord, String> LANNAME = createField(DSL.name("lanname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_language.lanowner</code>.
     */
    public final TableField<PgLanguageRecord, Long> LANOWNER = createField(DSL.name("lanowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_language.lanispl</code>.
     */
    public final TableField<PgLanguageRecord, Boolean> LANISPL = createField(DSL.name("lanispl"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_language.lanpltrusted</code>.
     */
    public final TableField<PgLanguageRecord, Boolean> LANPLTRUSTED = createField(DSL.name("lanpltrusted"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_language.lanplcallfoid</code>.
     */
    public final TableField<PgLanguageRecord, Long> LANPLCALLFOID = createField(DSL.name("lanplcallfoid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_language.laninline</code>.
     */
    public final TableField<PgLanguageRecord, Long> LANINLINE = createField(DSL.name("laninline"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_language.lanvalidator</code>.
     */
    public final TableField<PgLanguageRecord, Long> LANVALIDATOR = createField(DSL.name("lanvalidator"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_language.lanacl</code>.
     */
    public final TableField<PgLanguageRecord, String[]> LANACL = createField(DSL.name("lanacl"), SQLDataType.VARCHAR.array(), this, "");

    private PgLanguage(Name alias, Table<PgLanguageRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgLanguage(Name alias, Table<PgLanguageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_language</code> table reference
     */
    public PgLanguage(String alias) {
        this(DSL.name(alias), PG_LANGUAGE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_language</code> table reference
     */
    public PgLanguage(Name alias) {
        this(alias, PG_LANGUAGE);
    }

    /**
     * Create a <code>pg_catalog.pg_language</code> table reference
     */
    public PgLanguage() {
        this(DSL.name("pg_language"), null);
    }

    public <O extends Record> PgLanguage(Table<O> child, ForeignKey<O, PgLanguageRecord> key) {
        super(child, key, PG_LANGUAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgLanguageRecord> getPrimaryKey() {
        return Keys.PG_LANGUAGE_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgLanguageRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_LANGUAGE_NAME_INDEX);
    }

    @Override
    public PgLanguage as(String alias) {
        return new PgLanguage(DSL.name(alias), this);
    }

    @Override
    public PgLanguage as(Name alias) {
        return new PgLanguage(alias, this);
    }

    @Override
    public PgLanguage as(Table<?> alias) {
        return new PgLanguage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLanguage rename(String name) {
        return new PgLanguage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLanguage rename(Name name) {
        return new PgLanguage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLanguage rename(Table<?> name) {
        return new PgLanguage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, Long, Boolean, Boolean, Long, Long, Long, String[]> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super Long, ? super String, ? super Long, ? super Boolean, ? super Boolean, ? super Long, ? super Long, ? super Long, ? super String[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Long, ? super String, ? super Long, ? super Boolean, ? super Boolean, ? super Long, ? super Long, ? super Long, ? super String[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
