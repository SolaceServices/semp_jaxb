//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1-b171012.0423 
//         See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2019.10.25 at 09:51:26 AM EDT 
//


package com.solacesystems.semp_jaxb.r9_2_0VMR.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USER_VPN_ACCESS_LEVEL_PARAM.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="USER_VPN_ACCESS_LEVEL_PARAM"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="read-only"/&gt;
 *     &lt;enumeration value="read-write"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "USER_VPN_ACCESS_LEVEL_PARAM")
@XmlEnum
public enum USERVPNACCESSLEVELPARAM {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("read-only")
    READ_ONLY("read-only"),
    @XmlEnumValue("read-write")
    READ_WRITE("read-write");
    private final String value;

    USERVPNACCESSLEVELPARAM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static USERVPNACCESSLEVELPARAM fromValue(String v) {
        for (USERVPNACCESSLEVELPARAM c: USERVPNACCESSLEVELPARAM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}