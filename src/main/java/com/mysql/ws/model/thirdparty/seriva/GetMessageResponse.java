
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
 *         &lt;element name="serivaMessage" type="{http://localhost:8080}serivaMessage"/>
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
    "serivaMessage"
})
@XmlRootElement(name = "getMessageResponse")
public class GetMessageResponse {

    @XmlElement(required = true)
    protected SerivaMessage serivaMessage;

    /**
     * Gets the value of the serivaMessage property.
     * 
     * @return
     *     possible object is
     *     {@link SerivaMessage }
     *     
     */
    public SerivaMessage getSerivaMessage() {
        return serivaMessage;
    }

    /**
     * Sets the value of the serivaMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerivaMessage }
     *     
     */
    public void setSerivaMessage(SerivaMessage value) {
        this.serivaMessage = value;
    }

}
