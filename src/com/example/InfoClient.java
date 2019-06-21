package com.example;

import com.example.service.Greeting;
import com.example.service.InfoService;
import com.example.service.InfoServiceImplService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

import java.util.HashMap;
import java.util.Map;

public class InfoClient {
    public static void main(String[] args) {
        InfoServiceImplService service = new InfoServiceImplService();
        InfoService port = service.getInfoServiceImplPort();

        Client client = ClientProxy.getClient(port);
        Endpoint endpoint = client.getEndpoint();

        Map props = new HashMap();
        props.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
        props.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
        props.put(WSHandlerConstants.PW_CALLBACK_CLASS, UTPasswordCallback.class.getName());
        props.put(WSHandlerConstants.USER, "arash");

        WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(props);
        endpoint.getOutInterceptors().add(wssOut);

        Greeting greeting = port.sayHowAreYou("Arash Farahani");
        System.out.println(greeting.getMessage());
    }
}
