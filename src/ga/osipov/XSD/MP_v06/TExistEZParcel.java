//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.21 at 09:42:06 AM MSK 
//


package ga.osipov.XSD.MP_v06;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * �������� ������� ���������������� � ��� ������
 * 
 * <p>Java class for tExistEZParcel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tExistEZParcel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CadastralBlock" type="{}CadastralBlockType"/&gt;
 *         &lt;element name="ObjectRealty" type="{}tObjectRealty" minOccurs="0"/&gt;
 *         &lt;element name="Area" type="{}tAreaNew"/&gt;
 *         &lt;element name="SubParcels" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NewSubParcel" type="{}tNewSubParcel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ExistSubParcel" type="{}tExistSubParcel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="InvariableSubParcel" type="{}tInvariableSubParcel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CompositionEZ" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="InsertEntryParcels" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="InsertEntryParcel" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;element name="ExistEntryParcel" type="{}tCadastralNumberInp"/&gt;
 *                                       &lt;element name="NewEntryParcel" type="{}tNewEZEntryParcel"/&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DeleteEntryParcels" type="{}tDeleteEntryParcels" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AreaInGKN" type="{}nn20" minOccurs="0"/&gt;
 *         &lt;element name="DeltaArea" type="{}nn20" minOccurs="0"/&gt;
 *         &lt;element name="MinArea" type="{}tAreaWithoutInaccuracy" minOccurs="0"/&gt;
 *         &lt;element name="MaxArea" type="{}tAreaWithoutInaccuracy" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelatedParcels" type="{}tRelatedParcels" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CadastralNumber" use="required" type="{}CadastralNumberType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tExistEZParcel", propOrder = {
    "cadastralBlock",
    "objectRealty",
    "area",
    "subParcels",
    "compositionEZ",
    "areaInGKN",
    "deltaArea",
    "minArea",
    "maxArea",
    "note",
    "relatedParcels"
})
public class TExistEZParcel {

