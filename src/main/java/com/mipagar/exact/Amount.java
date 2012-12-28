//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.09 at 02:28:10 PM CEST 
//


package com.mipagar.exact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}Currency"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{}Debit" minOccurs="0"/>
 *             &lt;element ref="{}Credit" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{}Value" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{}VAT" minOccurs="0"/>
 *         &lt;element name="VATPercentage" type="{}typePercentage" minOccurs="0"/>
 *         &lt;element name="VATBaseAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="PaymentDiscountAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Value" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "currency",
    "debit",
    "credit",
    "value",
    "vat",
    "vatPercentage",
    "vatBaseAmount",
    "paymentDiscountAmount"
})
@XmlRootElement(name = "Amount")
public class Amount {

    @XmlElement(name = "Currency", required = true)
    protected Currency currency;
    @XmlElement(name = "Debit")
    protected Float debit;
    @XmlElement(name = "Credit")
    protected Float credit;
    @XmlElement(name = "Value")
    protected Float value;
    @XmlElement(name = "VAT")
    protected VAT vat;
    @XmlElement(name = "VATPercentage")
    protected Float vatPercentage;
    @XmlElement(name = "VATBaseAmount")
    protected Float vatBaseAmount;
    @XmlElement(name = "PaymentDiscountAmount")
    protected Amount.PaymentDiscountAmount paymentDiscountAmount;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the debit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDebit() {
        return debit;
    }

    /**
     * Sets the value of the debit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDebit(Float value) {
        this.debit = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCredit(Float value) {
        this.credit = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link VAT }
     *     
     */
    public VAT getVAT() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link VAT }
     *     
     */
    public void setVAT(VAT value) {
        this.vat = value;
    }

    /**
     * Gets the value of the vatPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVATPercentage() {
        return vatPercentage;
    }

    /**
     * Sets the value of the vatPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVATPercentage(Float value) {
        this.vatPercentage = value;
    }

    /**
     * Gets the value of the vatBaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVATBaseAmount() {
        return vatBaseAmount;
    }

    /**
     * Sets the value of the vatBaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVATBaseAmount(Float value) {
        this.vatBaseAmount = value;
    }

    /**
     * Gets the value of the paymentDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount.PaymentDiscountAmount }
     *     
     */
    public Amount.PaymentDiscountAmount getPaymentDiscountAmount() {
        return paymentDiscountAmount;
    }

    /**
     * Sets the value of the paymentDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount.PaymentDiscountAmount }
     *     
     */
    public void setPaymentDiscountAmount(Amount.PaymentDiscountAmount value) {
        this.paymentDiscountAmount = value;
    }


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
     *         &lt;element ref="{}Value" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PaymentDiscountAmount {

        @XmlElement(name = "Value")
        protected Float value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setValue(Float value) {
            this.value = value;
        }

    }

}