
package com.mysql.ws.model.thirdparty.seriva;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calypsoMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calypsoMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tradeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="externalReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tradeStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tradeSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productSubType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sentDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calypsoMessage", propOrder = {
    "tradeId",
    "externalReference",
    "tradeStatus",
    "tradeSource",
    "productType",
    "productSubType",
    "sentDate"
})
public class CalypsoMessage {

    @XmlElement(required = true)
    protected String tradeId;
    @XmlElement(required = true)
    protected String externalReference;
    @XmlElement(required = true)
    protected String tradeStatus;
    @XmlElement(required = true)
    protected String tradeSource;
    @XmlElement(required = true)
    protected String productType;
    @XmlElement(required = true)
    protected String productSubType;
    @XmlElement(required = true)
    protected String sentDate;

    /**
     * Gets the value of the tradeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeId() {
        return tradeId;
    }

    /**
     * Sets the value of the tradeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeId(String value) {
        this.tradeId = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the tradeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeStatus() {
        return tradeStatus;
    }

    /**
     * Sets the value of the tradeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeStatus(String value) {
        this.tradeStatus = value;
    }

    /**
     * Gets the value of the tradeSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeSource() {
        return tradeSource;
    }

    /**
     * Sets the value of the tradeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeSource(String value) {
        this.tradeSource = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the productSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSubType() {
        return productSubType;
    }

    /**
     * Sets the value of the productSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSubType(String value) {
        this.productSubType = value;
    }

    /**
     * Gets the value of the sentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentDate() {
        return sentDate;
    }

    /**
     * Sets the value of the sentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentDate(String value) {
        this.sentDate = value;
    }

}
