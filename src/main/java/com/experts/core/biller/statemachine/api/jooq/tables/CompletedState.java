/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables;


import com.experts.core.biller.statemachine.api.jooq.Indexes;
import com.experts.core.biller.statemachine.api.jooq.Keys;
import com.experts.core.biller.statemachine.api.jooq.Public;
import com.experts.core.biller.statemachine.api.jooq.tables.records.CompletedStateRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompletedState extends TableImpl<CompletedStateRecord> {

    private static final long serialVersionUID = -800619367;

    /**
     * The reference instance of <code>public.completed_state</code>
     */
    public static final CompletedState COMPLETED_STATE = new CompletedState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompletedStateRecord> getRecordType() {
        return CompletedStateRecord.class;
    }

    /**
     * The column <code>public.completed_state.id</code>.
     */
    public final TableField<CompletedStateRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.completed_state.createddate</code>.
     */
    public final TableField<CompletedStateRecord, Timestamp> CREATEDDATE = createField("createddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.completed_state.modifieddate</code>.
     */
    public final TableField<CompletedStateRecord, Timestamp> MODIFIEDDATE = createField("modifieddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.completed_state.username</code>.
     */
    public final TableField<CompletedStateRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.completed_state.bill_code</code>.
     */
    public final TableField<CompletedStateRecord, String> BILL_CODE = createField("bill_code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.completed_state.bill_no</code>.
     */
    public final TableField<CompletedStateRecord, String> BILL_NO = createField("bill_no", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.completed_state.biller_code</code>.
     */
    public final TableField<CompletedStateRecord, String> BILLER_CODE = createField("biller_code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.completed_state.biller_name</code>.
     */
    public final TableField<CompletedStateRecord, String> BILLER_NAME = createField("biller_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.completed_state.code</code>.
     */
    public final TableField<CompletedStateRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.completed_state.execption</code>.
     */
    public final TableField<CompletedStateRecord, String> EXECPTION = createField("execption", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.completed_state.sucess</code>.
     */
    public final TableField<CompletedStateRecord, Boolean> SUCESS = createField("sucess", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.completed_state.message</code>.
     */
    public final TableField<CompletedStateRecord, String> MESSAGE = createField("message", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.completed_state.name</code>.
     */
    public final TableField<CompletedStateRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.completed_state.transaction_id</code>.
     */
    public final TableField<CompletedStateRecord, String> TRANSACTION_ID = createField("transaction_id", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.completed_state.processstate_completedstate</code>.
     */
    public final TableField<CompletedStateRecord, Long> PROCESSSTATE_COMPLETEDSTATE = createField("processstate_completedstate", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.completed_state.lastmodifiedby</code>.
     */
    public final TableField<CompletedStateRecord, String> LASTMODIFIEDBY = createField("lastmodifiedby", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>public.completed_state</code> table reference
     */
    public CompletedState() {
        this(DSL.name("completed_state"), null);
    }

    /**
     * Create an aliased <code>public.completed_state</code> table reference
     */
    public CompletedState(String alias) {
        this(DSL.name(alias), COMPLETED_STATE);
    }

    /**
     * Create an aliased <code>public.completed_state</code> table reference
     */
    public CompletedState(Name alias) {
        this(alias, COMPLETED_STATE);
    }

    private CompletedState(Name alias, Table<CompletedStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompletedState(Name alias, Table<CompletedStateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CompletedState(Table<O> child, ForeignKey<O, CompletedStateRecord> key) {
        super(child, key, COMPLETED_STATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.COMPLETED_STATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CompletedStateRecord> getPrimaryKey() {
        return Keys.COMPLETED_STATE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CompletedStateRecord>> getKeys() {
        return Arrays.<UniqueKey<CompletedStateRecord>>asList(Keys.COMPLETED_STATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CompletedStateRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CompletedStateRecord, ?>>asList(Keys.COMPLETED_STATE__FK38CS25K0I7EP323ILRQUM76Q);
    }

    public ProcessState processState() {
        return new ProcessState(this, Keys.COMPLETED_STATE__FK38CS25K0I7EP323ILRQUM76Q);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompletedState as(String alias) {
        return new CompletedState(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompletedState as(Name alias) {
        return new CompletedState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompletedState rename(String name) {
        return new CompletedState(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CompletedState rename(Name name) {
        return new CompletedState(name, null);
    }
}
