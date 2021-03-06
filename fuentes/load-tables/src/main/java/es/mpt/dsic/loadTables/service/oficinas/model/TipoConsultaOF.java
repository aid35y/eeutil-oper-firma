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


package es.mpt.dsic.loadTables.service.oficinas.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Clase Java para tipoConsultaOF.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="tipoConsultaOF">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPLETO"/>
 *     &lt;enumeration value="OFICINAS"/>
 *     &lt;enumeration value="HISTORICOS"/>
 *     &lt;enumeration value="RELACIONES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoConsultaOF")
@XmlEnum
public enum TipoConsultaOF {

  COMPLETO, OFICINAS, HISTORICOS, RELACIONES;

  public String value() {
    return name();
  }

  public static TipoConsultaOF fromValue(String v) {
    return valueOf(v);
  }

}
