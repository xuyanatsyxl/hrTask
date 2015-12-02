/**
 * AdcShiftSchedulingServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.infotechdept.hr.kq.rpc.webservice.server;

public class AdcShiftSchedulingServiceImplServiceLocator extends org.apache.axis.client.Service implements org.infotechdept.hr.kq.rpc.webservice.server.AdcShiftSchedulingServiceImplService {

    public AdcShiftSchedulingServiceImplServiceLocator() {
    }


    public AdcShiftSchedulingServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AdcShiftSchedulingServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AdcShiftSchedulingServiceImplPort
    private java.lang.String AdcShiftSchedulingServiceImplPort_address = "http://61.161.160.23:9092/hr/rpc/webservice/adcShiftSchedulingService";

    public java.lang.String getAdcShiftSchedulingServiceImplPortAddress() {
        return AdcShiftSchedulingServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AdcShiftSchedulingServiceImplPortWSDDServiceName = "AdcShiftSchedulingServiceImplPort";

    public java.lang.String getAdcShiftSchedulingServiceImplPortWSDDServiceName() {
        return AdcShiftSchedulingServiceImplPortWSDDServiceName;
    }

    public void setAdcShiftSchedulingServiceImplPortWSDDServiceName(java.lang.String name) {
        AdcShiftSchedulingServiceImplPortWSDDServiceName = name;
    }

    public org.infotechdept.hr.kq.rpc.webservice.AdcShiftSchedulingService getAdcShiftSchedulingServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AdcShiftSchedulingServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAdcShiftSchedulingServiceImplPort(endpoint);
    }

    public org.infotechdept.hr.kq.rpc.webservice.AdcShiftSchedulingService getAdcShiftSchedulingServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.infotechdept.hr.kq.rpc.webservice.server.AdcShiftSchedulingServiceImplServiceSoapBindingStub _stub = new org.infotechdept.hr.kq.rpc.webservice.server.AdcShiftSchedulingServiceImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAdcShiftSchedulingServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdcShiftSchedulingServiceImplPortEndpointAddress(java.lang.String address) {
        AdcShiftSchedulingServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.infotechdept.hr.kq.rpc.webservice.AdcShiftSchedulingService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.infotechdept.hr.kq.rpc.webservice.server.AdcShiftSchedulingServiceImplServiceSoapBindingStub _stub = new org.infotechdept.hr.kq.rpc.webservice.server.AdcShiftSchedulingServiceImplServiceSoapBindingStub(new java.net.URL(AdcShiftSchedulingServiceImplPort_address), this);
                _stub.setPortName(getAdcShiftSchedulingServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AdcShiftSchedulingServiceImplPort".equals(inputPortName)) {
            return getAdcShiftSchedulingServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server.webservice.rpc.kq.hr.infotechdept.org/", "AdcShiftSchedulingServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server.webservice.rpc.kq.hr.infotechdept.org/", "AdcShiftSchedulingServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AdcShiftSchedulingServiceImplPort".equals(portName)) {
            setAdcShiftSchedulingServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
