/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables.records;


import com.experts.core.biller.statemachine.api.jooq.tables.InquiryBillCurrent;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


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
public class InquiryBillCurrentRecord extends UpdatableRecordImpl<InquiryBillCurrentRecord> implements Record16<Long, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -1061788217;

    /**
     * Setter for <code>public.inquiry_bill_current.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.modifieddate</code>.
     */
    public void setModifieddate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.modifieddate</code>.
     */
    public Timestamp getModifieddate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.username</code>.
     */
    public void setUsername(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.username</code>.
     */
    public String getUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.bankaddress</code>.
     */
    public void setBankaddress(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.bankaddress</code>.
     */
    public String getBankaddress() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.bankcode</code>.
     */
    public void setBankcode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.bankcode</code>.
     */
    public String getBankcode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.bankid</code>.
     */
    public void setBankid(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.bankid</code>.
     */
    public String getBankid() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.bankname</code>.
     */
    public void setBankname(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.bankname</code>.
     */
    public String getBankname() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.billcode</code>.
     */
    public void setBillcode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.billcode</code>.
     */
    public String getBillcode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.billname</code>.
     */
    public void setBillname(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.billname</code>.
     */
    public String getBillname() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.billeraddress</code>.
     */
    public void setBilleraddress(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.billeraddress</code>.
     */
    public String getBilleraddress() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.billercode</code>.
     */
    public void setBillercode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.billercode</code>.
     */
    public String getBillercode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.billername</code>.
     */
    public void setBillername(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.billername</code>.
     */
    public String getBillername() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.clientid</code>.
     */
    public void setClientid(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.clientid</code>.
     */
    public String getClientid() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.onserviceby</code>.
     */
    public void setOnserviceby(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.onserviceby</code>.
     */
    public String getOnserviceby() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.inquiry_bill_current.lastmodifiedby</code>.
     */
    public void setLastmodifiedby(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.inquiry_bill_current.lastmodifiedby</code>.
     */
    public String getLastmodifiedby() {
        return (String) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, Timestamp, Timestamp, String, String, String, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.MODIFIEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.BANKADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.BANKCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.BANKID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.BANKNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.BILLCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.BILLNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.BILLERADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.BILLERCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.BILLERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.CLIENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.ONSERVICEBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return InquiryBillCurrent.INQUIRY_BILL_CURRENT.LASTMODIFIEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getModifieddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBankaddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getBankcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getBankid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getBankname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getBillcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getBillname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getBilleraddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getBillercode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getBillername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getClientid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getOnserviceby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getLastmodifiedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getModifieddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBankaddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getBankcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBankid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getBankname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getBillcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getBillname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getBilleraddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getBillercode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getBillername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getClientid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getOnserviceby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getLastmodifiedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value2(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value3(Timestamp value) {
        setModifieddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value4(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value5(String value) {
        setBankaddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value6(String value) {
        setBankcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value7(String value) {
        setBankid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value8(String value) {
        setBankname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value9(String value) {
        setBillcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value10(String value) {
        setBillname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value11(String value) {
        setBilleraddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value12(String value) {
        setBillercode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value13(String value) {
        setBillername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value14(String value) {
        setClientid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value15(String value) {
        setOnserviceby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord value16(String value) {
        setLastmodifiedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryBillCurrentRecord values(Long value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InquiryBillCurrentRecord
     */
    public InquiryBillCurrentRecord() {
        super(InquiryBillCurrent.INQUIRY_BILL_CURRENT);
    }

    /**
     * Create a detached, initialised InquiryBillCurrentRecord
     */
    public InquiryBillCurrentRecord(Long id, Timestamp createddate, Timestamp modifieddate, String username, String bankaddress, String bankcode, String bankid, String bankname, String billcode, String billname, String billeraddress, String billercode, String billername, String clientid, String onserviceby, String lastmodifiedby) {
        super(InquiryBillCurrent.INQUIRY_BILL_CURRENT);

        set(0, id);
        set(1, createddate);
        set(2, modifieddate);
        set(3, username);
        set(4, bankaddress);
        set(5, bankcode);
        set(6, bankid);
        set(7, bankname);
        set(8, billcode);
        set(9, billname);
        set(10, billeraddress);
        set(11, billercode);
        set(12, billername);
        set(13, clientid);
        set(14, onserviceby);
        set(15, lastmodifiedby);
    }
}
