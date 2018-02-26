
package com.mysql.ws.model.thirdparty.seriva;

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
 *         &lt;element name="calypsoMessage" type="{http://localhost:8080}calypsoMessage"/>
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
    "calypsoMessage"
})
@XmlRootElement(name = "getMessageRequest")
public class GetMessageRequest {

    @XmlElement(required = true)
    protected CalypsoMessage calypsoMessage;

    /**
     * Gets the value of the calypsoMessage property.
     * 
     * @return
     *     possible object is
     *     {@link CalypsoMessage }
     *     
     */
    public CalypsoMessage getCalypsoMessage() {
        return calypsoMessage;
    }

    /**
     * Sets the value of the calypsoMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalypsoMessage }
     *     
     */
    public void setCalypsoMessage(CalypsoMessage value) {
        this.calypsoMessage = value;
    }

}
