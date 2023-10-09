/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.information_schema.tables.records;


import dev.ku01.shop.db.information_schema.tables.TablePrivileges;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablePrivilegesRecord extends TableRecordImpl<TablePrivilegesRecord> implements Record8<String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.table_privileges.grantor</code>.
     */
    public void setGrantor(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.table_privileges.grantor</code>.
     */
    public String getGrantor() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.table_privileges.grantee</code>.
     */
    public void setGrantee(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.table_privileges.grantee</code>.
     */
    public String getGrantee() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.table_privileges.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_privileges.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.table_privileges.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.table_privileges.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.table_privileges.table_name</code>.
     */
    public void setTableName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.table_privileges.table_name</code>.
     */
    public String getTableName() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.table_privileges.privilege_type</code>.
     */
    public void setPrivilegeType(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_privileges.privilege_type</code>.
     */
    public String getPrivilegeType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.table_privileges.is_grantable</code>.
     */
    public void setIsGrantable(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.table_privileges.is_grantable</code>.
     */
    public String getIsGrantable() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.table_privileges.with_hierarchy</code>.
     */
    public void setWithHierarchy(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.table_privileges.with_hierarchy</code>.
     */
    public String getWithHierarchy() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TablePrivileges.TABLE_PRIVILEGES.GRANTOR;
    }

    @Override
    public Field<String> field2() {
        return TablePrivileges.TABLE_PRIVILEGES.GRANTEE;
    }

    @Override
    public Field<String> field3() {
        return TablePrivileges.TABLE_PRIVILEGES.TABLE_CATALOG;
    }

    @Override
    public Field<String> field4() {
        return TablePrivileges.TABLE_PRIVILEGES.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field5() {
        return TablePrivileges.TABLE_PRIVILEGES.TABLE_NAME;
    }

    @Override
    public Field<String> field6() {
        return TablePrivileges.TABLE_PRIVILEGES.PRIVILEGE_TYPE;
    }

    @Override
    public Field<String> field7() {
        return TablePrivileges.TABLE_PRIVILEGES.IS_GRANTABLE;
    }

    @Override
    public Field<String> field8() {
        return TablePrivileges.TABLE_PRIVILEGES.WITH_HIERARCHY;
    }

    @Override
    public String component1() {
        return getGrantor();
    }

    @Override
    public String component2() {
        return getGrantee();
    }

    @Override
    public String component3() {
        return getTableCatalog();
    }

    @Override
    public String component4() {
        return getTableSchema();
    }

    @Override
    public String component5() {
        return getTableName();
    }

    @Override
    public String component6() {
        return getPrivilegeType();
    }

    @Override
    public String component7() {
        return getIsGrantable();
    }

    @Override
    public String component8() {
        return getWithHierarchy();
    }

    @Override
    public String value1() {
        return getGrantor();
    }

    @Override
    public String value2() {
        return getGrantee();
    }

    @Override
    public String value3() {
        return getTableCatalog();
    }

    @Override
    public String value4() {
        return getTableSchema();
    }

    @Override
    public String value5() {
        return getTableName();
    }

    @Override
    public String value6() {
        return getPrivilegeType();
    }

    @Override
    public String value7() {
        return getIsGrantable();
    }

    @Override
    public String value8() {
        return getWithHierarchy();
    }

    @Override
    public TablePrivilegesRecord value1(String value) {
        setGrantor(value);
        return this;
    }

    @Override
    public TablePrivilegesRecord value2(String value) {
        setGrantee(value);
        return this;
    }

    @Override
    public TablePrivilegesRecord value3(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public TablePrivilegesRecord value4(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public TablePrivilegesRecord value5(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public TablePrivilegesRecord value6(String value) {
        setPrivilegeType(value);
        return this;
    }

    @Override
    public TablePrivilegesRecord value7(String value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    public TablePrivilegesRecord value8(String value) {
        setWithHierarchy(value);
        return this;
    }

    @Override
    public TablePrivilegesRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TablePrivilegesRecord
     */
    public TablePrivilegesRecord() {
        super(TablePrivileges.TABLE_PRIVILEGES);
    }

    /**
     * Create a detached, initialised TablePrivilegesRecord
     */
    public TablePrivilegesRecord(String grantor, String grantee, String tableCatalog, String tableSchema, String tableName, String privilegeType, String isGrantable, String withHierarchy) {
        super(TablePrivileges.TABLE_PRIVILEGES);

        setGrantor(grantor);
        setGrantee(grantee);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setPrivilegeType(privilegeType);
        setIsGrantable(isGrantable);
        setWithHierarchy(withHierarchy);
        resetChangedOnNotNull();
    }
}
