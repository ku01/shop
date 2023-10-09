/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.information_schema.tables;


import dev.ku01.shop.db.information_schema.InformationSchema;
import dev.ku01.shop.db.information_schema.tables.records.ElementTypesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ElementTypes extends TableImpl<ElementTypesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.element_types</code>
     */
    public static final ElementTypes ELEMENT_TYPES = new ElementTypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ElementTypesRecord> getRecordType() {
        return ElementTypesRecord.class;
    }

    /**
     * The column <code>information_schema.element_types.object_catalog</code>.
     */
    public final TableField<ElementTypesRecord, String> OBJECT_CATALOG = createField(DSL.name("object_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.object_schema</code>.
     */
    public final TableField<ElementTypesRecord, String> OBJECT_SCHEMA = createField(DSL.name("object_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.object_name</code>.
     */
    public final TableField<ElementTypesRecord, String> OBJECT_NAME = createField(DSL.name("object_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.object_type</code>.
     */
    public final TableField<ElementTypesRecord, String> OBJECT_TYPE = createField(DSL.name("object_type"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.element_types.collection_type_identifier</code>.
     */
    public final TableField<ElementTypesRecord, String> COLLECTION_TYPE_IDENTIFIER = createField(DSL.name("collection_type_identifier"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.data_type</code>.
     */
    public final TableField<ElementTypesRecord, String> DATA_TYPE = createField(DSL.name("data_type"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.element_types.character_maximum_length</code>.
     */
    public final TableField<ElementTypesRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.element_types.character_octet_length</code>.
     */
    public final TableField<ElementTypesRecord, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.element_types.character_set_catalog</code>.
     */
    public final TableField<ElementTypesRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.element_types.character_set_schema</code>.
     */
    public final TableField<ElementTypesRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.element_types.character_set_name</code>.
     */
    public final TableField<ElementTypesRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.element_types.collation_catalog</code>.
     */
    public final TableField<ElementTypesRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.element_types.collation_schema</code>.
     */
    public final TableField<ElementTypesRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.collation_name</code>.
     */
    public final TableField<ElementTypesRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.element_types.numeric_precision</code>.
     */
    public final TableField<ElementTypesRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.element_types.numeric_precision_radix</code>.
     */
    public final TableField<ElementTypesRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.numeric_scale</code>.
     */
    public final TableField<ElementTypesRecord, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.element_types.datetime_precision</code>.
     */
    public final TableField<ElementTypesRecord, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.interval_type</code>.
     */
    public final TableField<ElementTypesRecord, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.element_types.interval_precision</code>.
     */
    public final TableField<ElementTypesRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.domain_default</code>.
     */
    public final TableField<ElementTypesRecord, String> DOMAIN_DEFAULT = createField(DSL.name("domain_default"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.udt_catalog</code>.
     */
    public final TableField<ElementTypesRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.udt_schema</code>.
     */
    public final TableField<ElementTypesRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.udt_name</code>.
     */
    public final TableField<ElementTypesRecord, String> UDT_NAME = createField(DSL.name("udt_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.scope_catalog</code>.
     */
    public final TableField<ElementTypesRecord, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.scope_schema</code>.
     */
    public final TableField<ElementTypesRecord, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.scope_name</code>.
     */
    public final TableField<ElementTypesRecord, String> SCOPE_NAME = createField(DSL.name("scope_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.element_types.maximum_cardinality</code>.
     */
    public final TableField<ElementTypesRecord, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.element_types.dtd_identifier</code>.
     */
    public final TableField<ElementTypesRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ElementTypes(Name alias, Table<ElementTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ElementTypes(Name alias, Table<ElementTypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "element_types" as  SELECT (current_database())::information_schema.sql_identifier AS object_catalog,
          (n.nspname)::information_schema.sql_identifier AS object_schema,
          x.objname AS object_name,
          (x.objtype)::information_schema.character_data AS object_type,
          (x.objdtdid)::information_schema.sql_identifier AS collection_type_identifier,
          (
              CASE
                  WHEN (nbt.nspname = 'pg_catalog'::name) THEN format_type(bt.oid, NULL::integer)
                  ELSE 'USER-DEFINED'::text
              END)::information_schema.character_data AS data_type,
          (NULL::integer)::information_schema.cardinal_number AS character_maximum_length,
          (NULL::integer)::information_schema.cardinal_number AS character_octet_length,
          (NULL::name)::information_schema.sql_identifier AS character_set_catalog,
          (NULL::name)::information_schema.sql_identifier AS character_set_schema,
          (NULL::name)::information_schema.sql_identifier AS character_set_name,
          (
              CASE
                  WHEN (nco.nspname IS NOT NULL) THEN current_database()
                  ELSE NULL::name
              END)::information_schema.sql_identifier AS collation_catalog,
          (nco.nspname)::information_schema.sql_identifier AS collation_schema,
          (co.collname)::information_schema.sql_identifier AS collation_name,
          (NULL::integer)::information_schema.cardinal_number AS numeric_precision,
          (NULL::integer)::information_schema.cardinal_number AS numeric_precision_radix,
          (NULL::integer)::information_schema.cardinal_number AS numeric_scale,
          (NULL::integer)::information_schema.cardinal_number AS datetime_precision,
          (NULL::character varying)::information_schema.character_data AS interval_type,
          (NULL::integer)::information_schema.cardinal_number AS interval_precision,
          (NULL::character varying)::information_schema.character_data AS domain_default,
          (current_database())::information_schema.sql_identifier AS udt_catalog,
          (nbt.nspname)::information_schema.sql_identifier AS udt_schema,
          (bt.typname)::information_schema.sql_identifier AS udt_name,
          (NULL::name)::information_schema.sql_identifier AS scope_catalog,
          (NULL::name)::information_schema.sql_identifier AS scope_schema,
          (NULL::name)::information_schema.sql_identifier AS scope_name,
          (NULL::integer)::information_schema.cardinal_number AS maximum_cardinality,
          (('a'::text || (x.objdtdid)::text))::information_schema.sql_identifier AS dtd_identifier
         FROM pg_namespace n,
          pg_type at,
          pg_namespace nbt,
          pg_type bt,
          (( SELECT c.relnamespace,
                  (c.relname)::information_schema.sql_identifier AS relname,
                      CASE
                          WHEN (c.relkind = 'c'::"char") THEN 'USER-DEFINED TYPE'::text
                          ELSE 'TABLE'::text
                      END AS "case",
                  a.attnum,
                  a.atttypid,
                  a.attcollation
                 FROM pg_class c,
                  pg_attribute a
                WHERE ((c.oid = a.attrelid) AND (c.relkind = ANY (ARRAY['r'::"char", 'v'::"char", 'f'::"char", 'c'::"char", 'p'::"char"])) AND (a.attnum > 0) AND (NOT a.attisdropped))
              UNION ALL
               SELECT t.typnamespace,
                  (t.typname)::information_schema.sql_identifier AS typname,
                  'DOMAIN'::text AS text,
                  1,
                  t.typbasetype,
                  t.typcollation
                 FROM pg_type t
                WHERE (t.typtype = 'd'::"char")
              UNION ALL
               SELECT ss.pronamespace,
                  (nameconcatoid(ss.proname, ss.oid))::information_schema.sql_identifier AS nameconcatoid,
                  'ROUTINE'::text AS text,
                  (ss.x).n AS n,
                  (ss.x).x AS x,
                  0
                 FROM ( SELECT p.pronamespace,
                          p.proname,
                          p.oid,
                          information_schema._pg_expandarray(COALESCE(p.proallargtypes, (p.proargtypes)::oid[])) AS x
                         FROM pg_proc p) ss
              UNION ALL
               SELECT p.pronamespace,
                  (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS nameconcatoid,
                  'ROUTINE'::text AS text,
                  0,
                  p.prorettype,
                  0
                 FROM pg_proc p) x(objschema, objname, objtype, objdtdid, objtypeid, objcollation)
           LEFT JOIN (pg_collation co
           JOIN pg_namespace nco ON ((co.collnamespace = nco.oid))) ON (((x.objcollation = co.oid) AND ((nco.nspname <> 'pg_catalog'::name) OR (co.collname <> 'default'::name)))))
        WHERE ((n.oid = x.objschema) AND (at.oid = x.objtypeid) AND ((at.typelem <> (0)::oid) AND (at.typlen = '-1'::integer)) AND (at.typelem = bt.oid) AND (nbt.oid = bt.typnamespace) AND ((n.nspname, (x.objname)::name, x.objtype, ((x.objdtdid)::information_schema.sql_identifier)::name) IN ( SELECT data_type_privileges.object_schema,
                  data_type_privileges.object_name,
                  data_type_privileges.object_type,
                  data_type_privileges.dtd_identifier
                 FROM information_schema.data_type_privileges)));
        """));
    }

    /**
     * Create an aliased <code>information_schema.element_types</code> table
     * reference
     */
    public ElementTypes(String alias) {
        this(DSL.name(alias), ELEMENT_TYPES);
    }

    /**
     * Create an aliased <code>information_schema.element_types</code> table
     * reference
     */
    public ElementTypes(Name alias) {
        this(alias, ELEMENT_TYPES);
    }

    /**
     * Create a <code>information_schema.element_types</code> table reference
     */
    public ElementTypes() {
        this(DSL.name("element_types"), null);
    }

    public <O extends Record> ElementTypes(Table<O> child, ForeignKey<O, ElementTypesRecord> key) {
        super(child, key, ELEMENT_TYPES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public ElementTypes as(String alias) {
        return new ElementTypes(DSL.name(alias), this);
    }

    @Override
    public ElementTypes as(Name alias) {
        return new ElementTypes(alias, this);
    }

    @Override
    public ElementTypes as(Table<?> alias) {
        return new ElementTypes(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ElementTypes rename(String name) {
        return new ElementTypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ElementTypes rename(Name name) {
        return new ElementTypes(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ElementTypes rename(Table<?> name) {
        return new ElementTypes(name.getQualifiedName(), null);
    }
}
