package generated.prepaidvalidation.cxf.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-08-16T17:54:20.642+03:00
 * Generated source version: 3.2.5
 *
 */
@WebServiceClient(name = "PrepaidValidation",
                  wsdlLocation = "http://40.113.2.64:6018/PrepaidValidation.svc?wsdl",
                  targetNamespace = "http://tempuri.org/")
public class PrepaidValidation extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "PrepaidValidation");
    public final static QName WSHttpBindingIPrepaidValidation = new QName("http://tempuri.org/", "WSHttpBinding_IPrepaidValidation");
    public final static QName WSHttpBindingIPrepaidValidation1 = new QName("http://tempuri.org/", "WSHttpBinding_IPrepaidValidation1");
    public final static QName BasicHttpBindingIPrepaidValidation1 = new QName("http://tempuri.org/", "BasicHttpBinding_IPrepaidValidation1");
    public final static QName BasicHttpBindingIPrepaidValidation = new QName("http://tempuri.org/", "BasicHttpBinding_IPrepaidValidation");
    static {
        URL url = null;
        try {
            url = new URL("http://40.113.2.64:6018/PrepaidValidation.svc?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PrepaidValidation.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://40.113.2.64:6018/PrepaidValidation.svc?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PrepaidValidation(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PrepaidValidation(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PrepaidValidation() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PrepaidValidation(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PrepaidValidation(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PrepaidValidation(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IPrepaidValidation
     */
    @WebEndpoint(name = "WSHttpBinding_IPrepaidValidation")
    public IPrepaidValidation getWSHttpBindingIPrepaidValidation() {
        return super.getPort(WSHttpBindingIPrepaidValidation, IPrepaidValidation.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPrepaidValidation
     */
    @WebEndpoint(name = "WSHttpBinding_IPrepaidValidation")
    public IPrepaidValidation getWSHttpBindingIPrepaidValidation(WebServiceFeature... features) {
        return super.getPort(WSHttpBindingIPrepaidValidation, IPrepaidValidation.class, features);
    }


    /**
     *
     * @return
     *     returns IPrepaidValidation
     */
    @WebEndpoint(name = "WSHttpBinding_IPrepaidValidation1")
    public IPrepaidValidation getWSHttpBindingIPrepaidValidation1() {
        return super.getPort(WSHttpBindingIPrepaidValidation1, IPrepaidValidation.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPrepaidValidation
     */
    @WebEndpoint(name = "WSHttpBinding_IPrepaidValidation1")
    public IPrepaidValidation getWSHttpBindingIPrepaidValidation1(WebServiceFeature... features) {
        return super.getPort(WSHttpBindingIPrepaidValidation1, IPrepaidValidation.class, features);
    }


    /**
     *
     * @return
     *     returns IPrepaidValidation
     */
    @WebEndpoint(name = "BasicHttpBinding_IPrepaidValidation1")
    public IPrepaidValidation getBasicHttpBindingIPrepaidValidation1() {
        return super.getPort(BasicHttpBindingIPrepaidValidation1, IPrepaidValidation.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPrepaidValidation
     */
    @WebEndpoint(name = "BasicHttpBinding_IPrepaidValidation1")
    public IPrepaidValidation getBasicHttpBindingIPrepaidValidation1(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIPrepaidValidation1, IPrepaidValidation.class, features);
    }


    /**
     *
     * @return
     *     returns IPrepaidValidation
     */
    @WebEndpoint(name = "BasicHttpBinding_IPrepaidValidation")
    public IPrepaidValidation getBasicHttpBindingIPrepaidValidation() {
        return super.getPort(BasicHttpBindingIPrepaidValidation, IPrepaidValidation.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPrepaidValidation
     */
    @WebEndpoint(name = "BasicHttpBinding_IPrepaidValidation")
    public IPrepaidValidation getBasicHttpBindingIPrepaidValidation(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIPrepaidValidation, IPrepaidValidation.class, features);
    }

}
