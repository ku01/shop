/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.routines;


import dev.ku01.shop.db.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonbHashExtended extends AbstractRoutine<Long> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.jsonb_hash_extended.RETURN_VALUE</code>.
     */
    public static final Parameter<Long> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_hash_extended._1</code>.
     */
    public static final Parameter<JSONB> _1 = Internal.createParameter("_1", SQLDataType.JSONB, false, true);

    /**
     * The parameter <code>pg_catalog.jsonb_hash_extended._2</code>.
     */
    public static final Parameter<Long> _2 = Internal.createParameter("_2", SQLDataType.BIGINT, false, true);

    /**
     * Create a new routine call instance
     */
    public JsonbHashExtended() {
        super("jsonb_hash_extended", PgCatalog.PG_CATALOG, SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(JSONB value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<JSONB> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Long value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<Long> field) {
        setField(_2, field);
    }
}
