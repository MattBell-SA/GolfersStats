/*
 * This file is generated by jOOQ.
 */
package com.golf.tables.records;


import com.golf.tables.Golfer;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GolferRecord extends UpdatableRecordImpl<GolferRecord> implements Record5<Integer, String, String, String, String> {

    private static final long serialVersionUID = -1903285433;

    /**
     * Setter for <code>public.GOLFER.GOLFER_ID</code>.
     */
    public void setGolferId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.GOLFER.GOLFER_ID</code>.
     */
    public Integer getGolferId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.GOLFER.GOLFER_TITLE</code>.
     */
    public void setGolferTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.GOLFER.GOLFER_TITLE</code>.
     */
    public String getGolferTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.GOLFER.GOLFER_NAME</code>.
     */
    public void setGolferName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.GOLFER.GOLFER_NAME</code>.
     */
    public String getGolferName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.GOLFER.GOLFER_ADRESS</code>.
     */
    public void setGolferAdress(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.GOLFER.GOLFER_ADRESS</code>.
     */
    public String getGolferAdress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.GOLFER.GOLFER_HOME_COURSE</code>.
     */
    public void setGolferHomeCourse(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.GOLFER.GOLFER_HOME_COURSE</code>.
     */
    public String getGolferHomeCourse() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Golfer.GOLFER.GOLFER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Golfer.GOLFER.GOLFER_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Golfer.GOLFER.GOLFER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Golfer.GOLFER.GOLFER_ADRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Golfer.GOLFER.GOLFER_HOME_COURSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGolferId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGolferTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGolferName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getGolferAdress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGolferHomeCourse();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGolferId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGolferTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGolferName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGolferAdress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGolferHomeCourse();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GolferRecord value1(Integer value) {
        setGolferId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GolferRecord value2(String value) {
        setGolferTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GolferRecord value3(String value) {
        setGolferName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GolferRecord value4(String value) {
        setGolferAdress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GolferRecord value5(String value) {
        setGolferHomeCourse(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GolferRecord values(Integer value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GolferRecord
     */
    public GolferRecord() {
        super(Golfer.GOLFER);
    }

    /**
     * Create a detached, initialised GolferRecord
     */
    public GolferRecord(Integer golferId, String golferTitle, String golferName, String golferAdress, String golferHomeCourse) {
        super(Golfer.GOLFER);

        set(0, golferId);
        set(1, golferTitle);
        set(2, golferName);
        set(3, golferAdress);
        set(4, golferHomeCourse);
    }
}
