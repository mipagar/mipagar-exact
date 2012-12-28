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
 *         &lt;element name="Employee">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="EmployeeHID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}StartDate"/>
 *         &lt;element ref="{}EndDate" minOccurs="0"/>
 *         &lt;element name="StartDateOrganization" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ReasonEnd" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element ref="{}EmploymentContracts"/>
 *         &lt;element ref="{}EmploymentOrganizations"/>
 *         &lt;element ref="{}EmploymentCLAs"/>
 *       &lt;/sequence>
 *       &lt;attribute name="HID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="EmploymentNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "employee",
    "startDate",
    "endDate",
    "startDateOrganization",
    "reasonEnd",
    "employmentContracts",
    "employmentOrganizations",
    "employmentCLAs"
})
@XmlRootElement(name = "Employment")
public class Employment {

    @XmlElement(name = "Employee")
    protected Employment.Employee employee;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "StartDateOrganization")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDateOrganization;
    @XmlElement(name = "ReasonEnd")
    protected BigInteger reasonEnd;
    @XmlElement(name = "EmploymentContracts")
    protected EmploymentContracts employmentContracts;
    @XmlElement(name = "EmploymentOrganizations")
    protected EmploymentOrganizations employmentOrganizations;
    @XmlElement(name = "EmploymentCLAs")
    protected EmploymentCLAs employmentCLAs;
    @XmlAttribute(name = "HID", required = true)
    protected BigInteger hid;
    @XmlAttribute(name = "EmploymentNumber", required = true)
    protected BigInteger employmentNumber;

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link Employment.Employee }
     *     
     */
    public Employment.Employee getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employment.Employee }
     *     
     */
    public void setEmployee(Employment.Employee value) {
        this.employee = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the startDateOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateOrganization() {
        return startDateOrganization;
    }

    /**
     * Sets the value of the startDateOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateOrganization(XMLGregorianCalendar value) {
        this.startDateOrganization = value;
    }

    /**
     * Gets the value of the reasonEnd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonEnd() {
        return reasonEnd;
    }

    /**
     * Sets the value of the reasonEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonEnd(BigInteger value) {
        this.reasonEnd = value;
    }

    /**
     * Gets the value of the employmentContracts property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentContracts }
     *     
     */
    public EmploymentContracts getEmploymentContracts() {
        return employmentContracts;
    }

    /**
     * Sets the value of the employmentContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentContracts }
     *     
     */
    public void setEmploymentContracts(EmploymentContracts value) {
        this.employmentContracts = value;
    }

    /**
     * Gets the value of the employmentOrganizations property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentOrganizations }
     *     
     */
    public EmploymentOrganizations getEmploymentOrganizations() {
        return employmentOrganizations;
    }

    /**
     * Sets the value of the employmentOrganizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentOrganizations }
     *     
     */
    public void setEmploymentOrganizations(EmploymentOrganizations value) {
        this.employmentOrganizations = value;
    }

    /**
     * Gets the value of the employmentCLAs property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentCLAs }
     *     
     */
    public EmploymentCLAs getEmploymentCLAs() {
        return employmentCLAs;
    }

    /**
     * Sets the value of the employmentCLAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentCLAs }
     *     
     */
    public void setEmploymentCLAs(EmploymentCLAs value) {
        this.employmentCLAs = value;
    }

    /**
     * Gets the value of the hid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHID() {
        return hid;
    }

    /**
     * Sets the value of the hid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHID(BigInteger value) {
        this.hid = value;
    }

    /**
     * Gets the value of the employmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmploymentNumber() {
        return employmentNumber;
    }

    /**
     * Sets the value of the employmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmploymentNumber(BigInteger value) {
        this.employmentNumber = value;
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
     *       &lt;attribute name="EmployeeHID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Employee {

        @XmlAttribute(name = "EmployeeHID", required = true)
        protected BigInteger employeeHID;

        /**
         * Gets the value of the employeeHID property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEmployeeHID() {
            return employeeHID;
        }

        /**
         * Sets the value of the employeeHID property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEmployeeHID(BigInteger value) {
            this.employeeHID = value;
        }

    }

}
