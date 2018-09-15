
package generated.biller.experts.api.wsdl.inquiry;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "InquiryRequestService", targetNamespace = "http://www.experts-inquiry.com/inquiry", wsdlLocation = "http://192.168.10.91:3070/ws/InquiryRequest.wsdl?wsdl")
public class InquiryRequestService
    extends Service
{

    private final static URL INQUIRYREQUESTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(InquiryRequestService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = InquiryRequestService.class.getResource(".");
            url = new URL(baseUrl, "http://192.168.10.91:3070/ws/InquiryRequest.wsdl?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://192.168.10.91:3070/ws/InquiryRequest.wsdl?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        INQUIRYREQUESTSERVICE_WSDL_LOCATION = url;
    }

    public InquiryRequestService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InquiryRequestService() {
        super(INQUIRYREQUESTSERVICE_WSDL_LOCATION, new QName("http://www.experts-inquiry.com/inquiry", "InquiryRequestService"));
    }

    /**
     * 
     * @return
     *     returns InquiryRequest
     */
    @WebEndpoint(name = "InquiryRequestSoap11")
    public InquiryRequest getInquiryRequestSoap11() {
        return super.getPort(new QName("http://www.experts-inquiry.com/inquiry", "InquiryRequestSoap11"), InquiryRequest.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InquiryRequest
     */
    @WebEndpoint(name = "InquiryRequestSoap11")
    public InquiryRequest getInquiryRequestSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.experts-inquiry.com/inquiry", "InquiryRequestSoap11"), InquiryRequest.class, features);
    }

}