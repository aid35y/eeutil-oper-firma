/*
 * Copyright (C) 2012-13 MINHAP, Gobierno de España This program is licensed and may be used,
 * modified and redistributed under the terms of the European Public License (EUPL), either version
 * 1.1 or (at your option) any later version as soon as they are approved by the European
 * Commission. Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * more details. You should have received a copy of the EUPL1.1 license along with this program; if
 * not, you may find it at http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 */


package afirmaws.services.dss.oasis.names.tc.dss._1_0.core.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import afirmaws.services.dss.org.w3._2000._09.xmldsig.DigestMethodType;


/**
 * <p>
 * Java class for AttachmentReferenceType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}DigestMethod"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}DigestValue"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AttRefURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentReferenceType", propOrder = {"digestMethod", "digestValue"})
public class AttachmentReferenceType {

  @XmlElement(name = "DigestMethod", namespace = "http://www.w3.org/2000/09/xmldsig#")
  protected DigestMethodType digestMethod;
  @XmlElement(name = "DigestValue", namespace = "http://www.w3.org/2000/09/xmldsig#")
  protected byte[] digestValue;
  @XmlAttribute(name = "AttRefURI")
  @XmlSchemaType(name = "anyURI")
  protected String attRefURI;
  @XmlAttribute(name = "MimeType")
  protected String mimeType;

  /**
   * Gets the value of the digestMethod property.
   * 
   * @return possible object is {@link DigestMethodType }
   * 
   */
  public DigestMethodType getDigestMethod() {
    return digestMethod;
  }

  /**
   * Sets the value of the digestMethod property.
   * 
   * @param value allowed object is {@link DigestMethodType }
   * 
   */
  public void setDigestMethod(DigestMethodType value) {
    this.digestMethod = value;
  }

  /**
   * Gets the value of the digestValue property.
   * 
   * @return possible object is byte[]
   */
  public byte[] getDigestValue() {
    return digestValue;
  }

  /**
   * Sets the value of the digestValue property.
   * 
   * @param value allowed object is byte[]
   */
  public void setDigestValue(byte[] value) {
    this.digestValue = ((byte[]) value);
  }

  /**
   * Gets the value of the attRefURI property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getAttRefURI() {
    return attRefURI;
  }

  /**
   * Sets the value of the attRefURI property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setAttRefURI(String value) {
    this.attRefURI = value;
  }

  /**
   * Gets the value of the mimeType property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMimeType() {
    return mimeType;
  }

  /**
   * Sets the value of the mimeType property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMimeType(String value) {
    this.mimeType = value;
  }

}
