/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.information_schema.tables;


import dev.ku01.shop.db.information_schema.InformationSchema;
import dev.ku01.shop.db.information_schema.tables.records.AdministrableRoleAuthorizationsRecord;

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
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdministrableRoleAuthorizations extends TableImpl<AdministrableRoleAuthorizationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.administrable_role_authorizations</code>
     */
    public static final AdministrableRoleAuthorizations ADMINISTRABLE_ROLE_AUTHORIZATIONS = new AdministrableRoleAuthorizations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdministrableRoleAuthorizationsRecord> getRecordType() {
        return AdministrableRoleAuthorizationsRecord.class;
    }

    /**
     * The column
     * <code>information_schema.administrable_role_authorizations.grantee</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> GRANTEE = createField(DSL.name("grantee"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.administrable_role_authorizations.role_name</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> ROLE_NAME = createField(DSL.name("role_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.administrable_role_authorizations.is_grantable</code>.
     */
    public final TableField<AdministrableRoleAuthorizationsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), dev.ku01.shop.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private AdministrableRoleAuthorizations(Name alias, Table<AdministrableRoleAuthorizationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AdministrableRoleAuthorizations(Name alias, Table<AdministrableRoleAuthorizationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "administrable_role_authorizations" as  SELECT grantee,
          role_name,
          is_grantable
         FROM information_schema.applicable_roles
        WHERE ((is_grantable)::text = 'YES'::text);
        """));
    }

    /**
     * Create an aliased
     * <code>information_schema.administrable_role_authorizations</code> table
     * reference
     */
    public AdministrableRoleAuthorizations(String alias) {
        this(DSL.name(alias), ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    /**
     * Create an aliased
     * <code>information_schema.administrable_role_authorizations</code> table
     * reference
     */
    public AdministrableRoleAuthorizations(Name alias) {
        this(alias, ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    /**
     * Create a
     * <code>information_schema.administrable_role_authorizations</code> table
     * reference
     */
    public AdministrableRoleAuthorizations() {
        this(DSL.name("administrable_role_authorizations"), null);
    }

    public <O extends Record> AdministrableRoleAuthorizations(Table<O> child, ForeignKey<O, AdministrableRoleAuthorizationsRecord> key) {
        super(child, key, ADMINISTRABLE_ROLE_AUTHORIZATIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public AdministrableRoleAuthorizations as(String alias) {
        return new AdministrableRoleAuthorizations(DSL.name(alias), this);
    }

    @Override
    public AdministrableRoleAuthorizations as(Name alias) {
        return new AdministrableRoleAuthorizations(alias, this);
    }

    @Override
    public AdministrableRoleAuthorizations as(Table<?> alias) {
        return new AdministrableRoleAuthorizations(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public AdministrableRoleAuthorizations rename(String name) {
        return new AdministrableRoleAuthorizations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdministrableRoleAuthorizations rename(Name name) {
        return new AdministrableRoleAuthorizations(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdministrableRoleAuthorizations rename(Table<?> name) {
        return new AdministrableRoleAuthorizations(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
