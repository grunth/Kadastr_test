//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.06 at 12:22:20 PM MSK 
//


package XML.MP_v06;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Существующая (неизменяемая) часть участка
 * 
 * <p>Java class for tInvariableSubParcel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tInvariableSubParcel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{}tAreaWithoutInaccuracy"/&gt;
 *         &lt;element name="Encumbrance" type="{}tEncumbrance"/&gt;
 *         &lt;element name="Contours" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Contour" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Area" type="{}tAreaContour"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Number" use="required" type="{}sNe100" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="NumberRecord" use="required" type="{}p10" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tInvariableSubParcel", propOrder = {
    "area",
    "encumbrance",
    "contours"
})
public class TInvariableSubParcel {

    @XmlElement(name = "Area", required = true)
    protected TAreaWithoutInaccuracy area;
    @XmlElement(name = "Encumbrance", required = true)
    protected TEncumbrance encumbrance;
    @XmlElement(name = "Contours")
    protected TInvariableSubParcel.Contours contours;
    @XmlAttribute(name = "NumberRecord", required = true)
    protected BigInteger numberRecord;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link TAreaWithoutInaccuracy }
     *     
     */
    public TAreaWithoutInaccuracy getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAreaWithoutInaccuracy }
     *     
     */
    public void setArea(TAreaWithoutInaccuracy value) {
        this.area = value;
    }

    /**
     * Gets the value of the encumbrance property.
     * 
     * @return
     *     possible object is
     *     {@link TEncumbrance }
     *     
     */
    public TEncumbrance getEncumbrance() {
        return encumbrance;
    }

    /**
     * Sets the value of the encumbrance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEncumbrance }
     *     
     */
    public void setEncumbrance(TEncumbrance value) {
        this.encumbrance = value;
    }

    /**
     * Gets the value of the contours property.
     * 
     * @return
     *     possible object is
     *     {@link TInvariableSubParcel.Contours }
     *     
     */
    public TInvariableSubParcel.Contours getContours() {
        return contours;
    }

    /**
     * Sets the value of the contours property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInvariableSubParcel.Contours }
     *     
     */
    public void setContours(TInvariableSubParcel.Contours value) {
        this.contours = value;
    }

    /**
     * Gets the value of the numberRecord property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberRecord() {
        return numberRecord;
    }

    /**
     * Sets the value of the numberRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberRecord(BigInteger value) {
        this.numberRecord = value;
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
     *         &lt;element name="Contour" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Area" type="{}tAreaContour"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Number" use="required" type="{}sNe100" /&gt;
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
    @XmlType(name = "", propOrder = {
        "contour"
    })
    public static class Contours {

        @XmlElement(name = "Contour", required = true)
        protected List<TInvariableSubParcel.Contours.Contour> contour;

        /**
         * Gets the value of the contour property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contour property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContour().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TInvariableSubParcel.Contours.Contour }
         * 
         * 
         */
        public List<TInvariableSubParcel.Contours.Contour> getContour() {
            if (contour == null) {
                contour = new ArrayList<TInvariableSubParcel.Contours.Contour>();
            }
            return this.contour;
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
         *         &lt;element name="Area" type="{}tAreaContour"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Number" use="required" type="{}sNe100" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "area"
        })
        public static class Contour {

            @XmlElement(name = "Area", required = true)
            protected TAreaContour area;
            @XmlAttribute(name = "Number", required = true)
            protected String number;

            /**
             * Gets the value of the area property.
             * 
             * @return
             *     possible object is
             *     {@link TAreaContour }
             *     
             */
            public TAreaContour getArea() {
                return area;
            }

            /**
             * Sets the value of the area property.
             * 
             * @param value
             *     allowed object is
             *     {@link TAreaContour }
             *     
             */
            public void setArea(TAreaContour value) {
                this.area = value;
            }

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

        }

    }

}