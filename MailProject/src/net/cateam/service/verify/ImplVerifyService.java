
package net.cateam.service.verify;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ImplVerifyService", targetNamespace = "http://webservice/", wsdlLocation = "http://192.168.101.100:9898/verify?wsdl")
public class ImplVerifyService
    extends Service
{

    private final static URL IMPLVERIFYSERVICE_WSDL_LOCATION;
    private final static WebServiceException IMPLVERIFYSERVICE_EXCEPTION;
    private final static QName IMPLVERIFYSERVICE_QNAME = new QName("http://webservice/", "ImplVerifyService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.101.100:9898/verify?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IMPLVERIFYSERVICE_WSDL_LOCATION = url;
        IMPLVERIFYSERVICE_EXCEPTION = e;
    }

    public ImplVerifyService() {
        super(__getWsdlLocation(), IMPLVERIFYSERVICE_QNAME);
    }

    public ImplVerifyService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IMPLVERIFYSERVICE_QNAME, features);
    }

    public ImplVerifyService(URL wsdlLocation) {
        super(wsdlLocation, IMPLVERIFYSERVICE_QNAME);
    }

    public ImplVerifyService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IMPLVERIFYSERVICE_QNAME, features);
    }

    public ImplVerifyService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImplVerifyService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ImplVerify
     */
    @WebEndpoint(name = "ImplVerifyPort")
    public ImplVerify getImplVerifyPort() {
        return super.getPort(new QName("http://webservice/", "ImplVerifyPort"), ImplVerify.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImplVerify
     */
    @WebEndpoint(name = "ImplVerifyPort")
    public ImplVerify getImplVerifyPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice/", "ImplVerifyPort"), ImplVerify.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IMPLVERIFYSERVICE_EXCEPTION!= null) {
            throw IMPLVERIFYSERVICE_EXCEPTION;
        }
        return IMPLVERIFYSERVICE_WSDL_LOCATION;
    }

}
