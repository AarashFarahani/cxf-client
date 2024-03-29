
package com.example.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayHowAreYouResponse_QNAME = new QName("http://service.example.com/", "sayHowAreYouResponse");
    private final static QName _SayHowAreYou_QNAME = new QName("http://service.example.com/", "sayHowAreYou");
    private final static QName _Greeting_QNAME = new QName("http://service.example.com/", "Greeting");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Greeting }
     * 
     */
    public Greeting createGreeting() {
        return new Greeting();
    }

    /**
     * Create an instance of {@link SayHowAreYou }
     * 
     */
    public SayHowAreYou createSayHowAreYou() {
        return new SayHowAreYou();
    }

    /**
     * Create an instance of {@link SayHowAreYouResponse }
     * 
     */
    public SayHowAreYouResponse createSayHowAreYouResponse() {
        return new SayHowAreYouResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHowAreYouResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "sayHowAreYouResponse")
    public JAXBElement<SayHowAreYouResponse> createSayHowAreYouResponse(SayHowAreYouResponse value) {
        return new JAXBElement<SayHowAreYouResponse>(_SayHowAreYouResponse_QNAME, SayHowAreYouResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHowAreYou }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "sayHowAreYou")
    public JAXBElement<SayHowAreYou> createSayHowAreYou(SayHowAreYou value) {
        return new JAXBElement<SayHowAreYou>(_SayHowAreYou_QNAME, SayHowAreYou.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Greeting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "Greeting")
    public JAXBElement<Greeting> createGreeting(Greeting value) {
        return new JAXBElement<Greeting>(_Greeting_QNAME, Greeting.class, null, value);
    }

}
