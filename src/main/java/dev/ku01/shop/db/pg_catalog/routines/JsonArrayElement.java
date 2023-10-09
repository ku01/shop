/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.routines;


import dev.ku01.shop.db.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonArrayElement extends AbstractRoutine<JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.json_array_element.RETURN_VALUE</code>.
     */
    public static final Parameter<JSON> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.JSON, false, false);

    /**
     * The parameter <code>pg_catalog.json_array_element.from_json</code>.
     */
    public static final Parameter<JSON> FROM_JSON = Internal.createParameter("from_json", SQLDataType.JSON, false, false);

    /**
     * The parameter <code>pg_catalog.json_array_element.element_index</code>.
     */
    public static final Parameter<Integer> ELEMENT_INDEX = Internal.createParameter("element_index", SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public JsonArrayElement() {
        super("json_array_element", PgCatalog.PG_CATALOG, SQLDataType.JSON);

        setReturnParameter(RETURN_VALUE);
        addInParameter(FROM_JSON);
        addInParameter(ELEMENT_INDEX);
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    public void setFromJson(JSON value) {
        setValue(FROM_JSON, value);
    }

    /**
     * Set the <code>from_json</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setFromJson(Field<JSON> field) {
        setField(FROM_JSON, field);
    }

    /**
     * Set the <code>element_index</code> parameter IN value to the routine
     */
    public void setElementIndex(Integer value) {
        setValue(ELEMENT_INDEX, value);
    }

    /**
     * Set the <code>element_index</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public void setElementIndex(Field<Integer> field) {
        setField(ELEMENT_INDEX, field);
    }
}
