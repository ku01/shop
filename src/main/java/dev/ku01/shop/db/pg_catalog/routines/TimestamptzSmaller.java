/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.routines;


import dev.ku01.shop.db.pg_catalog.PgCatalog;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimestamptzSmaller extends AbstractRoutine<OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.timestamptz_smaller.RETURN_VALUE</code>.
     */
    public static final Parameter<OffsetDateTime> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false);

    /**
     * The parameter <code>pg_catalog.timestamptz_smaller._1</code>.
     */
    public static final Parameter<OffsetDateTime> _1 = Internal.createParameter("_1", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true);

    /**
     * The parameter <code>pg_catalog.timestamptz_smaller._2</code>.
     */
    public static final Parameter<OffsetDateTime> _2 = Internal.createParameter("_2", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true);

    /**
     * Create a new routine call instance
     */
    public TimestamptzSmaller() {
        super("timestamptz_smaller", PgCatalog.PG_CATALOG, SQLDataType.TIMESTAMPWITHTIMEZONE(6));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(OffsetDateTime value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<OffsetDateTime> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(OffsetDateTime value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<OffsetDateTime> field) {
        setField(_2, field);
    }
}
