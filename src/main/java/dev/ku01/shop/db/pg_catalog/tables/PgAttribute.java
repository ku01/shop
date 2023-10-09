/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables;


import dev.ku01.shop.db.pg_catalog.Keys;
import dev.ku01.shop.db.pg_catalog.PgCatalog;
import dev.ku01.shop.db.pg_catalog.tables.records.PgAttributeRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
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
public class PgAttribute extends TableImpl<PgAttributeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_attribute</code>
     */
    public static final PgAttribute PG_ATTRIBUTE = new PgAttribute();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAttributeRecord> getRecordType() {
        return PgAttributeRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_attribute.attrelid</code>.
     */
    public final TableField<PgAttributeRecord, Long> ATTRELID = createField(DSL.name("attrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attname</code>.
     */
    public final TableField<PgAttributeRecord, String> ATTNAME = createField(DSL.name("attname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.atttypid</code>.
     */
    public final TableField<PgAttributeRecord, Long> ATTTYPID = createField(DSL.name("atttypid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attlen</code>.
     */
    public final TableField<PgAttributeRecord, Short> ATTLEN = createField(DSL.name("attlen"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attnum</code>.
     */
    public final TableField<PgAttributeRecord, Short> ATTNUM = createField(DSL.name("attnum"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attcacheoff</code>.
     */
    public final TableField<PgAttributeRecord, Integer> ATTCACHEOFF = createField(DSL.name("attcacheoff"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.atttypmod</code>.
     */
    public final TableField<PgAttributeRecord, Integer> ATTTYPMOD = createField(DSL.name("atttypmod"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attndims</code>.
     */
    public final TableField<PgAttributeRecord, Short> ATTNDIMS = createField(DSL.name("attndims"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attbyval</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTBYVAL = createField(DSL.name("attbyval"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attalign</code>.
     */
    public final TableField<PgAttributeRecord, String> ATTALIGN = createField(DSL.name("attalign"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attstorage</code>.
     */
    public final TableField<PgAttributeRecord, String> ATTSTORAGE = createField(DSL.name("attstorage"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attcompression</code>.
     */
    public final TableField<PgAttributeRecord, String> ATTCOMPRESSION = createField(DSL.name("attcompression"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attnotnull</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTNOTNULL = createField(DSL.name("attnotnull"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.atthasdef</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTHASDEF = createField(DSL.name("atthasdef"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.atthasmissing</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTHASMISSING = createField(DSL.name("atthasmissing"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attidentity</code>.
     */
    public final TableField<PgAttributeRecord, String> ATTIDENTITY = createField(DSL.name("attidentity"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attgenerated</code>.
     */
    public final TableField<PgAttributeRecord, String> ATTGENERATED = createField(DSL.name("attgenerated"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attisdropped</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTISDROPPED = createField(DSL.name("attisdropped"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attislocal</code>.
     */
    public final TableField<PgAttributeRecord, Boolean> ATTISLOCAL = createField(DSL.name("attislocal"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attinhcount</code>.
     */
    public final TableField<PgAttributeRecord, Short> ATTINHCOUNT = createField(DSL.name("attinhcount"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attstattarget</code>.
     */
    public final TableField<PgAttributeRecord, Short> ATTSTATTARGET = createField(DSL.name("attstattarget"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attcollation</code>.
     */
    public final TableField<PgAttributeRecord, Long> ATTCOLLATION = createField(DSL.name("attcollation"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attacl</code>.
     */
    public final TableField<PgAttributeRecord, String[]> ATTACL = createField(DSL.name("attacl"), SQLDataType.VARCHAR.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attoptions</code>.
     */
    public final TableField<PgAttributeRecord, String[]> ATTOPTIONS = createField(DSL.name("attoptions"), SQLDataType.CLOB.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attfdwoptions</code>.
     */
    public final TableField<PgAttributeRecord, String[]> ATTFDWOPTIONS = createField(DSL.name("attfdwoptions"), SQLDataType.CLOB.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_attribute.attmissingval</code>.
     */
    public final TableField<PgAttributeRecord, Object[]> ATTMISSINGVAL = createField(DSL.name("attmissingval"), SQLDataType.OTHER.array(), this, "");

    private PgAttribute(Name alias, Table<PgAttributeRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAttribute(Name alias, Table<PgAttributeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_attribute</code> table reference
     */
    public PgAttribute(String alias) {
        this(DSL.name(alias), PG_ATTRIBUTE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_attribute</code> table reference
     */
    public PgAttribute(Name alias) {
        this(alias, PG_ATTRIBUTE);
    }

    /**
     * Create a <code>pg_catalog.pg_attribute</code> table reference
     */
    public PgAttribute() {
        this(DSL.name("pg_attribute"), null);
    }

    public <O extends Record> PgAttribute(Table<O> child, ForeignKey<O, PgAttributeRecord> key) {
        super(child, key, PG_ATTRIBUTE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgAttributeRecord> getPrimaryKey() {
        return Keys.PG_ATTRIBUTE_RELID_ATTNUM_INDEX;
    }

    @Override
    public List<UniqueKey<PgAttributeRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_ATTRIBUTE_RELID_ATTNAM_INDEX);
    }

    @Override
    public PgAttribute as(String alias) {
        return new PgAttribute(DSL.name(alias), this);
    }

    @Override
    public PgAttribute as(Name alias) {
        return new PgAttribute(alias, this);
    }

    @Override
    public PgAttribute as(Table<?> alias) {
        return new PgAttribute(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAttribute rename(String name) {
        return new PgAttribute(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAttribute rename(Name name) {
        return new PgAttribute(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAttribute rename(Table<?> name) {
        return new PgAttribute(name.getQualifiedName(), null);
    }
}
