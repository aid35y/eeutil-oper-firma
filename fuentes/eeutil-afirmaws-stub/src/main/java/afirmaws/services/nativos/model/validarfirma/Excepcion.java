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


package afirmaws.services.nativos.model.validarfirma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for Excepcion complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Excepcion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="excepcionAsociada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Excepcion", propOrder = {"codigoError", "descripcion", "excepcionAsociada"})
public class Excepcion {

  @XmlElement(required = true)
  protected String codigoError;
  @XmlElement(required = true)
  protected String descripcion;
  protected String excepcionAsociada;

  /**
   * Gets the value of the codigoError property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodigoError() {
    return codigoError;
  }

  /**
   * Sets the value of the codigoError property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodigoError(String value) {
    this.codigoError = value;
  }

  /**
   * Gets the value of the descripcion property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDescripcion() {
    return descripcion;
  }

  /**
   * Sets the value of the descripcion property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setDescripcion(String value) {
    this.descripcion = value;
  }

  /**
   * Gets the value of the excepcionAsociada property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getExcepcionAsociada() {
    return excepcionAsociada;
  }

  /**
   * Sets the value of the excepcionAsociada property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setExcepcionAsociada(String value) {
    this.excepcionAsociada = value;
  }

}
