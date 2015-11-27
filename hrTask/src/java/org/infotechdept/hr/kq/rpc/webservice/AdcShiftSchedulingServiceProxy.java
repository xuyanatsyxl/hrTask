package org.infotechdept.hr.kq.rpc.webservice;

public class AdcShiftSchedulingServiceProxy implements org.infotechdept.hr.kq.rpc.webservice.AdcShiftSchedulingService {
  private String _endpoint = null;
  private org.infotechdept.hr.kq.rpc.webservice.AdcShiftSchedulingService adcShiftSchedulingService = null;
  
  public AdcShiftSchedulingServiceProxy() {
    _initAdcShiftSchedulingServiceProxy();
  }
  
  public AdcShiftSchedulingServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdcShiftSchedulingServiceProxy();
  }
  
  private void _initAdcShiftSchedulingServiceProxy() {
    try {
      adcShiftSchedulingService = (new org.infotechdept.hr.kq.rpc.webservice.server.AdcShiftSchedulingServiceImplServiceLocator()).getAdcShiftSchedulingServiceImplPort();
      if (adcShiftSchedulingService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)adcShiftSchedulingService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)adcShiftSchedulingService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (adcShiftSchedulingService != null)
      ((javax.xml.rpc.Stub)adcShiftSchedulingService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.infotechdept.hr.kq.rpc.webservice.AdcShiftSchedulingService getAdcShiftSchedulingService() {
    if (adcShiftSchedulingService == null)
      _initAdcShiftSchedulingServiceProxy();
    return adcShiftSchedulingService;
  }
  
  public java.lang.String makeAdcShiftSchedulingDay(java.lang.String arg0) throws java.rmi.RemoteException{
    if (adcShiftSchedulingService == null)
      _initAdcShiftSchedulingServiceProxy();
    return adcShiftSchedulingService.makeAdcShiftSchedulingDay(arg0);
  }
  
  
}