    @XmlElement(name = "CadastralBlock", required = true)
    protected String cadastralBlock;
    @XmlElement(name = "ObjectRealty")
    protected TObjectRealty objectRealty;
    @XmlElement(name = "Area", required = true)
    protected TAreaNew area;
    @XmlElement(name = "SubParcels")
    protected TExistEZParcel.SubParcels subParcels;
    @XmlElement(name = "CompositionEZ")
    protected TExistEZParcel.CompositionEZ compositionEZ;
    @XmlElement(name = "AreaInGKN")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger areaInGKN;
    @XmlElement(name = "DeltaArea")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger deltaArea;
    @XmlElement(name = "MinArea")
    protected TAreaWithoutInaccuracy minArea;
    @XmlElement(name = "MaxArea")
    protected TAreaWithoutInaccuracy maxArea;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "RelatedParcels")
    protected TRelatedParcels relatedParcels;
    @XmlAttribute(name = "CadastralNumber", required = true)
    protected String cadastralNumber;

    /**
     * Gets the value of the cadastralBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadastralBlock() {
        return cadastralBlock;
    }

    /**
     * Sets the value of the cadastralBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadastralBlock(String value) {
        this.cadastralBlock = value;
    }

    /**
     * Gets the value of the objectRealty property.
     * 
     * @return
     *     possible object is
     *     {@link TObjectRealty }
     *     
     */
    public TObjectRealty getObjectRealty() {
        return objectRealty;
    }

    /**
     * Sets the value of the objectRealty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TObjectRealty }
     *     
     */
    public void setObjectRealty(TObjectRealty value) {
        this.objectRealty = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link TAreaNew }
     *     
     */
    public TAreaNew getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAreaNew }
     *     
     */
    public void setArea(TAreaNew value) {
        this.area = value;
    }

    /**
     * Gets the value of the subParcels property.
     * 
     * @return
     *     possible object is
     *     {@link TExistEZParcel.SubParcels }
     *     
     */
    public TExistEZParcel.SubParcels getSubParcels() {
        return subParcels;
    }

    /**
     * Sets the value of the subParcels property.
     * 
     * @param value
     *     allowed object is
     *     {@link TExistEZParcel.SubParcels }
     *     
     */
    public void setSubParcels(TExistEZParcel.SubParcels value) {
        this.subParcels = value;
    }

    /**
     * Gets the value of the compositionEZ property.
     * 
     * @return
     *     possible object is
     *     {@link TExistEZParcel.CompositionEZ }
     *     
     */
    public TExistEZParcel.CompositionEZ getCompositionEZ() {
        return compositionEZ;
    }

    /**
     * Sets the value of the compositionEZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link TExistEZParcel.CompositionEZ }
     *     
     */
    public void setCompositionEZ(TExistEZParcel.CompositionEZ value) {
        this.compositionEZ = value;
    }

    /**
     * Gets the value of the areaInGKN property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAreaInGKN() {
        return areaInGKN;
    }

    /**
     * Sets the value of the areaInGKN property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAreaInGKN(BigInteger value) {
        this.areaInGKN = value;
    }

    /**
     * Gets the value of the deltaArea property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeltaArea() {
        return deltaArea;
    }

    /**
     * Sets the value of the deltaArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeltaArea(BigInteger value) {
        this.deltaArea = value;
    }

    /**
     * Gets the value of the minArea property.
     * 
     * @return
     *     possible object is
     *     {@link TAreaWithoutInaccuracy }
     *     
     */
    public TAreaWithoutInaccuracy getMinArea() {
        return minArea;
    }

    /**
     * Sets the value of the minArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAreaWithoutInaccuracy }
     *     
     */
    public void setMinArea(TAreaWithoutInaccuracy value) {
        this.minArea = value;
    }

    /**
     * Gets the value of the maxArea property.
     * 
     * @return
     *     possible object is
     *     {@link TAreaWithoutInaccuracy }
     *     
     */
    public TAreaWithoutInaccuracy getMaxArea() {
        return maxArea;
    }

    /**
     * Sets the value of the maxArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAreaWithoutInaccuracy }
     *     
     */
    public void setMaxArea(TAreaWithoutInaccuracy value) {
        this.maxArea = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the relatedParcels property.
     * 
     * @return
     *     possible object is
     *     {@link TRelatedParcels }
     *     
     */
    public TRelatedParcels getRelatedParcels() {
        return relatedParcels;
    }

    /**
     * Sets the value of the relatedParcels property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRelatedParcels }
     *     
     */
    public void setRelatedParcels(TRelatedParcels value) {
        this.relatedParcels = value;
    }

    /**
     * Gets the value of the cadastralNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadastralNumber() {
        return cadastralNumber;
    }

    /**
     * Sets the value of the cadastralNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadastralNumber(String value) {
        this.cadastralNumber = value;
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
     *         &lt;element name="InsertEntryParcels" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="InsertEntryParcel" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice&gt;
     *                             &lt;element name="ExistEntryParcel" type="{}tCadastralNumberInp"/&gt;
     *                             &lt;element name="NewEntryParcel" type="{}tNewEZEntryParcel"/&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DeleteEntryParcels" type="{}tDeleteEntryParcels" minOccurs="0"/&gt;
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
        "insertEntryParcels",
        "deleteEntryParcels"
    })
    public static class CompositionEZ {

        @XmlElement(name = "InsertEntryParcels")
        protected TExistEZParcel.CompositionEZ.InsertEntryParcels insertEntryParcels;
        @XmlElement(name = "DeleteEntryParcels")
        protected TDeleteEntryParcels deleteEntryParcels;

        /**
         * Gets the value of the insertEntryParcels property.
         * 
         * @return
         *     possible object is
         *     {@link TExistEZParcel.CompositionEZ.InsertEntryParcels }
         *     
         */
        public TExistEZParcel.CompositionEZ.InsertEntryParcels getInsertEntryParcels() {
            return insertEntryParcels;
        }

        /**
         * Sets the value of the insertEntryParcels property.
         * 
         * @param value
         *     allowed object is
         *     {@link TExistEZParcel.CompositionEZ.InsertEntryParcels }
         *     
         */
        public void setInsertEntryParcels(TExistEZParcel.CompositionEZ.InsertEntryParcels value) {
            this.insertEntryParcels = value;
        }

        /**
         * Gets the value of the deleteEntryParcels property.
         * 
         * @return
         *     possible object is
         *     {@link TDeleteEntryParcels }
         *     
         */
        public TDeleteEntryParcels getDeleteEntryParcels() {
            return deleteEntryParcels;
        }

        /**
         * Sets the value of the deleteEntryParcels property.
         * 
         * @param value
         *     allowed object is
         *     {@link TDeleteEntryParcels }
         *     
         */
        public void setDeleteEntryParcels(TDeleteEntryParcels value) {
            this.deleteEntryParcels = value;
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
         *         &lt;element name="InsertEntryParcel" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice&gt;
         *                   &lt;element name="ExistEntryParcel" type="{}tCadastralNumberInp"/&gt;
         *                   &lt;element name="NewEntryParcel" type="{}tNewEZEntryParcel"/&gt;
         *                 &lt;/choice&gt;
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
            "insertEntryParcel"
        })
        public static class InsertEntryParcels {

            @XmlElement(name = "InsertEntryParcel", required = true)
            protected List<TExistEZParcel.CompositionEZ.InsertEntryParcels.InsertEntryParcel> insertEntryParcel;

            /**
             * Gets the value of the insertEntryParcel property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the insertEntryParcel property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInsertEntryParcel().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TExistEZParcel.CompositionEZ.InsertEntryParcels.InsertEntryParcel }
             * 
             * 
             */
            public List<TExistEZParcel.CompositionEZ.InsertEntryParcels.InsertEntryParcel> getInsertEntryParcel() {
                if (insertEntryParcel == null) {
                    insertEntryParcel = new ArrayList<TExistEZParcel.CompositionEZ.InsertEntryParcels.InsertEntryParcel>();
                }
                return this.insertEntryParcel;
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
             *       &lt;choice&gt;
             *         &lt;element name="ExistEntryParcel" type="{}tCadastralNumberInp"/&gt;
             *         &lt;element name="NewEntryParcel" type="{}tNewEZEntryParcel"/&gt;
             *       &lt;/choice&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "existEntryParcel",
                "newEntryParcel"
            })
            public static class InsertEntryParcel {

                @XmlElement(name = "ExistEntryParcel")
                protected TCadastralNumberInp existEntryParcel;
                @XmlElement(name = "NewEntryParcel")
                protected TNewEZEntryParcel newEntryParcel;

                /**
                 * Gets the value of the existEntryParcel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCadastralNumberInp }
                 *     
                 */
                public TCadastralNumberInp getExistEntryParcel() {
                    return existEntryParcel;
                }

                /**
                 * Sets the value of the existEntryParcel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCadastralNumberInp }
                 *     
                 */
                public void setExistEntryParcel(TCadastralNumberInp value) {
                    this.existEntryParcel = value;
                }

                /**
                 * Gets the value of the newEntryParcel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TNewEZEntryParcel }
                 *     
                 */
                public TNewEZEntryParcel getNewEntryParcel() {
                    return newEntryParcel;
                }

                /**
                 * Sets the value of the newEntryParcel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TNewEZEntryParcel }
                 *     
                 */
                public void setNewEntryParcel(TNewEZEntryParcel value) {
                    this.newEntryParcel = value;
                }

            }

        }

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
     *         &lt;element name="NewSubParcel" type="{}tNewSubParcel" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ExistSubParcel" type="{}tExistSubParcel" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="InvariableSubParcel" type="{}tInvariableSubParcel" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "newSubParcel",
        "existSubParcel",
        "invariableSubParcel"
    })
    public static class SubParcels {

        @XmlElement(name = "NewSubParcel")
        protected List<TNewSubParcel> newSubParcel;
        @XmlElement(name = "ExistSubParcel")
        protected List<TExistSubParcel> existSubParcel;
        @XmlElement(name = "InvariableSubParcel")
        protected List<TInvariableSubParcel> invariableSubParcel;

        /**
         * Gets the value of the newSubParcel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the newSubParcel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNewSubParcel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TNewSubParcel }
         * 
         * 
         */
        public List<TNewSubParcel> getNewSubParcel() {
            if (newSubParcel == null) {
                newSubParcel = new ArrayList<TNewSubParcel>();
            }
            return this.newSubParcel;
        }

        /**
         * Gets the value of the existSubParcel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the existSubParcel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExistSubParcel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TExistSubParcel }
         * 
         * 
         */
        public List<TExistSubParcel> getExistSubParcel() {
            if (existSubParcel == null) {
                existSubParcel = new ArrayList<TExistSubParcel>();
            }
            return this.existSubParcel;
        }

        /**
         * Gets the value of the invariableSubParcel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the invariableSubParcel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInvariableSubParcel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TInvariableSubParcel }
         * 
         * 
         */
        public List<TInvariableSubParcel> getInvariableSubParcel() {
            if (invariableSubParcel == null) {
                invariableSubParcel = new ArrayList<TInvariableSubParcel>();
            }
            return this.invariableSubParcel;
        }

    }

}
