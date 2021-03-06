//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.06 at 12:22:20 PM MSK 
//


package XML.MP_v06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Новый контур многоконтурного участка
 * 
 * <p>Java class for tNewContour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tNewContour"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{}tAreaContour"/&gt;
 *         &lt;element name="EntitySpatial" type="{}tEntitySpatialBordersZUInp"/&gt;
 *         &lt;element name="ProvidingPassCadastralNumbers" type="{}tProvidingPassCadastralNumbers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Definition" use="required" type="{}sNe50" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tNewContour", propOrder = {
    "area",
    "entitySpatial",
    "providingPassCadastralNumbers"
})
public class TNewContour {

    @XmlElement(name = "Area", required = true)
    protected TAreaContour area;
    @XmlElement(name = "EntitySpatial", required = true)
    protected TEntitySpatialBordersZUInp entitySpatial;
    @XmlElement(name = "ProvidingPassCadastralNumbers")
    protected TProvidingPassCadastralNumbers providingPassCadastralNumbers;
    @XmlAttribute(name = "Definition", required = true)
    protected String definition;

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
     * Gets the value of the entitySpatial property.
     * 
     * @return
     *     possible object is
     *     {@link TEntitySpatialBordersZUInp }
     *     
     */
    public TEntitySpatialBordersZUInp getEntitySpatial() {
        return entitySpatial;
    }

    /**
     * Sets the value of the entitySpatial property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEntitySpatialBordersZUInp }
     *     
     */
    public void setEntitySpatial(TEntitySpatialBordersZUInp value) {
        this.entitySpatial = value;
    }

    /**
     * Gets the value of the providingPassCadastralNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link TProvidingPassCadastralNumbers }
     *     
     */
    public TProvidingPassCadastralNumbers getProvidingPassCadastralNumbers() {
        return providingPassCadastralNumbers;
    }

    /**
     * Sets the value of the providingPassCadastralNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link TProvidingPassCadastralNumbers }
     *     
     */
    public void setProvidingPassCadastralNumbers(TProvidingPassCadastralNumbers value) {
        this.providingPassCadastralNumbers = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

}
