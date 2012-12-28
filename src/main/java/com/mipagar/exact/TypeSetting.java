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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for typeSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{}typeDescription" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{}typeDescription" minOccurs="0"/>
 *         &lt;element name="FeatureSets" type="{}typeFeatureSets" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SettingName" use="required" type="{}typeString60" />
 *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ValueType" type="{}typeSettingValueEnum" />
 *       &lt;attribute name="Legislation" type="{}typeLegislation" />
 *       &lt;attribute name="TableName" type="{}typeString60" />
 *       &lt;attribute name="TemplateOnceOnly" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeSetting", propOrder = {
    "description",
    "suffix",
    "featureSets"
})
public class TypeSetting {

    @XmlElement(name = "Description")
    protected TypeDescription description;
    @XmlElement(name = "Suffix")
    protected TypeDescription suffix;
    @XmlElement(name = "FeatureSets")
    protected TypeFeatureSets featureSets;
    @XmlAttribute(name = "SettingName", required = true)
    protected String settingName;
    @XmlAttribute(name = "Value")
    @XmlSchemaType(name = "anySimpleType")
    protected String value;
    @XmlAttribute(name = "ValueType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valueType;
    @XmlAttribute(name = "Legislation")
    protected List<TypeLegislationEnum> legislation;
    @XmlAttribute(name = "TableName")
    protected String tableName;
    @XmlAttribute(name = "TemplateOnceOnly")
    protected BigInteger templateOnceOnly;

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
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDescription }
     *     
     */
    public TypeDescription getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDescription }
     *     
     */
    public void setSuffix(TypeDescription value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the featureSets property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFeatureSets }
     *     
     */
    public TypeFeatureSets getFeatureSets() {
        return featureSets;
    }

    /**
     * Sets the value of the featureSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFeatureSets }
     *     
     */
    public void setFeatureSets(TypeFeatureSets value) {
        this.featureSets = value;
    }

    /**
     * Gets the value of the settingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingName() {
        return settingName;
    }

    /**
     * Sets the value of the settingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingName(String value) {
        this.settingName = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueType(String value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the legislation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legislation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegislation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeLegislationEnum }
     * 
     * 
     */
    public List<TypeLegislationEnum> getLegislation() {
        if (legislation == null) {
            legislation = new ArrayList<TypeLegislationEnum>();
        }
        return this.legislation;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the templateOnceOnly property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTemplateOnceOnly() {
        return templateOnceOnly;
    }

    /**
     * Sets the value of the templateOnceOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTemplateOnceOnly(BigInteger value) {
        this.templateOnceOnly = value;
    }

}
