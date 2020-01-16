package com.jtao.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloServer", targetNamespace = "http://server.jtao.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloServer {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "execute", targetNamespace = "http://server.jtao.com/", className = "com.jtao.server.Execute")
    @ResponseWrapper(localName = "executeResponse", targetNamespace = "http://server.jtao.com/", className = "com.jtao.server.ExecuteResponse")
    @Action(input = "http://server.jtao.com/HelloServer/executeRequest", output = "http://server.jtao.com/HelloServer/executeResponse")
    public String execute(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
