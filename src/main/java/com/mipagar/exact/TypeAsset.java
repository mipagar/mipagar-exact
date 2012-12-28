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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for typeAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeAsset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}Description"/>
 *         &lt;/sequence>
 *         &lt;element ref="{}AssetGroup"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}DepreciationMethod"/>
 *           &lt;element name="InvestmentAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *           &lt;element name="InvestmentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="PurchaseLine" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="journalNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="financialYear" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                   &lt;attribute name="entryNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                   &lt;attribute name="entryLine" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Supplier" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element ref="{}Costcenter" minOccurs="0"/>
 *           &lt;element ref="{}Costunit" minOccurs="0"/>
 *           &lt;element ref="{}ParentAsset" minOccurs="0"/>
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="InvestmentDeduction">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                   &lt;enumeration value="O"/>
 *                   &lt;enumeration value="S"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="DeductionPercentage" type="{}typePercentage"/>
 *           &lt;/sequence>
 *           &lt;element ref="{}Image" minOccurs="0"/>
 *           &lt;element ref="{}Note" minOccurs="0"/>
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="EngineType">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element ref="{}Description" minOccurs="0"/>
 *                     &lt;/sequence>
 *                     &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="EngineEmission" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *             &lt;element name="CatalogueValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="DepreciationStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *             &lt;element name="RevaluationAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *             &lt;element name="ResidualAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *             &lt;sequence minOccurs="0">
 *               &lt;choice>
 *                 &lt;element name="DepreciatedSince" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;element name="DepreciatedPeriods" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *               &lt;/choice>
 *               &lt;element name="DepreciatedAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *             &lt;/sequence>
 *           &lt;/sequence>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}code use="required""/>
 *       &lt;attribute name="status">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="A"/>
 *             &lt;enumeration value="D"/>
 *             &lt;enumeration value="S"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAsset", propOrder = {
    "description",
    "assetGroup",
    "depreciationMethod",
    "investmentAmount",
    "investmentDate",
    "purchaseLine",
    "supplier",
    "costcenter",
    "costunit",
    "parentAsset",
    "investmentDeduction",
    "deductionPercentage",
    "image",
    "note",
    "engineType",
    "engineEmission",
    "catalogueValue",
    "depreciationStartDate",
    "revaluationAmount",
    "residualAmount",
    "depreciatedSince",
    "depreciatedPeriods",
    "depreciatedAmount"
})
public class TypeAsset {

