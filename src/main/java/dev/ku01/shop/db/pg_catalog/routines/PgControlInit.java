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
public class PgControlInit extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.pg_control_init.max_data_alignment</code>.
     */
    public static final Parameter<Integer> MAX_DATA_ALIGNMENT = Internal.createParameter("max_data_alignment", SQLDataType.INTEGER, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_control_init.database_block_size</code>.
     */
    public static final Parameter<Integer> DATABASE_BLOCK_SIZE = Internal.createParameter("database_block_size", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_init.blocks_per_segment</code>.
     */
    public static final Parameter<Integer> BLOCKS_PER_SEGMENT = Internal.createParameter("blocks_per_segment", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_init.wal_block_size</code>.
     */
    public static final Parameter<Integer> WAL_BLOCK_SIZE = Internal.createParameter("wal_block_size", SQLDataType.INTEGER, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_control_init.bytes_per_wal_segment</code>.
     */
    public static final Parameter<Integer> BYTES_PER_WAL_SEGMENT = Internal.createParameter("bytes_per_wal_segment", SQLDataType.INTEGER, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_control_init.max_identifier_length</code>.
     */
    public static final Parameter<Integer> MAX_IDENTIFIER_LENGTH = Internal.createParameter("max_identifier_length", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.pg_control_init.max_index_columns</code>.
     */
    public static final Parameter<Integer> MAX_INDEX_COLUMNS = Internal.createParameter("max_index_columns", SQLDataType.INTEGER, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_control_init.max_toast_chunk_size</code>.
     */
    public static final Parameter<Integer> MAX_TOAST_CHUNK_SIZE = Internal.createParameter("max_toast_chunk_size", SQLDataType.INTEGER, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_control_init.large_object_chunk_size</code>.
     */
    public static final Parameter<Integer> LARGE_OBJECT_CHUNK_SIZE = Internal.createParameter("large_object_chunk_size", SQLDataType.INTEGER, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_control_init.float8_pass_by_value</code>.
     */
    public static final Parameter<Boolean> FLOAT8_PASS_BY_VALUE = Internal.createParameter("float8_pass_by_value", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_control_init.data_page_checksum_version</code>.
     */
    public static final Parameter<Integer> DATA_PAGE_CHECKSUM_VERSION = Internal.createParameter("data_page_checksum_version", SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public PgControlInit() {
        super("pg_control_init", PgCatalog.PG_CATALOG);

        addOutParameter(MAX_DATA_ALIGNMENT);
        addOutParameter(DATABASE_BLOCK_SIZE);
        addOutParameter(BLOCKS_PER_SEGMENT);
        addOutParameter(WAL_BLOCK_SIZE);
        addOutParameter(BYTES_PER_WAL_SEGMENT);
        addOutParameter(MAX_IDENTIFIER_LENGTH);
        addOutParameter(MAX_INDEX_COLUMNS);
        addOutParameter(MAX_TOAST_CHUNK_SIZE);
        addOutParameter(LARGE_OBJECT_CHUNK_SIZE);
        addOutParameter(FLOAT8_PASS_BY_VALUE);
        addOutParameter(DATA_PAGE_CHECKSUM_VERSION);
    }

    /**
     * Get the <code>max_data_alignment</code> parameter OUT value from the
     * routine
     */
    public Integer getMaxDataAlignment() {
        return get(MAX_DATA_ALIGNMENT);
    }

    /**
     * Get the <code>database_block_size</code> parameter OUT value from the
     * routine
     */
    public Integer getDatabaseBlockSize() {
        return get(DATABASE_BLOCK_SIZE);
    }

    /**
     * Get the <code>blocks_per_segment</code> parameter OUT value from the
     * routine
     */
    public Integer getBlocksPerSegment() {
        return get(BLOCKS_PER_SEGMENT);
    }

    /**
     * Get the <code>wal_block_size</code> parameter OUT value from the routine
     */
    public Integer getWalBlockSize() {
        return get(WAL_BLOCK_SIZE);
    }

    /**
     * Get the <code>bytes_per_wal_segment</code> parameter OUT value from the
     * routine
     */
    public Integer getBytesPerWalSegment() {
        return get(BYTES_PER_WAL_SEGMENT);
    }

    /**
     * Get the <code>max_identifier_length</code> parameter OUT value from the
     * routine
     */
    public Integer getMaxIdentifierLength() {
        return get(MAX_IDENTIFIER_LENGTH);
    }

    /**
     * Get the <code>max_index_columns</code> parameter OUT value from the
     * routine
     */
    public Integer getMaxIndexColumns() {
        return get(MAX_INDEX_COLUMNS);
    }

    /**
     * Get the <code>max_toast_chunk_size</code> parameter OUT value from the
     * routine
     */
    public Integer getMaxToastChunkSize() {
        return get(MAX_TOAST_CHUNK_SIZE);
    }

    /**
     * Get the <code>large_object_chunk_size</code> parameter OUT value from the
     * routine
     */
    public Integer getLargeObjectChunkSize() {
        return get(LARGE_OBJECT_CHUNK_SIZE);
    }

    /**
     * Get the <code>float8_pass_by_value</code> parameter OUT value from the
     * routine
     */
    public Boolean getFloat8PassByValue() {
        return get(FLOAT8_PASS_BY_VALUE);
    }

    /**
     * Get the <code>data_page_checksum_version</code> parameter OUT value from
     * the routine
     */
    public Integer getDataPageChecksumVersion() {
        return get(DATA_PAGE_CHECKSUM_VERSION);
    }
}