/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables;


import dev.ku01.shop.db.pg_catalog.PgCatalog;
import dev.ku01.shop.db.pg_catalog.tables.records.JsonEachTextRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.Function2;
import org.jooq.JSON;
import org.jooq.Name;
import org.jooq.Records;
import org.jooq.Row2;
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
public class JsonEachText extends TableImpl<JsonEachTextRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.json_each_text</code>
     */
    public static final JsonEachText JSON_EACH_TEXT = new JsonEachText();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonEachTextRecord> getRecordType() {
        return JsonEachTextRecord.class;
    }

    /**
     * The column <code>pg_catalog.json_each_text.key</code>.
     */
    public final TableField<JsonEachTextRecord, String> KEY = createField(DSL.name("key"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.json_each_text.value</code>.
     */
    public final TableField<JsonEachTextRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.CLOB, this, "");

    private JsonEachText(Name alias, Table<JsonEachTextRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.JSON)
        });
    }

    private JsonEachText(Name alias, Table<JsonEachTextRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.json_each_text</code> table reference
     */
    public JsonEachText(String alias) {
        this(DSL.name(alias), JSON_EACH_TEXT);
    }

    /**
     * Create an aliased <code>pg_catalog.json_each_text</code> table reference
     */
    public JsonEachText(Name alias) {
        this(alias, JSON_EACH_TEXT);
    }

    /**
     * Create a <code>pg_catalog.json_each_text</code> table reference
     */
    public JsonEachText() {
        this(DSL.name("json_each_text"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public JsonEachText as(String alias) {
        return new JsonEachText(DSL.name(alias), this, parameters);
    }

    @Override
    public JsonEachText as(Name alias) {
        return new JsonEachText(alias, this, parameters);
    }

    @Override
    public JsonEachText as(Table<?> alias) {
        return new JsonEachText(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonEachText rename(String name) {
        return new JsonEachText(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonEachText rename(Name name) {
        return new JsonEachText(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonEachText rename(Table<?> name) {
        return new JsonEachText(name.getQualifiedName(), null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public JsonEachText call(
          JSON fromJson
    ) {
        JsonEachText result = new JsonEachText(DSL.name("json_each_text"), null, new Field[] {
            DSL.val(fromJson, SQLDataType.JSON)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public JsonEachText call(
          Field<JSON> fromJson
    ) {
        JsonEachText result = new JsonEachText(DSL.name("json_each_text"), null, new Field[] {
            fromJson
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
