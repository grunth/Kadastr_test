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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Адрес (описание местоположения) и признак, позволяющий отличить адрес и описание местоположения
 * 
 * <p>Java class for tAddressInpFullExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tAddressInpFullExt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}tAddressInpFull"&gt;
 *       &lt;attribute ref="{}AddressOrLocation use="required""/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAddressInpFullExt")
@XmlSeeAlso({
    TAddressInpFullOKS.class,
    XML.MP_v06.TNewParcel.Address.class
})
public class TAddressInpFullExt
    extends TAddressInpFull
{

    @XmlAttribute(name = "AddressOrLocation", required = true)
    protected String addressOrLocation;

    /**
     * Gets the value of the addressOrLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressOrLocation() {
        return addressOrLocation;
    }

    /**
     * Sets the value of the addressOrLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressOrLocation(String value) {
        this.addressOrLocation = value;
    }

}
