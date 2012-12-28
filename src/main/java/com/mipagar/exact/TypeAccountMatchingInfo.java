//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.09 at 02:28:10 PM CEST 
//


package com.mipagar.exact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAccountMatchingInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeAccountMatchingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Name"/>
 *         &lt;element name="VATNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChamberOfCommerce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}BankAccount" minOccurs="0"/>
 *         &lt;element name="ExactMailbox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}code"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAccountMatchingInfo", propOrder = {
    "name",
    "vatNumber",
    "chamberOfCommerce",
    "bankAccount",
    "exactMailbox"
})
public class TypeAccountMatchingInfo {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "VATNumber")
    protected String vatNumber;
    @XmlElement(name = "ChamberOfCommerce")
    protected String chamberOfCommerce;
    @XmlElement(name = "BankAccount")
    protected BankAccount bankAccount;
    @XmlElement(name = "ExactMailbox")
    protected String exactMailbox;
    @XmlAttribute(name = "code")
    protected String code;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the vatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATNumber() {
        return vatNumber;
    }

    /**
     * Sets the value of the vatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATNumber(String value) {
        this.vatNumber = value;
    }

    /**
     * Gets the value of the chamberOfCommerce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChamberOfCommerce() {
        return chamberOfCommerce;
    }

    /**
     * Sets the value of the chamberOfCommerce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChamberOfCommerce(String value) {
        this.chamberOfCommerce = value;
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
     * Gets the value of the exactMailbox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExactMailbox() {
        return exactMailbox;
    }

    /**
     * Sets the value of the exactMailbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExactMailbox(String value) {
        this.exactMailbox = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
