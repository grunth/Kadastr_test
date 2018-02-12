//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.21 at 09:42:06 AM MSK 
//


package ga.osipov.XSD.MP_v06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * �������� � ��������� ���������
 * 
 * <p>Java class for tMeansSurvey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tMeansSurvey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeanSurvey" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Name" type="{}sNe1500"/&gt;
 *                   &lt;element name="Registration"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Number" type="{}sNe255"/&gt;
 *                             &lt;element name="Duration" type="{}sNe255"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CertificateVerification" type="{}sNe4000"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMeansSurvey", propOrder = {
    "meanSurvey"
})
public class TMeansSurvey {

    @XmlElement(name = "MeanSurvey", required = true)
    protected List<TMeansSurvey.MeanSurvey> meanSurvey;

    /**
     * Gets the value of the meanSurvey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meanSurvey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeanSurvey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMeansSurvey.MeanSurvey }
     * 
     * 
     */
    public List<TMeansSurvey.MeanSurvey> getMeanSurvey() {
        if (meanSurvey == null) {
            meanSurvey = new ArrayList<TMeansSurvey.MeanSurvey>();
        }
        return this.meanSurvey;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Name" type="{}sNe1500"/&gt;
     *         &lt;element name="Registration"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Number" type="{}sNe255"/&gt;
     *                   &lt;element name="Duration" type="{}sNe255"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CertificateVerification" type="{}sNe4000"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "registration",
        "certificateVerification"
    })
    public static class MeanSurvey {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Registration", required = true)
        protected TMeansSurvey.MeanSurvey.Registration registration;
        @XmlElement(name = "CertificateVerification", required = true)
        protected String certificateVerification;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the registration property.
         * 
         * @return
         *     possible object is
         *     {@link TMeansSurvey.MeanSurvey.Registration }
         *     
         */
        public TMeansSurvey.MeanSurvey.Registration getRegistration() {
            return registration;
        }

        /**
         * Sets the value of the registration property.
         * 
         * @param value
         *     allowed object is
         *     {@link TMeansSurvey.MeanSurvey.Registration }
         *     
         */
        public void setRegistration(TMeansSurvey.MeanSurvey.Registration value) {
            this.registration = value;
        }

        /**
         * Gets the value of the certificateVerification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertificateVerification() {
            return certificateVerification;
        }

        /**
         * Sets the value of the certificateVerification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertificateVerification(String value) {
            this.certificateVerification = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Number" type="{}sNe255"/&gt;
         *         &lt;element name="Duration" type="{}sNe255"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "number",
            "duration"
        })
        public static class Registration {

            @XmlElement(name = "Number", required = true)
            protected String number;
            @XmlElement(name = "Duration", required = true)
            protected String duration;

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the duration property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDuration() {
                return duration;
            }

            /**
             * Sets the value of the duration property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDuration(String value) {
                this.duration = value;
            }

        }

    }

}
