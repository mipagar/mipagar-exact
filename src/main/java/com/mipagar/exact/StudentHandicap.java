//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.09 at 02:28:10 PM CEST 
//


package com.mipagar.exact;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}Handicap" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="HandicapCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "handicap"
})
@XmlRootElement(name = "StudentHandicap")
public class StudentHandicap {

    @XmlElement(name = "Handicap")
    protected List<Handicap> handicap;
    @XmlAttribute(name = "HandicapCode", required = true)
    protected String handicapCode;

    /**
     * Gets the value of the handicap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handicap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandicap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Handicap }
     * 
     * 
     */
    public List<Handicap> getHandicap() {
        if (handicap == null) {
            handicap = new ArrayList<Handicap>();
        }
        return this.handicap;
    }

    /**
     * Gets the value of the handicapCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandicapCode() {
        return handicapCode;
    }

    /**
     * Sets the value of the handicapCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandicapCode(String value) {
        this.handicapCode = value;
    }

}