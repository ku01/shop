/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.information_schema.tables.records;


import dev.ku01.shop.db.information_schema.tables.CollationCharacterSetApplicability;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CollationCharacterSetApplicabilityRecord extends TableRecordImpl<CollationCharacterSetApplicabilityRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.collation_catalog</code>.
     */
    public void setCollationCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.collation_catalog</code>.
     */
    public String getCollationCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.collation_schema</code>.
     */
    public void setCollationSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.collation_schema</code>.
     */
    public String getCollationSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.collation_name</code>.
     */
    public void setCollationName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.collation_name</code>.
     */
    public String getCollationName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.character_set_catalog</code>.
     */
    public void setCharacterSetCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.character_set_catalog</code>.
     */
    public String getCharacterSetCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.character_set_schema</code>.
     */
    public void setCharacterSetSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.character_set_schema</code>.
     */
    public String getCharacterSetSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.collation_character_set_applicability.character_set_name</code>.
     */
    public void setCharacterSetName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.collation_character_set_applicability.character_set_name</code>.
     */
    public String getCharacterSetName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME;
    }

    @Override
    public Field<String> field4() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME;
    }

    @Override
    public String component1() {
        return getCollationCatalog();
    }

    @Override
    public String component2() {
        return getCollationSchema();
    }

    @Override
    public String component3() {
        return getCollationName();
    }

    @Override
    public String component4() {
        return getCharacterSetCatalog();
    }

    @Override
    public String component5() {
        return getCharacterSetSchema();
    }

    @Override
    public String component6() {
        return getCharacterSetName();
    }

    @Override
    public String value1() {
        return getCollationCatalog();
    }

    @Override
    public String value2() {
        return getCollationSchema();
    }

    @Override
    public String value3() {
        return getCollationName();
    }

    @Override
    public String value4() {
        return getCharacterSetCatalog();
    }

    @Override
    public String value5() {
        return getCharacterSetSchema();
    }

    @Override
    public String value6() {
        return getCharacterSetName();
    }

    @Override
    public CollationCharacterSetApplicabilityRecord value1(String value) {
        setCollationCatalog(value);
        return this;
    }

    @Override
    public CollationCharacterSetApplicabilityRecord value2(String value) {
        setCollationSchema(value);
        return this;
    }

    @Override
    public CollationCharacterSetApplicabilityRecord value3(String value) {
        setCollationName(value);
        return this;
    }

    @Override
    public CollationCharacterSetApplicabilityRecord value4(String value) {
        setCharacterSetCatalog(value);
        return this;
    }

    @Override
    public CollationCharacterSetApplicabilityRecord value5(String value) {
        setCharacterSetSchema(value);
        return this;
    }

    @Override
    public CollationCharacterSetApplicabilityRecord value6(String value) {
        setCharacterSetName(value);
        return this;
    }

    @Override
    public CollationCharacterSetApplicabilityRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CollationCharacterSetApplicabilityRecord
     */
    public CollationCharacterSetApplicabilityRecord() {
        super(CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);
    }

    /**
     * Create a detached, initialised CollationCharacterSetApplicabilityRecord
     */
    public CollationCharacterSetApplicabilityRecord(String collationCatalog, String collationSchema, String collationName, String characterSetCatalog, String characterSetSchema, String characterSetName) {
        super(CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY);

        setCollationCatalog(collationCatalog);
        setCollationSchema(collationSchema);
        setCollationName(collationName);
        setCharacterSetCatalog(characterSetCatalog);
        setCharacterSetSchema(characterSetSchema);
        setCharacterSetName(characterSetName);
        resetChangedOnNotNull();
    }
}
