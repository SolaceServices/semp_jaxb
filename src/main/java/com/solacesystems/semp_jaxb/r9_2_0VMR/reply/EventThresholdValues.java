//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1-b171012.0423 
//         See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2019.10.25 at 09:51:33 AM EDT 
//


package com.solacesystems.semp_jaxb.r9_2_0VMR.reply;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for event-threshold-values complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="event-threshold-values"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="set-value" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="clear-value" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event-threshold-values", propOrder = {

})
public class EventThresholdValues {

    @XmlElement(name = "set-value")
    @XmlSchemaType(name = "unsignedInt")
    protected long setValue;
    @XmlElement(name = "clear-value")
    @XmlSchemaType(name = "unsignedInt")
    protected long clearValue;

    /**
     * Gets the value of the setValue property.
     * 
     */
    public long getSetValue() {
        return setValue;
    }

    /**
     * Sets the value of the setValue property.
     * 
     */
    public void setSetValue(long value) {
        this.setValue = value;
    }

    /**
     * Gets the value of the clearValue property.
     * 
     */
    public long getClearValue() {
        return clearValue;
    }

    /**
     * Sets the value of the clearValue property.
     * 
     */
    public void setClearValue(long value) {
        this.clearValue = value;
    }

}
