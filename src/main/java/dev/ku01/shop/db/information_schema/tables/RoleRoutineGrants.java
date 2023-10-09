/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.information_schema.tables;


import dev.ku01.shop.db.information_schema.InformationSchema;
import dev.ku01.shop.db.information_schema.tables.records.RoleRoutineGrantsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function10;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleRoutineGrants extends TableImpl<RoleRoutineGrantsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.role_routine_grants</code>
     */
    public static final RoleRoutineGrants ROLE_ROUTINE_GRANTS = new RoleRoutineGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleRoutineGrantsRecord> getRecordType() {
        return RoleRoutineGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.role_routine_grants.grantor</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> GRANTOR = createField(DSL.name("grantor"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_routine_grants.grantee</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> GRANTEE = createField(DSL.name("grantee"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.specific_catalog</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.specific_schema</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.specific_name</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.routine_catalog</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> ROUTINE_CATALOG = createField(DSL.name("routine_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.routine_schema</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> ROUTINE_SCHEMA = createField(DSL.name("routine_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.routine_name</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> ROUTINE_NAME = createField(DSL.name("routine_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.privilege_type</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.is_grantable</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), dev.ku01.shop.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private RoleRoutineGrants(Name alias, Table<RoleRoutineGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleRoutineGrants(Name alias, Table<RoleRoutineGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "role_routine_grants" as  SELECT grantor,
          grantee,
          specific_catalog,
          specific_schema,
          specific_name,
          routine_catalog,
          routine_schema,
          routine_name,
          privilege_type,
          is_grantable
         FROM information_schema.routine_privileges
        WHERE (((grantor)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)) OR ((grantee)::name IN ( SELECT enabled_roles.role_name
                 FROM information_schema.enabled_roles)));
        """));
    }

    /**
     * Create an aliased <code>information_schema.role_routine_grants</code>
     * table reference
     */
    public RoleRoutineGrants(String alias) {
        this(DSL.name(alias), ROLE_ROUTINE_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.role_routine_grants</code>
     * table reference
     */
    public RoleRoutineGrants(Name alias) {
        this(alias, ROLE_ROUTINE_GRANTS);
    }

    /**
     * Create a <code>information_schema.role_routine_grants</code> table
     * reference
     */
    public RoleRoutineGrants() {
        this(DSL.name("role_routine_grants"), null);
    }

    public <O extends Record> RoleRoutineGrants(Table<O> child, ForeignKey<O, RoleRoutineGrantsRecord> key) {
        super(child, key, ROLE_ROUTINE_GRANTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoleRoutineGrants as(String alias) {
        return new RoleRoutineGrants(DSL.name(alias), this);
    }

    @Override
    public RoleRoutineGrants as(Name alias) {
        return new RoleRoutineGrants(alias, this);
    }

    @Override
    public RoleRoutineGrants as(Table<?> alias) {
        return new RoleRoutineGrants(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleRoutineGrants rename(String name) {
        return new RoleRoutineGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleRoutineGrants rename(Name name) {
        return new RoleRoutineGrants(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleRoutineGrants rename(Table<?> name) {
        return new RoleRoutineGrants(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function10<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function10<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
