/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables;


import dev.ku01.shop.db.pg_catalog.PgCatalog;
import dev.ku01.shop.db.pg_catalog.tables.records.PgGroupRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
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
public class PgGroup extends TableImpl<PgGroupRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_group</code>
     */
    public static final PgGroup PG_GROUP = new PgGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgGroupRecord> getRecordType() {
        return PgGroupRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_group.groname</code>.
     */
    public final TableField<PgGroupRecord, String> GRONAME = createField(DSL.name("groname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_group.grosysid</code>.
     */
    public final TableField<PgGroupRecord, Long> GROSYSID = createField(DSL.name("grosysid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_group.grolist</code>.
     */
    public final TableField<PgGroupRecord, Long[]> GROLIST = createField(DSL.name("grolist"), SQLDataType.BIGINT.array(), this, "");

    private PgGroup(Name alias, Table<PgGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgGroup(Name alias, Table<PgGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "pg_group" as  SELECT rolname AS groname,
          oid AS grosysid,
          ARRAY( SELECT pg_auth_members.member
                 FROM pg_auth_members
                WHERE (pg_auth_members.roleid = pg_authid.oid)) AS grolist
         FROM pg_authid
        WHERE (NOT rolcanlogin);
        """));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_group</code> table reference
     */
    public PgGroup(String alias) {
        this(DSL.name(alias), PG_GROUP);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_group</code> table reference
     */
    public PgGroup(Name alias) {
        this(alias, PG_GROUP);
    }

    /**
     * Create a <code>pg_catalog.pg_group</code> table reference
     */
    public PgGroup() {
        this(DSL.name("pg_group"), null);
    }

    public <O extends Record> PgGroup(Table<O> child, ForeignKey<O, PgGroupRecord> key) {
        super(child, key, PG_GROUP);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgGroup as(String alias) {
        return new PgGroup(DSL.name(alias), this);
    }

    @Override
    public PgGroup as(Name alias) {
        return new PgGroup(alias, this);
    }

    @Override
    public PgGroup as(Table<?> alias) {
        return new PgGroup(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGroup rename(String name) {
        return new PgGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGroup rename(Name name) {
        return new PgGroup(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGroup rename(Table<?> name) {
        return new PgGroup(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Long, Long[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super String, ? super Long, ? super Long[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super Long, ? super Long[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
