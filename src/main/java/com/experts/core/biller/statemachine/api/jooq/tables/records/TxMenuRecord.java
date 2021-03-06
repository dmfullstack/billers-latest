/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.jooq.tables.records;


import com.experts.core.biller.statemachine.api.jooq.tables.TxMenu;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class TxMenuRecord extends UpdatableRecordImpl<TxMenuRecord> implements Record9<Long, String, Short, Short, Short, String, Short, Long, Long> {

    private static final long serialVersionUID = -1653352979;

    /**
     * Setter for <code>public.tx_menu.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tx_menu.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tx_menu.icon_class</code>.
     */
    public void setIconClass(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tx_menu.icon_class</code>.
     */
    public String getIconClass() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tx_menu.is_active</code>.
     */
    public void setIsActive(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tx_menu.is_active</code>.
     */
    public Short getIsActive() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>public.tx_menu.is_page</code>.
     */
    public void setIsPage(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tx_menu.is_page</code>.
     */
    public Short getIsPage() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>public.tx_menu.menu_order</code>.
     */
    public void setMenuOrder(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.tx_menu.menu_order</code>.
     */
    public Short getMenuOrder() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>public.tx_menu.menu_text</code>.
     */
    public void setMenuText(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.tx_menu.menu_text</code>.
     */
    public String getMenuText() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.tx_menu.requires_privilige</code>.
     */
    public void setRequiresPrivilige(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.tx_menu.requires_privilige</code>.
     */
    public Short getRequiresPrivilige() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>public.tx_menu.page_id</code>.
     */
    public void setPageId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.tx_menu.page_id</code>.
     */
    public Long getPageId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>public.tx_menu.parent_id</code>.
     */
    public void setParentId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.tx_menu.parent_id</code>.
     */
    public Long getParentId() {
        return (Long) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, Short, Short, Short, String, Short, Long, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, Short, Short, Short, String, Short, Long, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TxMenu.TX_MENU.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TxMenu.TX_MENU.ICON_CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TxMenu.TX_MENU.IS_ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return TxMenu.TX_MENU.IS_PAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return TxMenu.TX_MENU.MENU_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TxMenu.TX_MENU.MENU_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field7() {
        return TxMenu.TX_MENU.REQUIRES_PRIVILIGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return TxMenu.TX_MENU.PAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return TxMenu.TX_MENU.PARENT_ID;
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
    public String component2() {
        return getIconClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getIsPage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getMenuOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getMenuText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component7() {
        return getRequiresPrivilige();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getPageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getParentId();
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
    public String value2() {
        return getIconClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getIsPage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getMenuOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMenuText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value7() {
        return getRequiresPrivilige();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getPageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxMenuRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxMenuRecord value2(String value) {
        setIconClass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxMenuRecord value3(Short value) {
        setIsActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxMenuRecord value4(Short value) {
        setIsPage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxMenuRecord value5(Short value) {
        setMenuOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxMenuRecord value6(String value) {
        setMenuText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxMenuRecord value7(Short value) {
        setRequiresPrivilige(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxMenuRecord value8(Long value) {
        setPageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxMenuRecord value9(Long value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TxMenuRecord values(Long value1, String value2, Short value3, Short value4, Short value5, String value6, Short value7, Long value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TxMenuRecord
     */
    public TxMenuRecord() {
        super(TxMenu.TX_MENU);
    }

    /**
     * Create a detached, initialised TxMenuRecord
     */
    public TxMenuRecord(Long id, String iconClass, Short isActive, Short isPage, Short menuOrder, String menuText, Short requiresPrivilige, Long pageId, Long parentId) {
        super(TxMenu.TX_MENU);

        set(0, id);
        set(1, iconClass);
        set(2, isActive);
        set(3, isPage);
        set(4, menuOrder);
        set(5, menuText);
        set(6, requiresPrivilige);
        set(7, pageId);
        set(8, parentId);
    }
}
