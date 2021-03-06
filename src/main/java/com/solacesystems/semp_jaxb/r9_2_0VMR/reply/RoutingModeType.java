//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1-b171012.0423 
//         See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2019.10.25 at 09:51:33 AM EDT 
//


package com.solacesystems.semp_jaxb.r9_2_0VMR.reply;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routing-mode-type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="routing-mode-type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dynamic-message-routing"/&gt;
 *     &lt;enumeration value="multi-node-routing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "routing-mode-type")
@XmlEnum
public enum RoutingModeType {

    @XmlEnumValue("dynamic-message-routing")
    DYNAMIC_MESSAGE_ROUTING("dynamic-message-routing"),
    @XmlEnumValue("multi-node-routing")
    MULTI_NODE_ROUTING("multi-node-routing");
    private final String value;

    RoutingModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutingModeType fromValue(String v) {
        for (RoutingModeType c: RoutingModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
