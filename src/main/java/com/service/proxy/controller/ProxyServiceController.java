package com.service.proxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.proxy.config.DataCofig;
import com.service.proxy.service.ProxyService;

@RestController
public class ProxyServiceController {
	
	@Autowired
	private ProxyService proxyService;
	
	@RequestMapping("/route")
	public String routeService(@RequestHeader(value="service") String service) {
		return proxyService.isServicePresent(service)?"Service  available":"Not available";
	}
	
	@RequestMapping("/getdata")
	public DataCofig getService(@RequestHeader(value="service") String service) {
		return proxyService.isServicePresent(service)?proxyService.getServiceData(service):proxyService.getServiceNotFound();
	}

}
