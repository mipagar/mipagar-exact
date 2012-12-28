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
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="GLAccount" type="{}typeGLAccount"/>
 *         &lt;element name="Account" type="{}typeAccount" minOccurs="0"/>
 *         &lt;element name="MatchLines">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}MatchLine" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}WriteOff" minOccurs="0"/>
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
    "glAccount",
    "account",
    "matchLines",
    "writeOff"
})
@XmlRootElement(name = "MatchSet")
public class MatchSet {

    @XmlElement(name = "GLAccount")
    protected TypeGLAccount glAccount;
    @XmlElement(name = "Account")
    protected TypeAccount account;
    @XmlElement(name = "MatchLines")
    protected MatchSet.MatchLines matchLines;
    @XmlElement(name = "WriteOff")
    protected WriteOff writeOff;

    /**
     * Gets the value of the glAccount property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGLAccount }
     *     
     */
    public TypeGLAccount getGLAccount() {
        return glAccount;
    }

    /**
     * Sets the value of the glAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGLAccount }
     *     
     */
    public void setGLAccount(TypeGLAccount value) {
        this.glAccount = value;
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
     * Gets the value of the matchLines property.
     * 
     * @return
     *     possible object is
     *     {@link MatchSet.MatchLines }
     *     
     */
    public MatchSet.MatchLines getMatchLines() {
        return matchLines;
    }

    /**
     * Sets the value of the matchLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchSet.MatchLines }
     *     
     */
    public void setMatchLines(MatchSet.MatchLines value) {
        this.matchLines = value;
    }

    /**
     * Gets the value of the writeOff property.
     * 
     * @return
     *     possible object is
     *     {@link WriteOff }
     *     
     */
    public WriteOff getWriteOff() {
        return writeOff;
    }

    /**
     * Sets the value of the writeOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteOff }
     *     
     */
    public void setWriteOff(WriteOff value) {
        this.writeOff = value;
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
     *         &lt;element ref="{}MatchLine" maxOccurs="unbounded"/>
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
        "matchLine"
    })
    public static class MatchLines {

        @XmlElement(name = "MatchLine", required = true)
        protected List<MatchLine> matchLine;

        /**
         * Gets the value of the matchLine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the matchLine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMatchLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MatchLine }
         * 
         * 
         */
        public List<MatchLine> getMatchLine() {
            if (matchLine == null) {
                matchLine = new ArrayList<MatchLine>();
            }
            return this.matchLine;
        }

    }

}
