//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.11 at 08:13:08 PM WET 
//

package pt.com.broker.performance.conf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Param complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Param">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="param-name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="param-value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Param")
public class Param
{

	@XmlAttribute(name = "param-name", required = true)
	protected String paramName;
	@XmlAttribute(name = "param-value", required = true)
	protected String paramValue;

	/**
	 * Gets the value of the paramName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParamName()
	{
		return paramName;
	}

	/**
	 * Sets the value of the paramName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParamName(String value)
	{
		this.paramName = value;
	}

	/**
	 * Gets the value of the paramValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParamValue()
	{
		return paramValue;
	}

	/**
	 * Sets the value of the paramValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParamValue(String value)
	{
		this.paramValue = value;
	}

}
