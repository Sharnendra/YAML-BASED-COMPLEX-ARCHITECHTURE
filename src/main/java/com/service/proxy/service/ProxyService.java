package com.service.proxy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.proxy.config.DataCofig;
import com.service.proxy.config.MultiService;

@Service
public class ProxyService {
	
	@Autowired
	private MultiService multiService;
	
	public Boolean isServicePresent(String seviceName){
		long i=multiService.getData().stream().filter(t->t.getServicename().contains(seviceName)).count();
		return i==0?false:true;
	}
	
	public DataCofig getServiceData(String seviceName){
		DataCofig dataCofigLocal=new DataCofig();
		multiService.getData()
		.stream()
		.filter(t->t.getServicename().contains(seviceName))
		.forEach(t->{
				dataCofigLocal.setHost(t.getHost());
				dataCofigLocal.setServicename(t.getServicename());
				dataCofigLocal.setJson(t.getJson());	
		});
		
		return dataCofigLocal;
	}
	
	public DataCofig getServiceNotFound()
	{
		DataCofig dataCofigLocal=new DataCofig();
		dataCofigLocal.setMessage("Service Not Found");
		return dataCofigLocal;
	}

}
