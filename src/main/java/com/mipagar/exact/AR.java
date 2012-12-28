//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.09 at 02:28:10 PM CEST 
//


package com.mipagar.exact;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}Account"/>
 *         &lt;element name="OutstandingItems">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OutstandingItem" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}Description" minOccurs="0"/>
 *                             &lt;element ref="{}InvoiceDate"/>
 *                             &lt;element ref="{}DueDate"/>
 *                             &lt;element ref="{}Currency"/>
 *                             &lt;element name="InvoiceAmtFC" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="OutstandingAmtFC" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="InvoiceAmtDC" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="OutstandingAmtDC" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                           &lt;/sequence>
 *                           &lt;attribute ref="{}number"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "account",
    "outstandingItems"
})
@XmlRootElement(name = "AR")
public class AR {

    @XmlElement(name = "Account")
    protected TypeAccount account;
    @XmlElement(name = "OutstandingItems")
    protected AR.OutstandingItems outstandingItems;

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
     * Gets the value of the outstandingItems property.
     * 
     * @return
     *     possible object is
     *     {@link AR.OutstandingItems }
     *     
     */
    public AR.OutstandingItems getOutstandingItems() {
        return outstandingItems;
    }

    /**
     * Sets the value of the outstandingItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AR.OutstandingItems }
     *     
     */
    public void setOutstandingItems(AR.OutstandingItems value) {
        this.outstandingItems = value;
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
     *         &lt;element name="OutstandingItem" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}Description" minOccurs="0"/>
     *                   &lt;element ref="{}InvoiceDate"/>
     *                   &lt;element ref="{}DueDate"/>
     *                   &lt;element ref="{}Currency"/>
     *                   &lt;element name="InvoiceAmtFC" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="OutstandingAmtFC" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="InvoiceAmtDC" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="OutstandingAmtDC" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                 &lt;/sequence>
     *                 &lt;attribute ref="{}number"/>
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
        "outstandingItem"
    })
    public static class OutstandingItems {

        @XmlElement(name = "OutstandingItem", required = true)
        protected List<AR.OutstandingItems.OutstandingItem> outstandingItem;

        /**
         * Gets the value of the outstandingItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outstandingItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOutstandingItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AR.OutstandingItems.OutstandingItem }
         * 
         * 
         */
        public List<AR.OutstandingItems.OutstandingItem> getOutstandingItem() {
            if (outstandingItem == null) {
                outstandingItem = new ArrayList<AR.OutstandingItems.OutstandingItem>();
            }
            return this.outstandingItem;
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
         *         &lt;element ref="{}Description" minOccurs="0"/>
         *         &lt;element ref="{}InvoiceDate"/>
         *         &lt;element ref="{}DueDate"/>
         *         &lt;element ref="{}Currency"/>
         *         &lt;element name="InvoiceAmtFC" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="OutstandingAmtFC" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="InvoiceAmtDC" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="OutstandingAmtDC" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *       &lt;/sequence>
         *       &lt;attribute ref="{}number"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "description",
            "invoiceDate",
            "dueDate",
            "currency",
            "invoiceAmtFC",
            "outstandingAmtFC",
            "invoiceAmtDC",
            "outstandingAmtDC"
        })
        public static class OutstandingItem {

            @XmlElement(name = "Description")
            protected TypeDescription description;
            @XmlElement(name = "InvoiceDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar invoiceDate;
            @XmlElement(name = "DueDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dueDate;
            @XmlElement(name = "Currency", required = true)
            protected Currency currency;
            @XmlElement(name = "InvoiceAmtFC")
            protected float invoiceAmtFC;
            @XmlElement(name = "OutstandingAmtFC")
            protected float outstandingAmtFC;
            @XmlElement(name = "InvoiceAmtDC")
            protected float invoiceAmtDC;
            @XmlElement(name = "OutstandingAmtDC")
            protected float outstandingAmtDC;
            @XmlAttribute(name = "number")
            protected BigInteger number;

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link TypeDescription }
             *     
             */
            public TypeDescription getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeDescription }
             *     
             */
            public void setDescription(TypeDescription value) {
                this.description = value;
            }

            /**
             * Gets the value of the invoiceDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getInvoiceDate() {
                return invoiceDate;
            }

            /**
             * Sets the value of the invoiceDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setInvoiceDate(XMLGregorianCalendar value) {
                this.invoiceDate = value;
            }

            /**
             * Gets the value of the dueDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDueDate() {
                return dueDate;
            }

            /**
             * Sets the value of the dueDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDueDate(XMLGregorianCalendar value) {
                this.dueDate = value;
            }

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
             * Gets the value of the invoiceAmtFC property.
             * 
             */
            public float getInvoiceAmtFC() {
                return invoiceAmtFC;
            }

            /**
             * Sets the value of the invoiceAmtFC property.
             * 
             */
            public void setInvoiceAmtFC(float value) {
                this.invoiceAmtFC = value;
            }

            /**
             * Gets the value of the outstandingAmtFC property.
             * 
             */
            public float getOutstandingAmtFC() {
                return outstandingAmtFC;
            }

            /**
             * Sets the value of the outstandingAmtFC property.
             * 
             */
            public void setOutstandingAmtFC(float value) {
                this.outstandingAmtFC = value;
            }

            /**
             * Gets the value of the invoiceAmtDC property.
             * 
             */
            public float getInvoiceAmtDC() {
                return invoiceAmtDC;
            }

            /**
             * Sets the value of the invoiceAmtDC property.
             * 
             */
            public void setInvoiceAmtDC(float value) {
                this.invoiceAmtDC = value;
            }

            /**
             * Gets the value of the outstandingAmtDC property.
             * 
             */
            public float getOutstandingAmtDC() {
                return outstandingAmtDC;
            }

            /**
             * Sets the value of the outstandingAmtDC property.
             * 
             */
            public void setOutstandingAmtDC(float value) {
                this.outstandingAmtDC = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNumber(BigInteger value) {
                this.number = value;
            }

        }

    }

}
