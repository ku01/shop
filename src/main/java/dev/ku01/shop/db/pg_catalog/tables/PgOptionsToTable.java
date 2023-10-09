/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables;


import dev.ku01.shop.db.pg_catalog.PgCatalog;
import dev.ku01.shop.db.pg_catalog.tables.records.PgOptionsToTableRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.Function2;
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
public class PgOptionsToTable extends TableImpl<PgOptionsToTableRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_options_to_table</code>
     */
    public static final PgOptionsToTable PG_OPTIONS_TO_TABLE = new PgOptionsToTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgOptionsToTableRecord> getRecordType() {
        return PgOptionsToTableRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_options_to_table.option_name</code>.
     */
    public final TableField<PgOptionsToTableRecord, String> OPTION_NAME = createField(DSL.name("option_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_options_to_table.option_value</code>.
     */
    public final TableField<PgOptionsToTableRecord, String> OPTION_VALUE = createField(DSL.name("option_value"), SQLDataType.CLOB, this, "");

    private PgOptionsToTable(Name alias, Table<PgOptionsToTableRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.CLOB.array())
        });
    }

    private PgOptionsToTable(Name alias, Table<PgOptionsToTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_options_to_table</code> table
     * reference
     */
    public PgOptionsToTable(String alias) {
        this(DSL.name(alias), PG_OPTIONS_TO_TABLE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_options_to_table</code> table
     * reference
     */
    public PgOptionsToTable(Name alias) {
        this(alias, PG_OPTIONS_TO_TABLE);
    }

    /**
     * Create a <code>pg_catalog.pg_options_to_table</code> table reference
     */
    public PgOptionsToTable() {
        this(DSL.name("pg_options_to_table"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgOptionsToTable as(String alias) {
        return new PgOptionsToTable(DSL.name(alias), this, parameters);
    }

    @Override
    public PgOptionsToTable as(Name alias) {
        return new PgOptionsToTable(alias, this, parameters);
    }

    @Override
    public PgOptionsToTable as(Table<?> alias) {
        return new PgOptionsToTable(alias.getQualifiedName(), this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOptionsToTable rename(String name) {
        return new PgOptionsToTable(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOptionsToTable rename(Name name) {
        return new PgOptionsToTable(name, null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgOptionsToTable rename(Table<?> name) {
        return new PgOptionsToTable(name.getQualifiedName(), null, parameters);
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
    public PgOptionsToTable call(
          String[] optionsArray
    ) {
        PgOptionsToTable result = new PgOptionsToTable(DSL.name("pg_options_to_table"), null, new Field[] {
            DSL.val(optionsArray, SQLDataType.CLOB.array())
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgOptionsToTable call(
          Field<String[]> optionsArray
    ) {
        PgOptionsToTable result = new PgOptionsToTable(DSL.name("pg_options_to_table"), null, new Field[] {
            optionsArray
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
