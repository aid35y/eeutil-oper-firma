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

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Document"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WhichReference" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"document"})
@XmlRootElement(name = "TransformedDocument")
public class TransformedDocument {

  @XmlElement(name = "Document", required = true)
  protected DocumentType document;
  @XmlAttribute(name = "WhichReference", required = true)
  protected BigInteger whichReference;

  /**
   * Gets the value of the document property.
   * 
   * @return possible object is {@link DocumentType }
   * 
   */
  public DocumentType getDocument() {
    return document;
  }

  /**
   * Sets the value of the document property.
   * 
   * @param value allowed object is {@link DocumentType }
   * 
   */
  public void setDocument(DocumentType value) {
    this.document = value;
  }

  /**
   * Gets the value of the whichReference property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getWhichReference() {
    return whichReference;
  }

  /**
   * Sets the value of the whichReference property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setWhichReference(BigInteger value) {
    this.whichReference = value;
  }

}
