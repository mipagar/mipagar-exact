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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="Addressee" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;group ref="{}groupPersonName"/>
 *                   &lt;element name="Job" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element ref="{}Description"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;sequence>
 *             &lt;element name="AddressStreet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *             &lt;element name="AddressStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="AddressStreetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}State" minOccurs="0"/>
 *         &lt;element ref="{}Country" minOccurs="0"/>
 *         &lt;element ref="{}Phone" minOccurs="0"/>
 *         &lt;element ref="{}Fax" minOccurs="0"/>
 *         &lt;element ref="{}Mailbox" minOccurs="0"/>
 *         &lt;element name="Contact" type="{}typeContact" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="INV"/>
 *             &lt;enumeration value="POS"/>
 *             &lt;enumeration value="DEL"/>
 *             &lt;enumeration value="VIS"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute ref="{}default"/>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressee",
    "addressLine1",
    "addressStreet",
    "addressStreetNumber",
    "addressStreetSuffix",
    "addressLine2",
    "addressLine3",
    "addressNo",
    "addressSuffix",
    "postalCode",
    "city",
    "state",
    "country",
    "phone",
    "fax",
    "mailbox",
    "contact"
})
@XmlRootElement(name = "Address")
public class Address {

    @XmlElement(name = "Addressee")
    protected Address.Addressee addressee;
    @XmlElement(name = "AddressLine1")
    protected String addressLine1;
    @XmlElement(name = "AddressStreet")
    protected String addressStreet;
    @XmlElement(name = "AddressStreetNumber")
    protected String addressStreetNumber;
    @XmlElement(name = "AddressStreetSuffix")
    protected String addressStreetSuffix;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "AddressLine3")
    protected String addressLine3;
    @XmlElement(name = "AddressNo")
    protected String addressNo;
    @XmlElement(name = "AddressSuffix")
    protected String addressSuffix;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected State state;
    @XmlElement(name = "Country")
    protected Country country;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Mailbox")
    protected String mailbox;
    @XmlElement(name = "Contact")
    protected TypeContact contact;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "default")
    protected Boolean _default;
    @XmlAttribute(name = "ID")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;

    /**
     * Gets the value of the addressee property.
     * 
     * @return
     *     possible object is
     *     {@link Address.Addressee }
     *     
     */
    public Address.Addressee getAddressee() {
        return addressee;
    }

    /**
     * Sets the value of the addressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address.Addressee }
     *     
     */
    public void setAddressee(Address.Addressee value) {
        this.addressee = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreet() {
        return addressStreet;
    }

    /**
     * Sets the value of the addressStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreet(String value) {
        this.addressStreet = value;
    }

    /**
     * Gets the value of the addressStreetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreetNumber() {
        return addressStreetNumber;
    }

    /**
     * Sets the value of the addressStreetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreetNumber(String value) {
        this.addressStreetNumber = value;
    }

    /**
     * Gets the value of the addressStreetSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreetSuffix() {
        return addressStreetSuffix;
    }

    /**
     * Sets the value of the addressStreetSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreetSuffix(String value) {
        this.addressStreetSuffix = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNo() {
        return addressNo;
    }

    /**
     * Sets the value of the addressNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNo(String value) {
        this.addressNo = value;
    }

    /**
     * Gets the value of the addressSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressSuffix() {
        return addressSuffix;
    }

    /**
     * Sets the value of the addressSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressSuffix(String value) {
        this.addressSuffix = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setState(State value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
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
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link TypeContact }
     *     
     */
    public TypeContact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeContact }
     *     
     */
    public void setContact(TypeContact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefault(Boolean value) {
        this._default = value;
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
     *         &lt;group ref="{}groupPersonName"/>
     *         &lt;element name="Job" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element ref="{}Description"/>
     *                 &lt;/choice>
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
        "lastName",
        "middleName",
        "birthName",
        "birthNamePrefix",
        "partnerName",
        "partnerNamePrefix",
        "firstName",
        "initials",
        "fullName",
        "title",
        "language",
        "nationality",
        "phone",
        "phoneExt",
        "fax",
        "mobile",
        "email",
        "socialSecurityNumber",
        "image",
        "note",
        "job"
    })
    public static class Addressee {

        @XmlElement(name = "LastName")
        protected String lastName;
        @XmlElement(name = "MiddleName")
        protected String middleName;
        @XmlElement(name = "BirthName")
        protected String birthName;
        @XmlElement(name = "BirthNamePrefix")
        protected String birthNamePrefix;
        @XmlElement(name = "PartnerName")
        protected String partnerName;
        @XmlElement(name = "PartnerNamePrefix")
        protected String partnerNamePrefix;
        @XmlElement(name = "FirstName")
        protected String firstName;
        @XmlElement(name = "Initials")
        protected String initials;
        @XmlElement(name = "FullName")
        protected String fullName;
        @XmlElement(name = "Title")
        protected Title title;
        @XmlElement(name = "Language")
        protected Language language;
        @XmlElement(name = "Nationality")
        protected Nationality nationality;
        @XmlElement(name = "Phone")
        protected String phone;
        @XmlElement(name = "PhoneExt")
        protected String phoneExt;
        @XmlElement(name = "Fax")
        protected String fax;
        @XmlElement(name = "Mobile")
        protected String mobile;
        @XmlElement(name = "Email")
        protected String email;
        @XmlElement(name = "SocialSecurityNumber")
        protected Object socialSecurityNumber;
        @XmlElement(name = "Image")
        protected Image image;
        @XmlElement(name = "Note")
        protected String note;
        @XmlElement(name = "Job")
        protected Address.Addressee.Job job;

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the middleName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMiddleName() {
            return middleName;
        }

        /**
         * Sets the value of the middleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMiddleName(String value) {
            this.middleName = value;
        }

        /**
         * Gets the value of the birthName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBirthName() {
            return birthName;
        }

        /**
         * Sets the value of the birthName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBirthName(String value) {
            this.birthName = value;
        }

        /**
         * Gets the value of the birthNamePrefix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBirthNamePrefix() {
            return birthNamePrefix;
        }

        /**
         * Sets the value of the birthNamePrefix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBirthNamePrefix(String value) {
            this.birthNamePrefix = value;
        }

        /**
         * Gets the value of the partnerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartnerName() {
            return partnerName;
        }

        /**
         * Sets the value of the partnerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartnerName(String value) {
            this.partnerName = value;
        }

        /**
         * Gets the value of the partnerNamePrefix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartnerNamePrefix() {
            return partnerNamePrefix;
        }

        /**
         * Sets the value of the partnerNamePrefix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartnerNamePrefix(String value) {
            this.partnerNamePrefix = value;
        }

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the initials property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitials() {
            return initials;
        }

        /**
         * Sets the value of the initials property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitials(String value) {
            this.initials = value;
        }

        /**
         * Gets the value of the fullName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullName() {
            return fullName;
        }

        /**
         * Sets the value of the fullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullName(String value) {
            this.fullName = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link Title }
         *     
         */
        public Title getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link Title }
         *     
         */
        public void setTitle(Title value) {
            this.title = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link Language }
         *     
         */
        public Language getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link Language }
         *     
         */
        public void setLanguage(Language value) {
            this.language = value;
        }

        /**
         * Gets the value of the nationality property.
         * 
         * @return
         *     possible object is
         *     {@link Nationality }
         *     
         */
        public Nationality getNationality() {
            return nationality;
        }

        /**
         * Sets the value of the nationality property.
         * 
         * @param value
         *     allowed object is
         *     {@link Nationality }
         *     
         */
        public void setNationality(Nationality value) {
            this.nationality = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Gets the value of the phoneExt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneExt() {
            return phoneExt;
        }

        /**
         * Sets the value of the phoneExt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneExt(String value) {
            this.phoneExt = value;
        }

        /**
         * Gets the value of the fax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFax() {
            return fax;
        }

        /**
         * Sets the value of the fax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFax(String value) {
            this.fax = value;
        }

        /**
         * Gets the value of the mobile property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMobile() {
            return mobile;
        }

        /**
         * Sets the value of the mobile property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMobile(String value) {
            this.mobile = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the socialSecurityNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSocialSecurityNumber() {
            return socialSecurityNumber;
        }

        /**
         * Sets the value of the socialSecurityNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSocialSecurityNumber(Object value) {
            this.socialSecurityNumber = value;
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
         * Gets the value of the job property.
         * 
         * @return
         *     possible object is
         *     {@link Address.Addressee.Job }
         *     
         */
        public Address.Addressee.Job getJob() {
            return job;
        }

        /**
         * Sets the value of the job property.
         * 
         * @param value
         *     allowed object is
         *     {@link Address.Addressee.Job }
         *     
         */
        public void setJob(Address.Addressee.Job value) {
            this.job = value;
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
         *       &lt;choice>
         *         &lt;element ref="{}Description"/>
         *       &lt;/choice>
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
        public static class Job {

            @XmlElement(name = "Description")
            protected TypeDescription description;

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

        }

    }

}
