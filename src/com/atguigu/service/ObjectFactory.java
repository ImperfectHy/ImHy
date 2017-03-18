
package com.atguigu.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.atguigu.service package. 
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

    private final static QName _CheckAreaByPhoneNum_QNAME = new QName("http://service.atguigu.com/", "checkAreaByPhoneNum");
    private final static QName _CheckAreaByPhoneNumResponse_QNAME = new QName("http://service.atguigu.com/", "checkAreaByPhoneNumResponse");
    private final static QName _CheckTypeByPhoneNum_QNAME = new QName("http://service.atguigu.com/", "checkTypeByPhoneNum");
    private final static QName _CheckTypeByPhoneNumResponse_QNAME = new QName("http://service.atguigu.com/", "checkTypeByPhoneNumResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.atguigu.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckAreaByPhoneNum }
     * 
     */
    public CheckAreaByPhoneNum createCheckAreaByPhoneNum() {
        return new CheckAreaByPhoneNum();
    }

    /**
     * Create an instance of {@link CheckAreaByPhoneNumResponse }
     * 
     */
    public CheckAreaByPhoneNumResponse createCheckAreaByPhoneNumResponse() {
        return new CheckAreaByPhoneNumResponse();
    }

    /**
     * Create an instance of {@link CheckTypeByPhoneNum }
     * 
     */
    public CheckTypeByPhoneNum createCheckTypeByPhoneNum() {
        return new CheckTypeByPhoneNum();
    }

    /**
     * Create an instance of {@link CheckTypeByPhoneNumResponse }
     * 
     */
    public CheckTypeByPhoneNumResponse createCheckTypeByPhoneNumResponse() {
        return new CheckTypeByPhoneNumResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAreaByPhoneNum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.atguigu.com/", name = "checkAreaByPhoneNum")
    public JAXBElement<CheckAreaByPhoneNum> createCheckAreaByPhoneNum(CheckAreaByPhoneNum value) {
        return new JAXBElement<CheckAreaByPhoneNum>(_CheckAreaByPhoneNum_QNAME, CheckAreaByPhoneNum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAreaByPhoneNumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.atguigu.com/", name = "checkAreaByPhoneNumResponse")
    public JAXBElement<CheckAreaByPhoneNumResponse> createCheckAreaByPhoneNumResponse(CheckAreaByPhoneNumResponse value) {
        return new JAXBElement<CheckAreaByPhoneNumResponse>(_CheckAreaByPhoneNumResponse_QNAME, CheckAreaByPhoneNumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckTypeByPhoneNum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.atguigu.com/", name = "checkTypeByPhoneNum")
    public JAXBElement<CheckTypeByPhoneNum> createCheckTypeByPhoneNum(CheckTypeByPhoneNum value) {
        return new JAXBElement<CheckTypeByPhoneNum>(_CheckTypeByPhoneNum_QNAME, CheckTypeByPhoneNum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckTypeByPhoneNumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.atguigu.com/", name = "checkTypeByPhoneNumResponse")
    public JAXBElement<CheckTypeByPhoneNumResponse> createCheckTypeByPhoneNumResponse(CheckTypeByPhoneNumResponse value) {
        return new JAXBElement<CheckTypeByPhoneNumResponse>(_CheckTypeByPhoneNumResponse_QNAME, CheckTypeByPhoneNumResponse.class, null, value);
    }

}
