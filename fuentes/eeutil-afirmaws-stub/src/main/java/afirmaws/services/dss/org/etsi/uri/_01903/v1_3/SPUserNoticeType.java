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


package afirmaws.services.dss.org.etsi.uri._01903.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for SPUserNoticeType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPUserNoticeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoticeRef" type="{http://uri.etsi.org/01903/v1.3.2#}NoticeReferenceType" minOccurs="0"/>
 *         &lt;element name="ExplicitText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPUserNoticeType", propOrder = {"noticeRef", "explicitText"})
public class SPUserNoticeType {

  @XmlElement(name = "NoticeRef")
  protected NoticeReferenceType noticeRef;
  @XmlElement(name = "ExplicitText")
  protected String explicitText;

  /**
   * Gets the value of the noticeRef property.
   * 
   * @return possible object is {@link NoticeReferenceType }
   * 
   */
  public NoticeReferenceType getNoticeRef() {
    return noticeRef;
  }

  /**
   * Sets the value of the noticeRef property.
   * 
   * @param value allowed object is {@link NoticeReferenceType }
   * 
   */
  public void setNoticeRef(NoticeReferenceType value) {
    this.noticeRef = value;
  }

  /**
   * Gets the value of the explicitText property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getExplicitText() {
    return explicitText;
  }

  /**
   * Sets the value of the explicitText property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setExplicitText(String value) {
    this.explicitText = value;
  }

}
