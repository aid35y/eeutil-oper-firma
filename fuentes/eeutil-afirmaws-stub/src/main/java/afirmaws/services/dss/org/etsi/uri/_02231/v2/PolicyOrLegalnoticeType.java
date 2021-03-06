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


package afirmaws.services.dss.org.etsi.uri._02231.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for PolicyOrLegalnoticeType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyOrLegalnoticeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="TSLPolicy" type="{http://uri.etsi.org/02231/v2#}NonEmptyMultiLangURIType" maxOccurs="unbounded"/>
 *         &lt;element name="TSLLegalNotice" type="{http://uri.etsi.org/02231/v2#}MultiLangStringType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyOrLegalnoticeType", propOrder = {"tslPolicy", "tslLegalNotice"})
public class PolicyOrLegalnoticeType {

  @XmlElement(name = "TSLPolicy")
  protected List<NonEmptyMultiLangURIType> tslPolicy;
  @XmlElement(name = "TSLLegalNotice")
  protected List<MultiLangStringType> tslLegalNotice;

  /**
   * Gets the value of the tslPolicy property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the tslPolicy property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getTSLPolicy().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link NonEmptyMultiLangURIType }
   * 
   * 
   */
  public List<NonEmptyMultiLangURIType> getTSLPolicy() {
    if (tslPolicy == null) {
      tslPolicy = new ArrayList<NonEmptyMultiLangURIType>();
    }
    return this.tslPolicy;
  }

  /**
   * Gets the value of the tslLegalNotice property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the tslLegalNotice property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getTSLLegalNotice().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link MultiLangStringType }
   * 
   * 
   */
  public List<MultiLangStringType> getTSLLegalNotice() {
    if (tslLegalNotice == null) {
      tslLegalNotice = new ArrayList<MultiLangStringType>();
    }
    return this.tslLegalNotice;
  }

}
