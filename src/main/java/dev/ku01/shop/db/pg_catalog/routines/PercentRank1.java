/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.routines;


import dev.ku01.shop.db.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PercentRank1 extends AbstractRoutine<Double> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.percent_rank.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.DOUBLE, false, false);

    /**
     * Create a new routine call instance
     */
    public PercentRank1() {
        super("percent_rank", PgCatalog.PG_CATALOG, SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        setOverloaded(true);
    }
}