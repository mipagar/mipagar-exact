//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.09 at 02:28:10 PM CEST 
//


package com.mipagar.exact;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFeatureSetEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFeatureSetEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Base"/>
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="Assets"/>
 *     &lt;enumeration value="Reminders"/>
 *     &lt;enumeration value="MultiCurrency"/>
 *     &lt;enumeration value="Banking"/>
 *     &lt;enumeration value="Budget"/>
 *     &lt;enumeration value="CostAnalysis"/>
 *     &lt;enumeration value="DropShipment"/>
 *     &lt;enumeration value="SalesInvoice"/>
 *     &lt;enumeration value="Payroll"/>
 *     &lt;enumeration value="EAP"/>
 *     &lt;enumeration value="BillOfMaterial"/>
 *     &lt;enumeration value="Users"/>
 *     &lt;enumeration value="Zoomio"/>
 *     &lt;enumeration value="Collection"/>
 *     &lt;enumeration value="MultiAdminManagement"/>
 *     &lt;enumeration value="IntraStat"/>
 *     &lt;enumeration value="Project"/>
 *     &lt;enumeration value="VAT"/>
 *     &lt;enumeration value="AccountantAccess"/>
 *     &lt;enumeration value="Hosting"/>
 *     &lt;enumeration value="MultiLanguage"/>
 *     &lt;enumeration value="XBRL"/>
 *     &lt;enumeration value="HostingCustomer"/>
 *     &lt;enumeration value="Accountant"/>
 *     &lt;enumeration value="EUSalesList"/>
 *     &lt;enumeration value="AddressWebServices"/>
 *     &lt;enumeration value="SEPA"/>
 *     &lt;enumeration value="Digipass"/>
 *     &lt;enumeration value="Mailbox"/>
 *     &lt;enumeration value="Manufacturing"/>
 *     &lt;enumeration value="SalesForce"/>
 *     &lt;enumeration value="Quotation"/>
 *     &lt;enumeration value="FinancialAnalytics"/>
 *     &lt;enumeration value="Marketing"/>
 *     &lt;enumeration value="School"/>
 *     &lt;enumeration value="SalesOrder"/>
 *     &lt;enumeration value="ControlAndUpdateRelations"/>
 *     &lt;enumeration value="OfficialNumbering"/>
 *     &lt;enumeration value="PurchaseInvoice"/>
 *     &lt;enumeration value="PurchaseOrder"/>
 *     &lt;enumeration value="Inventory"/>
 *     &lt;enumeration value="Cheques"/>
 *     &lt;enumeration value="CreditInvoice"/>
 *     &lt;enumeration value="ReturnInvoice"/>
 *     &lt;enumeration value="Subscription"/>
 *     &lt;enumeration value="MultiWarehouse"/>
 *     &lt;enumeration value="PurchaseReturn"/>
 *     &lt;enumeration value="ResourcePlanning"/>
 *     &lt;enumeration value="AccountPro"/>
 *     &lt;enumeration value="GeneralPro"/>
 *     &lt;enumeration value="Kirean"/>
 *     &lt;enumeration value="AccountOverviews"/>
 *     &lt;enumeration value="HRM"/>
 *     &lt;enumeration value="Graydon"/>
 *     &lt;enumeration value="CreditManagement"/>
 *     &lt;enumeration value="VATMargin"/>
 *     &lt;enumeration value="BackToBackOrder"/>
 *     &lt;enumeration value="PriceManagement"/>
 *     &lt;enumeration value="AccountTemplateEntries"/>
 *     &lt;enumeration value="PartnerSales"/>
 *     &lt;enumeration value="PartnerSupport"/>
 *     &lt;enumeration value="PayrollSynergyIntegration"/>
 *     &lt;enumeration value="Items"/>
 *     &lt;enumeration value="Quantity"/>
 *     &lt;enumeration value="Employees"/>
 *     &lt;enumeration value="CRM"/>
 *     &lt;enumeration value="Warehouse"/>
 *     &lt;enumeration value="PricePrecision"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeFeatureSetEnum")
