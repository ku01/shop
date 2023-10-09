/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.information_schema.tables;


import dev.ku01.shop.db.information_schema.InformationSchema;
import dev.ku01.shop.db.information_schema.tables.records.RoutinesRecord;

import java.time.OffsetDateTime;

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
public class Routines extends TableImpl<RoutinesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.routines</code>
     */
    public static final Routines ROUTINES = new Routines();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoutinesRecord> getRecordType() {
        return RoutinesRecord.class;
    }

    /**
     * The column <code>information_schema.routines.specific_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.specific_schema</code>.
     */
    public final TableField<RoutinesRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.specific_name</code>.
     */
    public final TableField<RoutinesRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.routine_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_CATALOG = createField(DSL.name("routine_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.routine_schema</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_SCHEMA = createField(DSL.name("routine_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.routine_name</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_NAME = createField(DSL.name("routine_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.routine_type</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_TYPE = createField(DSL.name("routine_type"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.module_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> MODULE_CATALOG = createField(DSL.name("module_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.module_schema</code>.
     */
    public final TableField<RoutinesRecord, String> MODULE_SCHEMA = createField(DSL.name("module_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.module_name</code>.
     */
    public final TableField<RoutinesRecord, String> MODULE_NAME = createField(DSL.name("module_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.udt_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.udt_schema</code>.
     */
    public final TableField<RoutinesRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.udt_name</code>.
     */
    public final TableField<RoutinesRecord, String> UDT_NAME = createField(DSL.name("udt_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.data_type</code>.
     */
    public final TableField<RoutinesRecord, String> DATA_TYPE = createField(DSL.name("data_type"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.character_maximum_length</code>.
     */
    public final TableField<RoutinesRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.character_octet_length</code>.
     */
    public final TableField<RoutinesRecord, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.character_set_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.character_set_schema</code>.
     */
    public final TableField<RoutinesRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.character_set_name</code>.
     */
    public final TableField<RoutinesRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.collation_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.collation_schema</code>.
     */
    public final TableField<RoutinesRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.collation_name</code>.
     */
    public final TableField<RoutinesRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.numeric_precision</code>.
     */
    public final TableField<RoutinesRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.numeric_precision_radix</code>.
     */
    public final TableField<RoutinesRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.numeric_scale</code>.
     */
    public final TableField<RoutinesRecord, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.datetime_precision</code>.
     */
    public final TableField<RoutinesRecord, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.interval_type</code>.
     */
    public final TableField<RoutinesRecord, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.interval_precision</code>.
     */
    public final TableField<RoutinesRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.type_udt_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> TYPE_UDT_CATALOG = createField(DSL.name("type_udt_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.type_udt_schema</code>.
     */
    public final TableField<RoutinesRecord, String> TYPE_UDT_SCHEMA = createField(DSL.name("type_udt_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.type_udt_name</code>.
     */
    public final TableField<RoutinesRecord, String> TYPE_UDT_NAME = createField(DSL.name("type_udt_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.scope_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.scope_schema</code>.
     */
    public final TableField<RoutinesRecord, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.scope_name</code>.
     */
    public final TableField<RoutinesRecord, String> SCOPE_NAME = createField(DSL.name("scope_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.maximum_cardinality</code>.
     */
    public final TableField<RoutinesRecord, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.dtd_identifier</code>.
     */
    public final TableField<RoutinesRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.routine_body</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_BODY = createField(DSL.name("routine_body"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.routine_definition</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_DEFINITION = createField(DSL.name("routine_definition"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.external_name</code>.
     */
    public final TableField<RoutinesRecord, String> EXTERNAL_NAME = createField(DSL.name("external_name"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.external_language</code>.
     */
    public final TableField<RoutinesRecord, String> EXTERNAL_LANGUAGE = createField(DSL.name("external_language"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.parameter_style</code>.
     */
    public final TableField<RoutinesRecord, String> PARAMETER_STYLE = createField(DSL.name("parameter_style"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.is_deterministic</code>.
     */
    public final TableField<RoutinesRecord, String> IS_DETERMINISTIC = createField(DSL.name("is_deterministic"), dev.ku01.shop.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.sql_data_access</code>.
     */
    public final TableField<RoutinesRecord, String> SQL_DATA_ACCESS = createField(DSL.name("sql_data_access"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.is_null_call</code>.
     */
    public final TableField<RoutinesRecord, String> IS_NULL_CALL = createField(DSL.name("is_null_call"), dev.ku01.shop.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.sql_path</code>.
     */
    public final TableField<RoutinesRecord, String> SQL_PATH = createField(DSL.name("sql_path"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.schema_level_routine</code>.
     */
    public final TableField<RoutinesRecord, String> SCHEMA_LEVEL_ROUTINE = createField(DSL.name("schema_level_routine"), dev.ku01.shop.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.max_dynamic_result_sets</code>.
     */
    public final TableField<RoutinesRecord, Integer> MAX_DYNAMIC_RESULT_SETS = createField(DSL.name("max_dynamic_result_sets"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.is_user_defined_cast</code>.
     */
    public final TableField<RoutinesRecord, String> IS_USER_DEFINED_CAST = createField(DSL.name("is_user_defined_cast"), dev.ku01.shop.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.is_implicitly_invocable</code>.
     */
    public final TableField<RoutinesRecord, String> IS_IMPLICITLY_INVOCABLE = createField(DSL.name("is_implicitly_invocable"), dev.ku01.shop.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.security_type</code>.
     */
    public final TableField<RoutinesRecord, String> SECURITY_TYPE = createField(DSL.name("security_type"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.to_sql_specific_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_CATALOG = createField(DSL.name("to_sql_specific_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.to_sql_specific_schema</code>.
     */
    public final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_SCHEMA = createField(DSL.name("to_sql_specific_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.to_sql_specific_name</code>.
     */
    public final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_NAME = createField(DSL.name("to_sql_specific_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.as_locator</code>.
     */
    public final TableField<RoutinesRecord, String> AS_LOCATOR = createField(DSL.name("as_locator"), dev.ku01.shop.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.created</code>.
     */
    public final TableField<RoutinesRecord, OffsetDateTime> CREATED = createField(DSL.name("created"), dev.ku01.shop.db.information_schema.Domains.TIME_STAMP.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.last_altered</code>.
     */
    public final TableField<RoutinesRecord, OffsetDateTime> LAST_ALTERED = createField(DSL.name("last_altered"), dev.ku01.shop.db.information_schema.Domains.TIME_STAMP.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.new_savepoint_level</code>.
     */
    public final TableField<RoutinesRecord, String> NEW_SAVEPOINT_LEVEL = createField(DSL.name("new_savepoint_level"), dev.ku01.shop.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.is_udt_dependent</code>.
     */
    public final TableField<RoutinesRecord, String> IS_UDT_DEPENDENT = createField(DSL.name("is_udt_dependent"), dev.ku01.shop.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_from_data_type</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_FROM_DATA_TYPE = createField(DSL.name("result_cast_from_data_type"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_as_locator</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_AS_LOCATOR = createField(DSL.name("result_cast_as_locator"), dev.ku01.shop.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_max_length</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_CHAR_MAX_LENGTH = createField(DSL.name("result_cast_char_max_length"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_octet_length</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_CHAR_OCTET_LENGTH = createField(DSL.name("result_cast_char_octet_length"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_set_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_CHAR_SET_CATALOG = createField(DSL.name("result_cast_char_set_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_set_schema</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_CHAR_SET_SCHEMA = createField(DSL.name("result_cast_char_set_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_set_name</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_CHAR_SET_NAME = createField(DSL.name("result_cast_char_set_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_collation_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_CATALOG = createField(DSL.name("result_cast_collation_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_collation_schema</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_SCHEMA = createField(DSL.name("result_cast_collation_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_collation_name</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_NAME = createField(DSL.name("result_cast_collation_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_numeric_precision</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_NUMERIC_PRECISION = createField(DSL.name("result_cast_numeric_precision"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_numeric_precision_radix</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_NUMERIC_PRECISION_RADIX = createField(DSL.name("result_cast_numeric_precision_radix"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_numeric_scale</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_NUMERIC_SCALE = createField(DSL.name("result_cast_numeric_scale"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_datetime_precision</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_DATETIME_PRECISION = createField(DSL.name("result_cast_datetime_precision"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_interval_type</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_INTERVAL_TYPE = createField(DSL.name("result_cast_interval_type"), dev.ku01.shop.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_interval_precision</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_INTERVAL_PRECISION = createField(DSL.name("result_cast_interval_precision"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_type_udt_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_CATALOG = createField(DSL.name("result_cast_type_udt_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_type_udt_schema</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_SCHEMA = createField(DSL.name("result_cast_type_udt_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_type_udt_name</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_NAME = createField(DSL.name("result_cast_type_udt_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_scope_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_CATALOG = createField(DSL.name("result_cast_scope_catalog"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_scope_schema</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_SCHEMA = createField(DSL.name("result_cast_scope_schema"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_scope_name</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_NAME = createField(DSL.name("result_cast_scope_name"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_maximum_cardinality</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_MAXIMUM_CARDINALITY = createField(DSL.name("result_cast_maximum_cardinality"), dev.ku01.shop.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_dtd_identifier</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_DTD_IDENTIFIER = createField(DSL.name("result_cast_dtd_identifier"), dev.ku01.shop.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private Routines(Name alias, Table<RoutinesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Routines(Name alias, Table<RoutinesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "routines" as  SELECT (current_database())::information_schema.sql_identifier AS specific_catalog,
          (n.nspname)::information_schema.sql_identifier AS specific_schema,
          (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS specific_name,
          (current_database())::information_schema.sql_identifier AS routine_catalog,
          (n.nspname)::information_schema.sql_identifier AS routine_schema,
          (p.proname)::information_schema.sql_identifier AS routine_name,
          (
              CASE p.prokind
                  WHEN 'f'::"char" THEN 'FUNCTION'::text
                  WHEN 'p'::"char" THEN 'PROCEDURE'::text
                  ELSE NULL::text
              END)::information_schema.character_data AS routine_type,
          (NULL::name)::information_schema.sql_identifier AS module_catalog,
          (NULL::name)::information_schema.sql_identifier AS module_schema,
          (NULL::name)::information_schema.sql_identifier AS module_name,
          (NULL::name)::information_schema.sql_identifier AS udt_catalog,
          (NULL::name)::information_schema.sql_identifier AS udt_schema,
          (NULL::name)::information_schema.sql_identifier AS udt_name,
          (
              CASE
                  WHEN (p.prokind = 'p'::"char") THEN NULL::text
                  WHEN ((t.typelem <> (0)::oid) AND (t.typlen = '-1'::integer)) THEN 'ARRAY'::text
                  WHEN (nt.nspname = 'pg_catalog'::name) THEN format_type(t.oid, NULL::integer)
                  ELSE 'USER-DEFINED'::text
              END)::information_schema.character_data AS data_type,
          (NULL::integer)::information_schema.cardinal_number AS character_maximum_length,
          (NULL::integer)::information_schema.cardinal_number AS character_octet_length,
          (NULL::name)::information_schema.sql_identifier AS character_set_catalog,
          (NULL::name)::information_schema.sql_identifier AS character_set_schema,
          (NULL::name)::information_schema.sql_identifier AS character_set_name,
          (NULL::name)::information_schema.sql_identifier AS collation_catalog,
          (NULL::name)::information_schema.sql_identifier AS collation_schema,
          (NULL::name)::information_schema.sql_identifier AS collation_name,
          (NULL::integer)::information_schema.cardinal_number AS numeric_precision,
          (NULL::integer)::information_schema.cardinal_number AS numeric_precision_radix,
          (NULL::integer)::information_schema.cardinal_number AS numeric_scale,
          (NULL::integer)::information_schema.cardinal_number AS datetime_precision,
          (NULL::character varying)::information_schema.character_data AS interval_type,
          (NULL::integer)::information_schema.cardinal_number AS interval_precision,
          (
              CASE
                  WHEN (nt.nspname IS NOT NULL) THEN current_database()
                  ELSE NULL::name
              END)::information_schema.sql_identifier AS type_udt_catalog,
          (nt.nspname)::information_schema.sql_identifier AS type_udt_schema,
          (t.typname)::information_schema.sql_identifier AS type_udt_name,
          (NULL::name)::information_schema.sql_identifier AS scope_catalog,
          (NULL::name)::information_schema.sql_identifier AS scope_schema,
          (NULL::name)::information_schema.sql_identifier AS scope_name,
          (NULL::integer)::information_schema.cardinal_number AS maximum_cardinality,
          (
              CASE
                  WHEN (p.prokind <> 'p'::"char") THEN 0
                  ELSE NULL::integer
              END)::information_schema.sql_identifier AS dtd_identifier,
          (
              CASE
                  WHEN (l.lanname = 'sql'::name) THEN 'SQL'::text
                  ELSE 'EXTERNAL'::text
              END)::information_schema.character_data AS routine_body,
          (
              CASE
                  WHEN pg_has_role(p.proowner, 'USAGE'::text) THEN p.prosrc
                  ELSE NULL::text
              END)::information_schema.character_data AS routine_definition,
          (
              CASE
                  WHEN (l.lanname = 'c'::name) THEN p.prosrc
                  ELSE NULL::text
              END)::information_schema.character_data AS external_name,
          (upper((l.lanname)::text))::information_schema.character_data AS external_language,
          ('GENERAL'::character varying)::information_schema.character_data AS parameter_style,
          (
              CASE
                  WHEN (p.provolatile = 'i'::"char") THEN 'YES'::text
                  ELSE 'NO'::text
              END)::information_schema.yes_or_no AS is_deterministic,
          ('MODIFIES'::character varying)::information_schema.character_data AS sql_data_access,
          (
              CASE
                  WHEN (p.prokind <> 'p'::"char") THEN
                  CASE
                      WHEN p.proisstrict THEN 'YES'::text
                      ELSE 'NO'::text
                  END
                  ELSE NULL::text
              END)::information_schema.yes_or_no AS is_null_call,
          (NULL::character varying)::information_schema.character_data AS sql_path,
          ('YES'::character varying)::information_schema.yes_or_no AS schema_level_routine,
          (0)::information_schema.cardinal_number AS max_dynamic_result_sets,
          (NULL::character varying)::information_schema.yes_or_no AS is_user_defined_cast,
          (NULL::character varying)::information_schema.yes_or_no AS is_implicitly_invocable,
          (
              CASE
                  WHEN p.prosecdef THEN 'DEFINER'::text
                  ELSE 'INVOKER'::text
              END)::information_schema.character_data AS security_type,
          (NULL::name)::information_schema.sql_identifier AS to_sql_specific_catalog,
          (NULL::name)::information_schema.sql_identifier AS to_sql_specific_schema,
          (NULL::name)::information_schema.sql_identifier AS to_sql_specific_name,
          ('NO'::character varying)::information_schema.yes_or_no AS as_locator,
          (NULL::timestamp with time zone)::information_schema.time_stamp AS created,
          (NULL::timestamp with time zone)::information_schema.time_stamp AS last_altered,
          (NULL::character varying)::information_schema.yes_or_no AS new_savepoint_level,
          ('NO'::character varying)::information_schema.yes_or_no AS is_udt_dependent,
          (NULL::character varying)::information_schema.character_data AS result_cast_from_data_type,
          (NULL::character varying)::information_schema.yes_or_no AS result_cast_as_locator,
          (NULL::integer)::information_schema.cardinal_number AS result_cast_char_max_length,
          (NULL::integer)::information_schema.cardinal_number AS result_cast_char_octet_length,
          (NULL::name)::information_schema.sql_identifier AS result_cast_char_set_catalog,
          (NULL::name)::information_schema.sql_identifier AS result_cast_char_set_schema,
          (NULL::name)::information_schema.sql_identifier AS result_cast_char_set_name,
          (NULL::name)::information_schema.sql_identifier AS result_cast_collation_catalog,
          (NULL::name)::information_schema.sql_identifier AS result_cast_collation_schema,
          (NULL::name)::information_schema.sql_identifier AS result_cast_collation_name,
          (NULL::integer)::information_schema.cardinal_number AS result_cast_numeric_precision,
          (NULL::integer)::information_schema.cardinal_number AS result_cast_numeric_precision_radix,
          (NULL::integer)::information_schema.cardinal_number AS result_cast_numeric_scale,
          (NULL::integer)::information_schema.cardinal_number AS result_cast_datetime_precision,
          (NULL::character varying)::information_schema.character_data AS result_cast_interval_type,
          (NULL::integer)::information_schema.cardinal_number AS result_cast_interval_precision,
          (NULL::name)::information_schema.sql_identifier AS result_cast_type_udt_catalog,
          (NULL::name)::information_schema.sql_identifier AS result_cast_type_udt_schema,
          (NULL::name)::information_schema.sql_identifier AS result_cast_type_udt_name,
          (NULL::name)::information_schema.sql_identifier AS result_cast_scope_catalog,
          (NULL::name)::information_schema.sql_identifier AS result_cast_scope_schema,
          (NULL::name)::information_schema.sql_identifier AS result_cast_scope_name,
          (NULL::integer)::information_schema.cardinal_number AS result_cast_maximum_cardinality,
          (NULL::name)::information_schema.sql_identifier AS result_cast_dtd_identifier
         FROM (((pg_namespace n
           JOIN pg_proc p ON ((n.oid = p.pronamespace)))
           JOIN pg_language l ON ((p.prolang = l.oid)))
           LEFT JOIN (pg_type t
           JOIN pg_namespace nt ON ((t.typnamespace = nt.oid))) ON (((p.prorettype = t.oid) AND (p.prokind <> 'p'::"char"))))
        WHERE (pg_has_role(p.proowner, 'USAGE'::text) OR has_function_privilege(p.oid, 'EXECUTE'::text));
        """));
    }

    /**
     * Create an aliased <code>information_schema.routines</code> table
     * reference
     */
    public Routines(String alias) {
        this(DSL.name(alias), ROUTINES);
    }

    /**
     * Create an aliased <code>information_schema.routines</code> table
     * reference
     */
    public Routines(Name alias) {
        this(alias, ROUTINES);
    }

    /**
     * Create a <code>information_schema.routines</code> table reference
     */
    public Routines() {
        this(DSL.name("routines"), null);
    }

    public <O extends Record> Routines(Table<O> child, ForeignKey<O, RoutinesRecord> key) {
        super(child, key, ROUTINES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Routines as(String alias) {
        return new Routines(DSL.name(alias), this);
    }

    @Override
    public Routines as(Name alias) {
        return new Routines(alias, this);
    }

    @Override
    public Routines as(Table<?> alias) {
        return new Routines(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Routines rename(String name) {
        return new Routines(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Routines rename(Name name) {
        return new Routines(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Routines rename(Table<?> name) {
        return new Routines(name.getQualifiedName(), null);
    }
}
