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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for redundancy-info-type complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="redundancy-info-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="config"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="routing-interface" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="vrrp-vrid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="status"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="activity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="vrrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="routing-interface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="vrrp-priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="detail" type="{}redundancy-detail-info-type" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "redundancy-info-type", propOrder = {

})
public class RedundancyInfoType {

    @XmlElement(required = true)
    protected RedundancyInfoType.Config config;
    @XmlElement(required = true)
    protected RedundancyInfoType.Status status;

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link RedundancyInfoType.Config }
     *     
     */
    public RedundancyInfoType.Config getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedundancyInfoType.Config }
     *     
     */
    public void setConfig(RedundancyInfoType.Config value) {
        this.config = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RedundancyInfoType.Status }
     *     
     */
    public RedundancyInfoType.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedundancyInfoType.Status }
     *     
     */
    public void setStatus(RedundancyInfoType.Status value) {
        this.status = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected         content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="routing-interface" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="vrrp-vrid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Config {

        @XmlElement(name = "routing-interface", required = true)
        protected String routingInterface;
        @XmlElement(name = "vrrp-vrid")
        protected int vrrpVrid;

        /**
         * Gets the value of the routingInterface property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoutingInterface() {
            return routingInterface;
        }

        /**
         * Sets the value of the routingInterface property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoutingInterface(String value) {
            this.routingInterface = value;
        }

        /**
         * Gets the value of the vrrpVrid property.
         * 
         */
        public int getVrrpVrid() {
            return vrrpVrid;
        }

        /**
         * Sets the value of the vrrpVrid property.
         * 
         */
        public void setVrrpVrid(int value) {
            this.vrrpVrid = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected         content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="activity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="vrrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="routing-interface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="vrrp-priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="detail" type="{}redundancy-detail-info-type" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Status {

        @XmlElement(required = true)
        protected String activity;
        protected String vrrp;
        @XmlElement(name = "routing-interface")
        protected String routingInterface;
        @XmlElement(name = "vrrp-priority")
        protected String vrrpPriority;
        protected RedundancyDetailInfoType detail;

        /**
         * Gets the value of the activity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActivity() {
            return activity;
        }

        /**
         * Sets the value of the activity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActivity(String value) {
            this.activity = value;
        }

        /**
         * Gets the value of the vrrp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVrrp() {
            return vrrp;
        }

        /**
         * Sets the value of the vrrp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVrrp(String value) {
            this.vrrp = value;
        }

        /**
         * Gets the value of the routingInterface property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoutingInterface() {
            return routingInterface;
        }

        /**
         * Sets the value of the routingInterface property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoutingInterface(String value) {
            this.routingInterface = value;
        }

        /**
         * Gets the value of the vrrpPriority property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVrrpPriority() {
            return vrrpPriority;
        }

        /**
         * Sets the value of the vrrpPriority property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVrrpPriority(String value) {
            this.vrrpPriority = value;
        }

        /**
         * Gets the value of the detail property.
         * 
         * @return
         *     possible object is
         *     {@link RedundancyDetailInfoType }
         *     
         */
        public RedundancyDetailInfoType getDetail() {
            return detail;
        }

        /**
         * Sets the value of the detail property.
         * 
         * @param value
         *     allowed object is
         *     {@link RedundancyDetailInfoType }
         *     
         */
        public void setDetail(RedundancyDetailInfoType value) {
            this.detail = value;
        }

    }

}
