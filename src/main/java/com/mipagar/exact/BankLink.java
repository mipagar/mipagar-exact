//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.09 at 02:28:10 PM CEST 
//


package com.mipagar.exact;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Account"/>
 *         &lt;element ref="{}Mailbox"/>
 *         &lt;element ref="{}BankAccount"/>
 *         &lt;element name="SynchronizationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{}Active" minOccurs="0"/>
 *         &lt;element ref="{}Administration"/>
 *         &lt;element name="TransactionsPermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PaymentsPermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CollectionsPermission" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{}SequenceNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}ID"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "account",
    "mailbox",
    "bankAccount",
    "synchronizationCode",
    "active",
    "administration",
    "transactionsPermission",
    "paymentsPermission",
    "collectionsPermission",
    "sequenceNumber"
})
@XmlRootElement(name = "BankLink")
public class BankLink {

    @XmlElement(name = "Account", required = true)
    protected TypeAccount account;
    @XmlElement(name = "Mailbox", required = true)
    protected String mailbox;
    @XmlElement(name = "BankAccount", required = true)
    protected BankAccount bankAccount;
    @XmlElement(name = "SynchronizationCode", required = true)
    protected String synchronizationCode;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "Administration", required = true)
    protected Administration administration;
    @XmlElement(name = "TransactionsPermission")
    protected boolean transactionsPermission;
    @XmlElement(name = "PaymentsPermission")
    protected boolean paymentsPermission;
    @XmlElement(name = "CollectionsPermission")
    protected boolean collectionsPermission;
    @XmlElement(name = "SequenceNumber")
    protected BigInteger sequenceNumber;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAccount }
     *     
     */
    public TypeAccount getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAccount }
     *     
     */
    public void setAccount(TypeAccount value) {
        this.account = value;
    }

    /**
     * Gets the value of the mailbox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * Sets the value of the mailbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailbox(String value) {
        this.mailbox = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setBankAccount(BankAccount value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the synchronizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynchronizationCode() {
        return synchronizationCode;
    }

    /**
     * Sets the value of the synchronizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynchronizationCode(String value) {
        this.synchronizationCode = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the administration property.
     * 
     * @return
     *     possible object is
     *     {@link Administration }
     *     
     */
    public Administration getAdministration() {
        return administration;
    }

    /**
     * Sets the value of the administration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Administration }
     *     
     */
    public void setAdministration(Administration value) {
        this.administration = value;
    }

    /**
     * Gets the value of the transactionsPermission property.
     * 
     */
    public boolean isTransactionsPermission() {
        return transactionsPermission;
    }

    /**
     * Sets the value of the transactionsPermission property.
     * 
     */
    public void setTransactionsPermission(boolean value) {
        this.transactionsPermission = value;
    }

    /**
     * Gets the value of the paymentsPermission property.
     * 
     */
    public boolean isPaymentsPermission() {
        return paymentsPermission;
    }

    /**
     * Sets the value of the paymentsPermission property.
     * 
     */
    public void setPaymentsPermission(boolean value) {
        this.paymentsPermission = value;
    }

    /**
     * Gets the value of the collectionsPermission property.
     * 
     */
    public boolean isCollectionsPermission() {
        return collectionsPermission;
    }

    /**
     * Sets the value of the collectionsPermission property.
     * 
     */
    public void setCollectionsPermission(boolean value) {
        this.collectionsPermission = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