@XmlEnum
public enum TypeFeatureSetEnum {

    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Assets")
    ASSETS("Assets"),
    @XmlEnumValue("Reminders")
    REMINDERS("Reminders"),
    @XmlEnumValue("MultiCurrency")
    MULTI_CURRENCY("MultiCurrency"),
    @XmlEnumValue("Banking")
    BANKING("Banking"),
    @XmlEnumValue("Budget")
    BUDGET("Budget"),
    @XmlEnumValue("CostAnalysis")
    COST_ANALYSIS("CostAnalysis"),
    @XmlEnumValue("DropShipment")
    DROP_SHIPMENT("DropShipment"),
    @XmlEnumValue("SalesInvoice")
    SALES_INVOICE("SalesInvoice"),
    @XmlEnumValue("Payroll")
    PAYROLL("Payroll"),
    EAP("EAP"),
    @XmlEnumValue("BillOfMaterial")
    BILL_OF_MATERIAL("BillOfMaterial"),
    @XmlEnumValue("Users")
    USERS("Users"),
    @XmlEnumValue("Zoomio")
    ZOOMIO("Zoomio"),
    @XmlEnumValue("Collection")
    COLLECTION("Collection"),
    @XmlEnumValue("MultiAdminManagement")
    MULTI_ADMIN_MANAGEMENT("MultiAdminManagement"),
    @XmlEnumValue("IntraStat")
    INTRA_STAT("IntraStat"),
    @XmlEnumValue("Project")
    PROJECT("Project"),
    VAT("VAT"),
    @XmlEnumValue("AccountantAccess")
    ACCOUNTANT_ACCESS("AccountantAccess"),
    @XmlEnumValue("Hosting")
    HOSTING("Hosting"),
    @XmlEnumValue("MultiLanguage")
    MULTI_LANGUAGE("MultiLanguage"),
    XBRL("XBRL"),
    @XmlEnumValue("HostingCustomer")
    HOSTING_CUSTOMER("HostingCustomer"),
    @XmlEnumValue("Accountant")
    ACCOUNTANT("Accountant"),
    @XmlEnumValue("EUSalesList")
    EU_SALES_LIST("EUSalesList"),
    @XmlEnumValue("AddressWebServices")
    ADDRESS_WEB_SERVICES("AddressWebServices"),
    SEPA("SEPA"),
    @XmlEnumValue("Digipass")
    DIGIPASS("Digipass"),
    @XmlEnumValue("Mailbox")
    MAILBOX("Mailbox"),
    @XmlEnumValue("Manufacturing")
    MANUFACTURING("Manufacturing"),
    @XmlEnumValue("SalesForce")
    SALES_FORCE("SalesForce"),
    @XmlEnumValue("Quotation")
    QUOTATION("Quotation"),
    @XmlEnumValue("FinancialAnalytics")
    FINANCIAL_ANALYTICS("FinancialAnalytics"),
    @XmlEnumValue("Marketing")
    MARKETING("Marketing"),
    @XmlEnumValue("School")
    SCHOOL("School"),
    @XmlEnumValue("SalesOrder")
    SALES_ORDER("SalesOrder"),
    @XmlEnumValue("ControlAndUpdateRelations")
    CONTROL_AND_UPDATE_RELATIONS("ControlAndUpdateRelations"),
    @XmlEnumValue("OfficialNumbering")
    OFFICIAL_NUMBERING("OfficialNumbering"),
    @XmlEnumValue("PurchaseInvoice")
    PURCHASE_INVOICE("PurchaseInvoice"),
    @XmlEnumValue("PurchaseOrder")
    PURCHASE_ORDER("PurchaseOrder"),
    @XmlEnumValue("Inventory")
    INVENTORY("Inventory"),
    @XmlEnumValue("Cheques")
    CHEQUES("Cheques"),
    @XmlEnumValue("CreditInvoice")
    CREDIT_INVOICE("CreditInvoice"),
    @XmlEnumValue("ReturnInvoice")
    RETURN_INVOICE("ReturnInvoice"),
    @XmlEnumValue("Subscription")
    SUBSCRIPTION("Subscription"),
    @XmlEnumValue("MultiWarehouse")
    MULTI_WAREHOUSE("MultiWarehouse"),
    @XmlEnumValue("PurchaseReturn")
    PURCHASE_RETURN("PurchaseReturn"),
    @XmlEnumValue("ResourcePlanning")
    RESOURCE_PLANNING("ResourcePlanning"),
    @XmlEnumValue("AccountPro")
    ACCOUNT_PRO("AccountPro"),
    @XmlEnumValue("GeneralPro")
    GENERAL_PRO("GeneralPro"),
    @XmlEnumValue("Kirean")
    KIREAN("Kirean"),
    @XmlEnumValue("AccountOverviews")
    ACCOUNT_OVERVIEWS("AccountOverviews"),
    HRM("HRM"),
    @XmlEnumValue("Graydon")
    GRAYDON("Graydon"),
    @XmlEnumValue("CreditManagement")
    CREDIT_MANAGEMENT("CreditManagement"),
    @XmlEnumValue("VATMargin")
    VAT_MARGIN("VATMargin"),
    @XmlEnumValue("BackToBackOrder")
    BACK_TO_BACK_ORDER("BackToBackOrder"),
    @XmlEnumValue("PriceManagement")
    PRICE_MANAGEMENT("PriceManagement"),
    @XmlEnumValue("AccountTemplateEntries")
    ACCOUNT_TEMPLATE_ENTRIES("AccountTemplateEntries"),
    @XmlEnumValue("PartnerSales")
    PARTNER_SALES("PartnerSales"),
    @XmlEnumValue("PartnerSupport")
    PARTNER_SUPPORT("PartnerSupport"),
    @XmlEnumValue("PayrollSynergyIntegration")
    PAYROLL_SYNERGY_INTEGRATION("PayrollSynergyIntegration"),
    @XmlEnumValue("Items")
    ITEMS("Items"),
    @XmlEnumValue("Quantity")
    QUANTITY("Quantity"),
    @XmlEnumValue("Employees")
    EMPLOYEES("Employees"),
    CRM("CRM"),
    @XmlEnumValue("Warehouse")
    WAREHOUSE("Warehouse"),
    @XmlEnumValue("PricePrecision")
    PRICE_PRECISION("PricePrecision");
    private final String value;

    TypeFeatureSetEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFeatureSetEnum fromValue(String v) {
        for (TypeFeatureSetEnum c: TypeFeatureSetEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
