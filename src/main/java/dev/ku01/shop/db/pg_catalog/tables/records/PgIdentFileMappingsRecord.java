/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.PgIdentFileMappings;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgIdentFileMappingsRecord extends TableRecordImpl<PgIdentFileMappingsRecord> implements Record7<Integer, String, Integer, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_ident_file_mappings.map_number</code>.
     */
    public void setMapNumber(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ident_file_mappings.map_number</code>.
     */
    public Integer getMapNumber() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_ident_file_mappings.file_name</code>.
     */
    public void setFileName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ident_file_mappings.file_name</code>.
     */
    public String getFileName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_ident_file_mappings.line_number</code>.
     */
    public void setLineNumber(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ident_file_mappings.line_number</code>.
     */
    public Integer getLineNumber() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_ident_file_mappings.map_name</code>.
     */
    public void setMapName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ident_file_mappings.map_name</code>.
     */
    public String getMapName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_ident_file_mappings.sys_name</code>.
     */
    public void setSysName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ident_file_mappings.sys_name</code>.
     */
    public String getSysName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_ident_file_mappings.pg_username</code>.
     */
    public void setPgUsername(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ident_file_mappings.pg_username</code>.
     */
    public String getPgUsername() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_ident_file_mappings.error</code>.
     */
    public void setError(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ident_file_mappings.error</code>.
     */
    public String getError() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, Integer, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, String, Integer, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PgIdentFileMappings.PG_IDENT_FILE_MAPPINGS.MAP_NUMBER;
    }

    @Override
    public Field<String> field2() {
        return PgIdentFileMappings.PG_IDENT_FILE_MAPPINGS.FILE_NAME;
    }

    @Override
    public Field<Integer> field3() {
        return PgIdentFileMappings.PG_IDENT_FILE_MAPPINGS.LINE_NUMBER;
    }

    @Override
    public Field<String> field4() {
        return PgIdentFileMappings.PG_IDENT_FILE_MAPPINGS.MAP_NAME;
    }

    @Override
    public Field<String> field5() {
        return PgIdentFileMappings.PG_IDENT_FILE_MAPPINGS.SYS_NAME;
    }

    @Override
    public Field<String> field6() {
        return PgIdentFileMappings.PG_IDENT_FILE_MAPPINGS.PG_USERNAME;
    }

    @Override
    public Field<String> field7() {
        return PgIdentFileMappings.PG_IDENT_FILE_MAPPINGS.ERROR;
    }

    @Override
    public Integer component1() {
        return getMapNumber();
    }

    @Override
    public String component2() {
        return getFileName();
    }

    @Override
    public Integer component3() {
        return getLineNumber();
    }

    @Override
    public String component4() {
        return getMapName();
    }

    @Override
    public String component5() {
        return getSysName();
    }

    @Override
    public String component6() {
        return getPgUsername();
    }

    @Override
    public String component7() {
        return getError();
    }

    @Override
    public Integer value1() {
        return getMapNumber();
    }

    @Override
    public String value2() {
        return getFileName();
    }

    @Override
    public Integer value3() {
        return getLineNumber();
    }

    @Override
    public String value4() {
        return getMapName();
    }

    @Override
    public String value5() {
        return getSysName();
    }

    @Override
    public String value6() {
        return getPgUsername();
    }

    @Override
    public String value7() {
        return getError();
    }

    @Override
    public PgIdentFileMappingsRecord value1(Integer value) {
        setMapNumber(value);
        return this;
    }

    @Override
    public PgIdentFileMappingsRecord value2(String value) {
        setFileName(value);
        return this;
    }

    @Override
    public PgIdentFileMappingsRecord value3(Integer value) {
        setLineNumber(value);
        return this;
    }

    @Override
    public PgIdentFileMappingsRecord value4(String value) {
        setMapName(value);
        return this;
    }

    @Override
    public PgIdentFileMappingsRecord value5(String value) {
        setSysName(value);
        return this;
    }

    @Override
    public PgIdentFileMappingsRecord value6(String value) {
        setPgUsername(value);
        return this;
    }

    @Override
    public PgIdentFileMappingsRecord value7(String value) {
        setError(value);
        return this;
    }

    @Override
    public PgIdentFileMappingsRecord values(Integer value1, String value2, Integer value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgIdentFileMappingsRecord
     */
    public PgIdentFileMappingsRecord() {
        super(PgIdentFileMappings.PG_IDENT_FILE_MAPPINGS);
    }

    /**
     * Create a detached, initialised PgIdentFileMappingsRecord
     */
    public PgIdentFileMappingsRecord(Integer mapNumber, String fileName, Integer lineNumber, String mapName, String sysName, String pgUsername, String error) {
        super(PgIdentFileMappings.PG_IDENT_FILE_MAPPINGS);

        setMapNumber(mapNumber);
        setFileName(fileName);
        setLineNumber(lineNumber);
        setMapName(mapName);
        setSysName(sysName);
        setPgUsername(pgUsername);
        setError(error);
        resetChangedOnNotNull();
    }
}
