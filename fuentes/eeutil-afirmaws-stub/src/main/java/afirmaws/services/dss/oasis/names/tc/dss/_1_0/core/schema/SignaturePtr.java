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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;attribute name="WhichDocument" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="XPath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SignaturePtr")
public class SignaturePtr {

  @XmlAttribute(name = "WhichDocument")
  @XmlIDREF
  @XmlSchemaType(name = "IDREF")
  protected Object whichDocument;
  @XmlAttribute(name = "XPath")
  protected String xPath;

  /**
   * Gets the value of the whichDocument property.
   * 
   * @return possible object is {@link Object }
   * 
   */
  public Object getWhichDocument() {
    return whichDocument;
  }

  /**
   * Sets the value of the whichDocument property.
   * 
   * @param value allowed object is {@link Object }
   * 
   */
  public void setWhichDocument(Object value) {
    this.whichDocument = value;
  }

  /**
   * Gets the value of the xPath property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getXPath() {
    return xPath;
  }

  /**
   * Sets the value of the xPath property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setXPath(String value) {
    this.xPath = value;
  }

}
