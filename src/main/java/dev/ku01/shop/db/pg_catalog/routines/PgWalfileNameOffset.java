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
public class PgWalfileNameOffset extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> LSN = Internal.createParameter("lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * The parameter <code>pg_catalog.pg_walfile_name_offset.file_name</code>.
     */
    public static final Parameter<String> FILE_NAME = Internal.createParameter("file_name", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_walfile_name_offset.file_offset</code>.
     */
    public static final Parameter<Integer> FILE_OFFSET = Internal.createParameter("file_offset", SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public PgWalfileNameOffset() {
        super("pg_walfile_name_offset", PgCatalog.PG_CATALOG);

        addInParameter(LSN);
        addOutParameter(FILE_NAME);
        addOutParameter(FILE_OFFSET);
    }

    /**
     * Set the <code>lsn</code> parameter IN value to the routine
     */
    public void setLsn(Object value) {
        setValue(LSN, value);
    }

    /**
     * Get the <code>file_name</code> parameter OUT value from the routine
     */
    public String getFileName() {
        return get(FILE_NAME);
    }

    /**
     * Get the <code>file_offset</code> parameter OUT value from the routine
     */
    public Integer getFileOffset() {
        return get(FILE_OFFSET);
    }
}
