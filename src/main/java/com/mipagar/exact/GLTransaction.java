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
 *         &lt;element name="TransactionType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element ref="{}Description"/>
 *                 &lt;/sequence>
 *                 &lt;attribute ref="{}number use="required""/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}Journal" minOccurs="0"/>
 *         &lt;element ref="{}PaymentCondition" minOccurs="0"/>
 *         &lt;element name="ExternalLinks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExternalLink" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}Date" minOccurs="0"/>
 *         &lt;element ref="{}FinYear" minOccurs="0"/>
 *         &lt;element ref="{}FinPeriod" minOccurs="0"/>
 *         &lt;element name="OpeningBalance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ClosingBalance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element ref="{}Document" minOccurs="0"/>
 *         &lt;element ref="{}Description" minOccurs="0"/>
 *         &lt;element ref="{}Account" minOccurs="0"/>
 *         &lt;element ref="{}GLTransactionLine" maxOccurs="unbounded"/>
 *         &lt;element ref="{}PaymentTerms" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="entry" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transactionType",
    "journal",
    "paymentCondition",
    "externalLinks",
    "date",
    "finYear",
    "finPeriod",
    "openingBalance",
    "closingBalance",
    "document",
    "description",
    "account",
    "glTransactionLine",
    "paymentTerms"
})
@XmlRootElement(name = "GLTransaction")
public class GLTransaction {

    @XmlElement(name = "TransactionType")
    protected GLTransaction.TransactionType transactionType;
    @XmlElement(name = "Journal")
    protected Journal journal;
    @XmlElement(name = "PaymentCondition")
    protected PaymentCondition paymentCondition;
    @XmlElement(name = "ExternalLinks")
    protected GLTransaction.ExternalLinks externalLinks;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "FinYear")
    protected FinYear finYear;
    @XmlElement(name = "FinPeriod")
    protected FinPeriod finPeriod;
    @XmlElement(name = "OpeningBalance")
    protected Float openingBalance;
    @XmlElement(name = "ClosingBalance")
    protected Float closingBalance;
    @XmlElement(name = "Document")
    protected Document document;
    @XmlElement(name = "Description")
    protected TypeDescription description;
    @XmlElement(name = "Account")
    protected TypeAccount account;
    @XmlElement(name = "GLTransactionLine")
    protected List<GLTransactionLine> glTransactionLine;
    @XmlElement(name = "PaymentTerms")
    protected PaymentTerms paymentTerms;
    @XmlAttribute(name = "entry")
    protected BigInteger entry;

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link GLTransaction.TransactionType }
     *     
     */
    public GLTransaction.TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLTransaction.TransactionType }
     *     
     */
    public void setTransactionType(GLTransaction.TransactionType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the journal property.
     * 
     * @return
     *     possible object is
     *     {@link Journal }
     *     
     */
    public Journal getJournal() {
        return journal;
    }

    /**
     * Sets the value of the journal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Journal }
     *     
     */
    public void setJournal(Journal value) {
        this.journal = value;
    }

    /**
     * Gets the value of the paymentCondition property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCondition }
     *     
     */
    public PaymentCondition getPaymentCondition() {
        return paymentCondition;
    }

    /**
     * Sets the value of the paymentCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCondition }
     *     
     */
    public void setPaymentCondition(PaymentCondition value) {
        this.paymentCondition = value;
    }

    /**
     * Gets the value of the externalLinks property.
     * 
     * @return
     *     possible object is
     *     {@link GLTransaction.ExternalLinks }
     *     
     */
    public GLTransaction.ExternalLinks getExternalLinks() {
        return externalLinks;
    }

    /**
     * Sets the value of the externalLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLTransaction.ExternalLinks }
     *     
     */
    public void setExternalLinks(GLTransaction.ExternalLinks value) {
        this.externalLinks = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the finYear property.
     * 
     * @return
     *     possible object is
     *     {@link FinYear }
     *     
     */
    public FinYear getFinYear() {
        return finYear;
    }

    /**
     * Sets the value of the finYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinYear }
     *     
     */
    public void setFinYear(FinYear value) {
        this.finYear = value;
    }

    /**
     * Gets the value of the finPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link FinPeriod }
     *     
     */
    public FinPeriod getFinPeriod() {
        return finPeriod;
    }

    /**
     * Sets the value of the finPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinPeriod }
     *     
     */
    public void setFinPeriod(FinPeriod value) {
        this.finPeriod = value;
    }

    /**
     * Gets the value of the openingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOpeningBalance() {
        return openingBalance;
    }

    /**
     * Sets the value of the openingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOpeningBalance(Float value) {
        this.openingBalance = value;
    }

    /**
     * Gets the value of the closingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getClosingBalance() {
        return closingBalance;
    }

    /**
     * Sets the value of the closingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setClosingBalance(Float value) {
        this.closingBalance = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocument(Document value) {
        this.document = value;
    }

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
     * Gets the value of the glTransactionLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glTransactionLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGLTransactionLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GLTransactionLine }
     * 
     * 
     */
    public List<GLTransactionLine> getGLTransactionLine() {
        if (glTransactionLine == null) {
            glTransactionLine = new ArrayList<GLTransactionLine>();
        }
        return this.glTransactionLine;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTerms }
     *     
     */
    public PaymentTerms getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTerms }
     *     
     */
    public void setPaymentTerms(PaymentTerms value) {
        this.paymentTerms = value;
    }

    /**
     * Gets the value of the entry property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntry() {
        return entry;
    }

    /**
     * Sets the value of the entry property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntry(BigInteger value) {
        this.entry = value;
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
     *         &lt;element name="ExternalLink" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
        "externalLink"
    })
    public static class ExternalLinks {

        @XmlElement(name = "ExternalLink")
        protected GLTransaction.ExternalLinks.ExternalLink externalLink;

        /**
         * Gets the value of the externalLink property.
         * 
         * @return
         *     possible object is
         *     {@link GLTransaction.ExternalLinks.ExternalLink }
         *     
         */
        public GLTransaction.ExternalLinks.ExternalLink getExternalLink() {
            return externalLink;
        }

        /**
         * Sets the value of the externalLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link GLTransaction.ExternalLinks.ExternalLink }
         *     
         */
        public void setExternalLink(GLTransaction.ExternalLinks.ExternalLink value) {
            this.externalLink = value;
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
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
            "description",
            "reference"
        })
        public static class ExternalLink {

            @XmlElement(name = "Description")
            protected Object description;
            @XmlElement(name = "Reference", required = true)
            protected Object reference;

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setDescription(Object value) {
                this.description = value;
            }

            /**
             * Gets the value of the reference property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getReference() {
                return reference;
            }

            /**
             * Sets the value of the reference property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setReference(Object value) {
                this.reference = value;
            }

        }

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
     *       &lt;sequence minOccurs="0">
     *         &lt;element ref="{}Description"/>
     *       &lt;/sequence>
     *       &lt;attribute ref="{}number use="required""/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class TransactionType {

        @XmlElement(name = "Description")
        protected TypeDescription description;
        @XmlAttribute(name = "number", required = true)
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