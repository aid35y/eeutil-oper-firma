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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import afirmaws.services.dss.org.w3._2000._09.xmldsig.KeyInfoType;



/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}KeyInfo"/>
 *         &lt;element name="Other" type="{urn:oasis:names:tc:dss:1.0:core:schema}AnyType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"keyInfo", "other"})
@XmlRootElement(name = "KeySelector")
public class KeySelector {

  @XmlElement(name = "KeyInfo", namespace = "http://www.w3.org/2000/09/xmldsig#")
  protected KeyInfoType keyInfo;
  @XmlElement(name = "Other")
  protected AnyType other;

  /**
   * Gets the value of the keyInfo property.
   * 
   * @return possible object is {@link KeyInfoType }
   * 
   */
  public KeyInfoType getKeyInfo() {
    return keyInfo;
  }

  /**
   * Sets the value of the keyInfo property.
   * 
   * @param value allowed object is {@link KeyInfoType }
   * 
   */
  public void setKeyInfo(KeyInfoType value) {
    this.keyInfo = value;
  }

  /**
   * Gets the value of the other property.
   * 
   * @return possible object is {@link AnyType }
   * 
   */
  public AnyType getOther() {
    return other;
  }

  /**
   * Sets the value of the other property.
   * 
   * @param value allowed object is {@link AnyType }
   * 
   */
  public void setOther(AnyType value) {
    this.other = value;
  }

}
