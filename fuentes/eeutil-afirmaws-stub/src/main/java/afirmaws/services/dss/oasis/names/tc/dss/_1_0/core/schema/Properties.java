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
 *       &lt;sequence>
 *         &lt;element name="SignedProperties" type="{urn:oasis:names:tc:dss:1.0:core:schema}PropertiesType" minOccurs="0"/>
 *         &lt;element name="UnsignedProperties" type="{urn:oasis:names:tc:dss:1.0:core:schema}PropertiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"signedProperties", "unsignedProperties"})
@XmlRootElement(name = "Properties")
public class Properties {

  @XmlElement(name = "SignedProperties")
  protected PropertiesType signedProperties;
  @XmlElement(name = "UnsignedProperties")
  protected PropertiesType unsignedProperties;

  /**
   * Gets the value of the signedProperties property.
   * 
   * @return possible object is {@link PropertiesType }
   * 
   */
  public PropertiesType getSignedProperties() {
    return signedProperties;
  }

  /**
   * Sets the value of the signedProperties property.
   * 
   * @param value allowed object is {@link PropertiesType }
   * 
   */
  public void setSignedProperties(PropertiesType value) {
    this.signedProperties = value;
  }

  /**
   * Gets the value of the unsignedProperties property.
   * 
   * @return possible object is {@link PropertiesType }
   * 
   */
  public PropertiesType getUnsignedProperties() {
    return unsignedProperties;
  }

  /**
   * Sets the value of the unsignedProperties property.
   * 
   * @param value allowed object is {@link PropertiesType }
   * 
   */
  public void setUnsignedProperties(PropertiesType value) {
    this.unsignedProperties = value;
  }

}