    @XmlElement(name = "Description")
    protected TypeDescription description;
    @XmlElement(name = "AssetGroup", required = true)
    protected TypeAssetGroup assetGroup;
    @XmlElement(name = "DepreciationMethod")
    protected TypeDepreciationMethod depreciationMethod;
    @XmlElement(name = "InvestmentAmount")
    protected Float investmentAmount;
    @XmlElement(name = "InvestmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar investmentDate;
    @XmlElement(name = "PurchaseLine")
    protected TypeAsset.PurchaseLine purchaseLine;
    @XmlElement(name = "Supplier")
    protected TypeAsset.Supplier supplier;
    @XmlElement(name = "Costcenter")
    protected Costcenter costcenter;
    @XmlElement(name = "Costunit")
    protected Costunit costunit;
    @XmlElement(name = "ParentAsset")
    protected TypeAsset parentAsset;
    @XmlElement(name = "InvestmentDeduction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String investmentDeduction;
    @XmlElement(name = "DeductionPercentage")
    protected Float deductionPercentage;
    @XmlElement(name = "Image")
    protected Image image;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "EngineType")
    protected TypeAsset.EngineType engineType;
    @XmlElement(name = "EngineEmission")
    protected BigInteger engineEmission;
    @XmlElement(name = "CatalogueValue")
    protected Float catalogueValue;
    @XmlElement(name = "DepreciationStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar depreciationStartDate;
    @XmlElement(name = "RevaluationAmount")
    protected Float revaluationAmount;
    @XmlElement(name = "ResidualAmount")
    protected Float residualAmount;
    @XmlElement(name = "DepreciatedSince")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar depreciatedSince;
    @XmlElement(name = "DepreciatedPeriods")
    protected BigInteger depreciatedPeriods;
    @XmlElement(name = "DepreciatedAmount")
    protected Float depreciatedAmount;
    @XmlAttribute(name = "code", required = true)
    protected String code;
    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;

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
     * Gets the value of the assetGroup property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAssetGroup }
     *     
     */
    public TypeAssetGroup getAssetGroup() {
        return assetGroup;
    }

    /**
     * Sets the value of the assetGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAssetGroup }
     *     
     */
    public void setAssetGroup(TypeAssetGroup value) {
        this.assetGroup = value;
    }

    /**
     * Depreciation method used to calculate depreciation budget plans.
     * On import: if asset already exists and almost one depreciation entry already exists then the depreciation method will be ignored.
     * 
     * @return
     *     possible object is
     *     {@link TypeDepreciationMethod }
     *     
     */
    public TypeDepreciationMethod getDepreciationMethod() {
        return depreciationMethod;
    }

    /**
     * Sets the value of the depreciationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDepreciationMethod }
     *     
     */
    public void setDepreciationMethod(TypeDepreciationMethod value) {
        this.depreciationMethod = value;
    }

    /**
     * Gets the value of the investmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getInvestmentAmount() {
        return investmentAmount;
    }

    /**
     * Sets the value of the investmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setInvestmentAmount(Float value) {
        this.investmentAmount = value;
    }

    /**
     * Gets the value of the investmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvestmentDate() {
        return investmentDate;
    }

    /**
     * Sets the value of the investmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvestmentDate(XMLGregorianCalendar value) {
        this.investmentDate = value;
    }

    /**
     * Gets the value of the purchaseLine property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAsset.PurchaseLine }
     *     
     */
    public TypeAsset.PurchaseLine getPurchaseLine() {
        return purchaseLine;
    }

    /**
     * Sets the value of the purchaseLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAsset.PurchaseLine }
     *     
     */
    public void setPurchaseLine(TypeAsset.PurchaseLine value) {
        this.purchaseLine = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAsset.Supplier }
     *     
     */
    public TypeAsset.Supplier getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAsset.Supplier }
     *     
     */
    public void setSupplier(TypeAsset.Supplier value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the costcenter property.
     * 
     * @return
     *     possible object is
     *     {@link Costcenter }
     *     
     */
    public Costcenter getCostcenter() {
        return costcenter;
    }

    /**
     * Sets the value of the costcenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Costcenter }
     *     
     */
    public void setCostcenter(Costcenter value) {
        this.costcenter = value;
    }

    /**
     * Gets the value of the costunit property.
     * 
     * @return
     *     possible object is
     *     {@link Costunit }
     *     
     */
    public Costunit getCostunit() {
        return costunit;
    }

    /**
     * Sets the value of the costunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Costunit }
     *     
     */
    public void setCostunit(Costunit value) {
        this.costunit = value;
    }

    /**
     * Gets the value of the parentAsset property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAsset }
     *     
     */
    public TypeAsset getParentAsset() {
        return parentAsset;
    }

    /**
     * Sets the value of the parentAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAsset }
     *     
     */
    public void setParentAsset(TypeAsset value) {
        this.parentAsset = value;
    }

    /**
     * Gets the value of the investmentDeduction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvestmentDeduction() {
        return investmentDeduction;
    }

    /**
     * Sets the value of the investmentDeduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvestmentDeduction(String value) {
        this.investmentDeduction = value;
    }

    /**
     * Gets the value of the deductionPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeductionPercentage() {
        return deductionPercentage;
    }

    /**
     * Sets the value of the deductionPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeductionPercentage(Float value) {
        this.deductionPercentage = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the engineType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAsset.EngineType }
     *     
     */
    public TypeAsset.EngineType getEngineType() {
        return engineType;
    }

    /**
     * Sets the value of the engineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAsset.EngineType }
     *     
     */
    public void setEngineType(TypeAsset.EngineType value) {
        this.engineType = value;
    }

    /**
     * Gets the value of the engineEmission property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEngineEmission() {
        return engineEmission;
    }

    /**
     * Sets the value of the engineEmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEngineEmission(BigInteger value) {
        this.engineEmission = value;
    }

    /**
     * Gets the value of the catalogueValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCatalogueValue() {
        return catalogueValue;
    }

    /**
     * Sets the value of the catalogueValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCatalogueValue(Float value) {
        this.catalogueValue = value;
    }

    /**
     * Gets the value of the depreciationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepreciationStartDate() {
        return depreciationStartDate;
    }

    /**
     * Sets the value of the depreciationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepreciationStartDate(XMLGregorianCalendar value) {
        this.depreciationStartDate = value;
    }

    /**
     * Gets the value of the revaluationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRevaluationAmount() {
        return revaluationAmount;
    }

    /**
     * Sets the value of the revaluationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRevaluationAmount(Float value) {
        this.revaluationAmount = value;
    }

    /**
     * Gets the value of the residualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getResidualAmount() {
        return residualAmount;
    }

    /**
     * Sets the value of the residualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setResidualAmount(Float value) {
        this.residualAmount = value;
    }

    /**
     * Gets the value of the depreciatedSince property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepreciatedSince() {
        return depreciatedSince;
    }

    /**
     * Sets the value of the depreciatedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepreciatedSince(XMLGregorianCalendar value) {
        this.depreciatedSince = value;
    }

    /**
     * Gets the value of the depreciatedPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepreciatedPeriods() {
        return depreciatedPeriods;
    }

    /**
     * Sets the value of the depreciatedPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepreciatedPeriods(BigInteger value) {
        this.depreciatedPeriods = value;
    }

    /**
     * Gets the value of the depreciatedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepreciatedAmount() {
        return depreciatedAmount;
    }

    /**
     * Sets the value of the depreciatedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepreciatedAmount(Float value) {
        this.depreciatedAmount = value;
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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     *       &lt;/sequence>
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
    public static class EngineType {

        @XmlElement(name = "Description")
        protected TypeDescription description;
        @XmlAttribute(name = "code", required = true)
        protected BigInteger code;

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
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCode(BigInteger value) {
            this.code = value;
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
     *       &lt;attribute name="journalNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="financialYear" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="entryNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="entryLine" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PurchaseLine {

        @XmlAttribute(name = "journalNumber", required = true)
        protected String journalNumber;
        @XmlAttribute(name = "financialYear", required = true)
        protected BigInteger financialYear;
        @XmlAttribute(name = "entryNumber", required = true)
        protected BigInteger entryNumber;
        @XmlAttribute(name = "entryLine", required = true)
        protected BigInteger entryLine;

        /**
         * Gets the value of the journalNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJournalNumber() {
            return journalNumber;
        }

        /**
         * Sets the value of the journalNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJournalNumber(String value) {
            this.journalNumber = value;
        }

        /**
         * Gets the value of the financialYear property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFinancialYear() {
            return financialYear;
        }

        /**
         * Sets the value of the financialYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFinancialYear(BigInteger value) {
            this.financialYear = value;
        }

        /**
         * Gets the value of the entryNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEntryNumber() {
            return entryNumber;
        }

        /**
         * Sets the value of the entryNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEntryNumber(BigInteger value) {
            this.entryNumber = value;
        }

        /**
         * Gets the value of the entryLine property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEntryLine() {
            return entryLine;
        }

        /**
         * Sets the value of the entryLine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEntryLine(BigInteger value) {
            this.entryLine = value;
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
     *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Supplier {

        @XmlAttribute(name = "code", required = true)
        protected String code;

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

}