/*
 * This file is generated by jOOQ.
 */
package dev.ku01.shop.db.pg_catalog.tables.records;


import dev.ku01.shop.db.pg_catalog.tables.PgStatistic;

import org.jooq.Record3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatisticRecord extends UpdatableRecordImpl<PgStatisticRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_statistic.starelid</code>.
     */
    public void setStarelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.starelid</code>.
     */
    public Long getStarelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.staattnum</code>.
     */
    public void setStaattnum(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.staattnum</code>.
     */
    public Short getStaattnum() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stainherit</code>.
     */
    public void setStainherit(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stainherit</code>.
     */
    public Boolean getStainherit() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stanullfrac</code>.
     */
    public void setStanullfrac(Float value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stanullfrac</code>.
     */
    public Float getStanullfrac() {
        return (Float) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stawidth</code>.
     */
    public void setStawidth(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stawidth</code>.
     */
    public Integer getStawidth() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stadistinct</code>.
     */
    public void setStadistinct(Float value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stadistinct</code>.
     */
    public Float getStadistinct() {
        return (Float) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stakind1</code>.
     */
    public void setStakind1(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stakind1</code>.
     */
    public Short getStakind1() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stakind2</code>.
     */
    public void setStakind2(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stakind2</code>.
     */
    public Short getStakind2() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stakind3</code>.
     */
    public void setStakind3(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stakind3</code>.
     */
    public Short getStakind3() {
        return (Short) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stakind4</code>.
     */
    public void setStakind4(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stakind4</code>.
     */
    public Short getStakind4() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stakind5</code>.
     */
    public void setStakind5(Short value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stakind5</code>.
     */
    public Short getStakind5() {
        return (Short) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.staop1</code>.
     */
    public void setStaop1(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.staop1</code>.
     */
    public Long getStaop1() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.staop2</code>.
     */
    public void setStaop2(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.staop2</code>.
     */
    public Long getStaop2() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.staop3</code>.
     */
    public void setStaop3(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.staop3</code>.
     */
    public Long getStaop3() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.staop4</code>.
     */
    public void setStaop4(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.staop4</code>.
     */
    public Long getStaop4() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.staop5</code>.
     */
    public void setStaop5(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.staop5</code>.
     */
    public Long getStaop5() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stacoll1</code>.
     */
    public void setStacoll1(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stacoll1</code>.
     */
    public Long getStacoll1() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stacoll2</code>.
     */
    public void setStacoll2(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stacoll2</code>.
     */
    public Long getStacoll2() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stacoll3</code>.
     */
    public void setStacoll3(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stacoll3</code>.
     */
    public Long getStacoll3() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stacoll4</code>.
     */
    public void setStacoll4(Long value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stacoll4</code>.
     */
    public Long getStacoll4() {
        return (Long) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stacoll5</code>.
     */
    public void setStacoll5(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stacoll5</code>.
     */
    public Long getStacoll5() {
        return (Long) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stanumbers1</code>.
     */
    public void setStanumbers1(Float[] value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stanumbers1</code>.
     */
    public Float[] getStanumbers1() {
        return (Float[]) get(21);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stanumbers2</code>.
     */
    public void setStanumbers2(Float[] value) {
        set(22, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stanumbers2</code>.
     */
    public Float[] getStanumbers2() {
        return (Float[]) get(22);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stanumbers3</code>.
     */
    public void setStanumbers3(Float[] value) {
        set(23, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stanumbers3</code>.
     */
    public Float[] getStanumbers3() {
        return (Float[]) get(23);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stanumbers4</code>.
     */
    public void setStanumbers4(Float[] value) {
        set(24, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stanumbers4</code>.
     */
    public Float[] getStanumbers4() {
        return (Float[]) get(24);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stanumbers5</code>.
     */
    public void setStanumbers5(Float[] value) {
        set(25, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stanumbers5</code>.
     */
    public Float[] getStanumbers5() {
        return (Float[]) get(25);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stavalues1</code>.
     */
    public void setStavalues1(Object[] value) {
        set(26, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stavalues1</code>.
     */
    public Object[] getStavalues1() {
        return (Object[]) get(26);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stavalues2</code>.
     */
    public void setStavalues2(Object[] value) {
        set(27, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stavalues2</code>.
     */
    public Object[] getStavalues2() {
        return (Object[]) get(27);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stavalues3</code>.
     */
    public void setStavalues3(Object[] value) {
        set(28, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stavalues3</code>.
     */
    public Object[] getStavalues3() {
        return (Object[]) get(28);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stavalues4</code>.
     */
    public void setStavalues4(Object[] value) {
        set(29, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stavalues4</code>.
     */
    public Object[] getStavalues4() {
        return (Object[]) get(29);
    }

    /**
     * Setter for <code>pg_catalog.pg_statistic.stavalues5</code>.
     */
    public void setStavalues5(Object[] value) {
        set(30, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statistic.stavalues5</code>.
     */
    public Object[] getStavalues5() {
        return (Object[]) get(30);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<Long, Short, Boolean> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatisticRecord
     */
    public PgStatisticRecord() {
        super(PgStatistic.PG_STATISTIC);
    }

    /**
     * Create a detached, initialised PgStatisticRecord
     */
    public PgStatisticRecord(Long starelid, Short staattnum, Boolean stainherit, Float stanullfrac, Integer stawidth, Float stadistinct, Short stakind1, Short stakind2, Short stakind3, Short stakind4, Short stakind5, Long staop1, Long staop2, Long staop3, Long staop4, Long staop5, Long stacoll1, Long stacoll2, Long stacoll3, Long stacoll4, Long stacoll5, Float[] stanumbers1, Float[] stanumbers2, Float[] stanumbers3, Float[] stanumbers4, Float[] stanumbers5, Object[] stavalues1, Object[] stavalues2, Object[] stavalues3, Object[] stavalues4, Object[] stavalues5) {
        super(PgStatistic.PG_STATISTIC);

        setStarelid(starelid);
        setStaattnum(staattnum);
        setStainherit(stainherit);
        setStanullfrac(stanullfrac);
        setStawidth(stawidth);
        setStadistinct(stadistinct);
        setStakind1(stakind1);
        setStakind2(stakind2);
        setStakind3(stakind3);
        setStakind4(stakind4);
        setStakind5(stakind5);
        setStaop1(staop1);
        setStaop2(staop2);
        setStaop3(staop3);
        setStaop4(staop4);
        setStaop5(staop5);
        setStacoll1(stacoll1);
        setStacoll2(stacoll2);
        setStacoll3(stacoll3);
        setStacoll4(stacoll4);
        setStacoll5(stacoll5);
        setStanumbers1(stanumbers1);
        setStanumbers2(stanumbers2);
        setStanumbers3(stanumbers3);
        setStanumbers4(stanumbers4);
        setStanumbers5(stanumbers5);
        setStavalues1(stavalues1);
        setStavalues2(stavalues2);
        setStavalues3(stavalues3);
        setStavalues4(stavalues4);
        setStavalues5(stavalues5);
        resetChangedOnNotNull();
    }
}
