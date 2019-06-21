
package com.example.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sayHowAreYouResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sayHowAreYouResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Greeting" type="{http://service.example.com/}greeting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHowAreYouResponse", propOrder = {
    "greeting"
})
public class SayHowAreYouResponse {

    @XmlElement(name = "Greeting")
    protected Greeting greeting;

    /**
     * Gets the value of the greeting property.
     * 
     * @return
     *     possible object is
     *     {@link Greeting }
     *     
     */
    public Greeting getGreeting() {
        return greeting;
    }

    /**
     * Sets the value of the greeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Greeting }
     *     
     */
    public void setGreeting(Greeting value) {
        this.greeting = value;
    }

}
