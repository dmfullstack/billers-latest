/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables.records;


import com.experts.core.biller.statemachine.api.jooq.tables.BillPullRequest;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
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
public class BillPullRequestRecord extends UpdatableRecordImpl<BillPullRequestRecord> {

    private static final long serialVersionUID = -900940561;

    /**
     * Setter for <code>public.bill_pull_request.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.bill_pull_request.createddate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.createddate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.bill_pull_request.modifieddate</code>.
     */
    public void setModifieddate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.modifieddate</code>.
     */
    public Timestamp getModifieddate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.bill_pull_request.username</code>.
     */
    public void setUsername(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.username</code>.
     */
    public String getUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.bill_pull_request.acc_info</code>.
     */
    public void setAccInfo(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.acc_info</code>.
     */
    public String getAccInfo() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.bill_pull_request.address</code>.
     */
    public void setAddress(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.address</code>.
     */
    public String getAddress() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.bill_pull_request.bill_no</code>.
     */
    public void setBillNo(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.bill_no</code>.
     */
    public String getBillNo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.bill_pull_request.billing_no</code>.
     */
    public void setBillingNo(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.billing_no</code>.
     */
    public String getBillingNo() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.bill_pull_request.email</code>.
     */
    public void setEmail(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.email</code>.
     */
    public String getEmail() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.bill_pull_request.id_type</code>.
     */
    public void setIdType(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.id_type</code>.
     */
    public String getIdType() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.bill_pull_request.joebppsno</code>.
     */
    public void setJoebppsno(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.joebppsno</code>.
     */
    public String getJoebppsno() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.bill_pull_request.name</code>.
     */
    public void setName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.name</code>.
     */
    public String getName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.bill_pull_request.nation</code>.
     */
    public void setNation(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.nation</code>.
     */
    public String getNation() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.bill_pull_request.payer_info</code>.
     */
    public void setPayerInfo(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.payer_info</code>.
     */
    public String getPayerInfo() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.bill_pull_request.phone</code>.
     */
    public void setPhone(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.phone</code>.
     */
    public String getPhone() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.bill_pull_request.service_type</code>.
     */
    public void setServiceType(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.service_type</code>.
     */
    public String getServiceType() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.bill_pull_request.acc_no</code>.
     */
    public void setAccNo(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.acc_no</code>.
     */
    public String getAccNo() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.bill_pull_request.allow_part</code>.
     */
    public void setAllowPart(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.allow_part</code>.
     */
    public String getAllowPart() {
        return (String) get(17);
    }

    /**
     * Setter for <code>public.bill_pull_request.amount</code>.
     */
    public void setAmount(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.amount</code>.
     */
    public String getAmount() {
        return (String) get(18);
    }

    /**
     * Setter for <code>public.bill_pull_request.bank_code</code>.
     */
    public void setBankCode(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.bank_code</code>.
     */
    public String getBankCode() {
        return (String) get(19);
    }

    /**
     * Setter for <code>public.bill_pull_request.bill_rec</code>.
     */
    public void setBillRec(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.bill_rec</code>.
     */
    public String getBillRec() {
        return (String) get(20);
    }

    /**
     * Setter for <code>public.bill_pull_request.bill_status</code>.
     */
    public void setBillStatus(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.bill_status</code>.
     */
    public String getBillStatus() {
        return (String) get(21);
    }

    /**
     * Setter for <code>public.bill_pull_request.bill_type</code>.
     */
    public void setBillType(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.bill_type</code>.
     */
    public String getBillType() {
        return (String) get(22);
    }

    /**
     * Setter for <code>public.bill_pull_request.bills_rec</code>.
     */
    public void setBillsRec(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.bills_rec</code>.
     */
    public String getBillsRec() {
        return (String) get(23);
    }

    /**
     * Setter for <code>public.bill_pull_request.close_date</code>.
     */
    public void setCloseDate(Timestamp value) {
        set(24, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.close_date</code>.
     */
    public Timestamp getCloseDate() {
        return (Timestamp) get(24);
    }

    /**
     * Setter for <code>public.bill_pull_request.currency</code>.
     */
    public void setCurrency(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.currency</code>.
     */
    public String getCurrency() {
        return (String) get(25);
    }

    /**
     * Setter for <code>public.bill_pull_request.due_anount</code>.
     */
    public void setDueAnount(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.due_anount</code>.
     */
    public String getDueAnount() {
        return (String) get(26);
    }

    /**
     * Setter for <code>public.bill_pull_request.due_date</code>.
     */
    public void setDueDate(Timestamp value) {
        set(27, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.due_date</code>.
     */
    public Timestamp getDueDate() {
        return (Timestamp) get(27);
    }

    /**
     * Setter for <code>public.bill_pull_request.error_code</code>.
     */
    public void setErrorCode(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.error_code</code>.
     */
    public String getErrorCode() {
        return (String) get(28);
    }

    /**
     * Setter for <code>public.bill_pull_request.error_desc</code>.
     */
    public void setErrorDesc(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.error_desc</code>.
     */
    public String getErrorDesc() {
        return (String) get(29);
    }

    /**
     * Setter for <code>public.bill_pull_request.expiry_date</code>.
     */
    public void setExpiryDate(Timestamp value) {
        set(30, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.expiry_date</code>.
     */
    public Timestamp getExpiryDate() {
        return (Timestamp) get(30);
    }

    /**
     * Setter for <code>public.bill_pull_request.issue_date</code>.
     */
    public void setIssueDate(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.issue_date</code>.
     */
    public String getIssueDate() {
        return (String) get(31);
    }

    /**
     * Setter for <code>public.bill_pull_request.lower</code>.
     */
    public void setLower(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.lower</code>.
     */
    public String getLower() {
        return (String) get(32);
    }

    /**
     * Setter for <code>public.bill_pull_request.open_date</code>.
     */
    public void setOpenDate(Timestamp value) {
        set(33, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.open_date</code>.
     */
    public Timestamp getOpenDate() {
        return (Timestamp) get(33);
    }

    /**
     * Setter for <code>public.bill_pull_request.pmt_const</code>.
     */
    public void setPmtConst(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.pmt_const</code>.
     */
    public String getPmtConst() {
        return (String) get(34);
    }

    /**
     * Setter for <code>public.bill_pull_request.res_count</code>.
     */
    public void setResCount(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.res_count</code>.
     */
    public String getResCount() {
        return (String) get(35);
    }

    /**
     * Setter for <code>public.bill_pull_request.result</code>.
     */
    public void setResult(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.result</code>.
     */
    public String getResult() {
        return (String) get(36);
    }

    /**
     * Setter for <code>public.bill_pull_request.erverity</code>.
     */
    public void setErverity(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.erverity</code>.
     */
    public String getErverity() {
        return (String) get(37);
    }

    /**
     * Setter for <code>public.bill_pull_request.sub_pmt</code>.
     */
    public void setSubPmt(String value) {
        set(38, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.sub_pmt</code>.
     */
    public String getSubPmt() {
        return (String) get(38);
    }

    /**
     * Setter for <code>public.bill_pull_request.sub_pmts</code>.
     */
    public void setSubPmts(String value) {
        set(39, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.sub_pmts</code>.
     */
    public String getSubPmts() {
        return (String) get(39);
    }

    /**
     * Setter for <code>public.bill_pull_request.upper</code>.
     */
    public void setUpper(String value) {
        set(40, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.upper</code>.
     */
    public String getUpper() {
        return (String) get(40);
    }

    /**
     * Setter for <code>public.bill_pull_request.lastmodifiedby</code>.
     */
    public void setLastmodifiedby(String value) {
        set(41, value);
    }

    /**
     * Getter for <code>public.bill_pull_request.lastmodifiedby</code>.
     */
    public String getLastmodifiedby() {
        return (String) get(41);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BillPullRequestRecord
     */
    public BillPullRequestRecord() {
        super(BillPullRequest.BILL_PULL_REQUEST);
    }

    /**
     * Create a detached, initialised BillPullRequestRecord
     */
    public BillPullRequestRecord(Long id, Timestamp createddate, Timestamp modifieddate, String username, String accInfo, String address, String billNo, String billingNo, String email, String idType, String joebppsno, String name, String nation, String payerInfo, String phone, String serviceType, String accNo, String allowPart, String amount, String bankCode, String billRec, String billStatus, String billType, String billsRec, Timestamp closeDate, String currency, String dueAnount, Timestamp dueDate, String errorCode, String errorDesc, Timestamp expiryDate, String issueDate, String lower, Timestamp openDate, String pmtConst, String resCount, String result, String erverity, String subPmt, String subPmts, String upper, String lastmodifiedby) {
        super(BillPullRequest.BILL_PULL_REQUEST);

        set(0, id);
        set(1, createddate);
        set(2, modifieddate);
        set(3, username);
        set(4, accInfo);
        set(5, address);
        set(6, billNo);
        set(7, billingNo);
        set(8, email);
        set(9, idType);
        set(10, joebppsno);
        set(11, name);
        set(12, nation);
        set(13, payerInfo);
        set(14, phone);
        set(15, serviceType);
        set(16, accNo);
        set(17, allowPart);
        set(18, amount);
        set(19, bankCode);
        set(20, billRec);
        set(21, billStatus);
        set(22, billType);
        set(23, billsRec);
        set(24, closeDate);
        set(25, currency);
        set(26, dueAnount);
        set(27, dueDate);
        set(28, errorCode);
        set(29, errorDesc);
        set(30, expiryDate);
        set(31, issueDate);
        set(32, lower);
        set(33, openDate);
        set(34, pmtConst);
        set(35, resCount);
        set(36, result);
        set(37, erverity);
        set(38, subPmt);
        set(39, subPmts);
        set(40, upper);
        set(41, lastmodifiedby);
    }
}
