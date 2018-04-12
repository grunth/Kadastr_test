//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.06 at 12:22:20 PM MSK 
//


package XML.MP_v06;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Описание пункта геодезической сети (ОМС)
 * 
 * <p>Java class for tSetOfPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSetOfPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PName" type="{}sNe4000"/&gt;
 *         &lt;element name="PKind" type="{}sNe4000"/&gt;
 *         &lt;element name="PKlass" type="{}sNe4000"/&gt;
 *         &lt;element name="OrdX" type="{}d38_2"/&gt;
 *         &lt;element name="OrdY" type="{}d38_2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSetOfPoint", propOrder = {
    "pName",
    "pKind",
    "pKlass",
    "ordX",
    "ordY"
})
public class TSetOfPoint {

    @XmlElement(name = "PName", required = true)
    protected String pName;
    @XmlElement(name = "PKind", required = true)
    protected String pKind;
    @XmlElement(name = "PKlass", required = true)
    protected String pKlass;
    @XmlElement(name = "OrdX", required = true)
    protected BigDecimal ordX;
    @XmlElement(name = "OrdY", required = true)
    protected BigDecimal ordY;

    /**
     * Gets the value of the pName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPName() {
        return pName;
    }

    /**
     * Sets the value of the pName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPName(String value) {
        this.pName = value;
    }

    /**
     * Gets the value of the pKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPKind() {
        return pKind;
    }

    /**
     * Sets the value of the pKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPKind(String value) {
        this.pKind = value;
    }

    /**
     * Gets the value of the pKlass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPKlass() {
        return pKlass;
    }

    /**
     * Sets the value of the pKlass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPKlass(String value) {
        this.pKlass = value;
    }

    /**
     * Gets the value of the ordX property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrdX() {
        return ordX;
    }

    /**
     * Sets the value of the ordX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrdX(BigDecimal value) {
        this.ordX = value;
    }

    /**
     * Gets the value of the ordY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrdY() {
        return ordY;
    }

    /**
     * Sets the value of the ordY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrdY(BigDecimal value) {
        this.ordY = value;
    }

}