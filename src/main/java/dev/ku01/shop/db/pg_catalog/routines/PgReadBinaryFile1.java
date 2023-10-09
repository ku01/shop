/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.routines;


import dev.ku01.shop.db.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgReadBinaryFile1 extends AbstractRoutine<byte[]> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.pg_read_binary_file.RETURN_VALUE</code>.
     */
    public static final Parameter<byte[]> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_read_binary_file._1</code>.
     */
    public static final Parameter<String> _1 = Internal.createParameter("_1", SQLDataType.CLOB, false, true);

    /**
     * The parameter <code>pg_catalog.pg_read_binary_file._2</code>.
     */
    public static final Parameter<Long> _2 = Internal.createParameter("_2", SQLDataType.BIGINT, false, true);

    /**
     * The parameter <code>pg_catalog.pg_read_binary_file._3</code>.
     */
    public static final Parameter<Long> _3 = Internal.createParameter("_3", SQLDataType.BIGINT, false, true);

    /**
     * The parameter <code>pg_catalog.pg_read_binary_file._4</code>.
     */
    public static final Parameter<Boolean> _4 = Internal.createParameter("_4", SQLDataType.BOOLEAN, false, true);

    /**
     * Create a new routine call instance
     */
    public PgReadBinaryFile1() {
        super("pg_read_binary_file", PgCatalog.PG_CATALOG, SQLDataType.BLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(String value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<String> field) {
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

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(Long value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__3(Field<Long> field) {
        setField(_3, field);
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    public void set__4(Boolean value) {
        setValue(_4, value);
    }

    /**
     * Set the <code>_4</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__4(Field<Boolean> field) {
        setField(_4, field);
    }
}
