
package cz.czechpoint.isds.v20;

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
@WebServiceClient(name = "dmOperationsWebService", targetNamespace = "http://isds.czechpoint.cz/v20", wsdlLocation = "https://www.czebox.cz/static/wsdl/v20/dm_operations.wsdl")
public class DmOperationsWebService
    extends Service
{

    private final static URL DMOPERATIONSWEBSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(cz.czechpoint.isds.v20.DmOperationsWebService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = cz.czechpoint.isds.v20.DmOperationsWebService.class.getResource(".");
            url = new URL(baseUrl, "https://www.czebox.cz/static/wsdl/v20/dm_operations.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'https://www.czebox.cz/static/wsdl/v20/dm_operations.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        DMOPERATIONSWEBSERVICE_WSDL_LOCATION = url;
    }

    public DmOperationsWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DmOperationsWebService() {
        super(DMOPERATIONSWEBSERVICE_WSDL_LOCATION, new QName("http://isds.czechpoint.cz/v20", "dmOperationsWebService"));
    }

    /**
     * 
     * @return
     *     returns DmOperationsPortType
     */
    @WebEndpoint(name = "dmOperationsPortType")
    public DmOperationsPortType getDmOperationsPortType() {
        return super.getPort(new QName("http://isds.czechpoint.cz/v20", "dmOperationsPortType"), DmOperationsPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DmOperationsPortType
     */
    @WebEndpoint(name = "dmOperationsPortType")
    public DmOperationsPortType getDmOperationsPortType(WebServiceFeature... features) {
        return super.getPort(new QName("http://isds.czechpoint.cz/v20", "dmOperationsPortType"), DmOperationsPortType.class, features);
    }

}
