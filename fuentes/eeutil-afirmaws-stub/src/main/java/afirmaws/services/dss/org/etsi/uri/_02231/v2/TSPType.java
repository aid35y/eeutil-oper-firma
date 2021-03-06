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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for TSPType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}TSPInformation"/>
 *         &lt;element ref="{http://uri.etsi.org/02231/v2#}TSPServices"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPType", propOrder = {"tspInformation", "tspServices"})
public class TSPType {

  @XmlElement(name = "TSPInformation", required = true)
  protected TSPInformationType tspInformation;
  @XmlElement(name = "TSPServices", required = true)
  protected TSPServicesListType tspServices;

  /**
   * Gets the value of the tspInformation property.
   * 
   * @return possible object is {@link TSPInformationType }
   * 
   */
  public TSPInformationType getTSPInformation() {
    return tspInformation;
  }

  /**
   * Sets the value of the tspInformation property.
   * 
   * @param value allowed object is {@link TSPInformationType }
   * 
   */
  public void setTSPInformation(TSPInformationType value) {
    this.tspInformation = value;
  }

  /**
   * Gets the value of the tspServices property.
   * 
   * @return possible object is {@link TSPServicesListType }
   * 
   */
  public TSPServicesListType getTSPServices() {
    return tspServices;
  }

  /**
   * Sets the value of the tspServices property.
   * 
   * @param value allowed object is {@link TSPServicesListType }
   * 
   */
  public void setTSPServices(TSPServicesListType value) {
    this.tspServices = value;
  }

}
