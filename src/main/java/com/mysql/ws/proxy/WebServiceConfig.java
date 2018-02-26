package com.mysql.ws.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.mysql.ws.config.ApplicationProperties;

@Configuration
public class WebServiceConfig {

	private ApplicationProperties properties;
	
	
	public WebServiceConfig(ApplicationProperties properties) {
		this.properties = properties;
	}

	private final Logger log = LoggerFactory.getLogger(WebServiceConfig.class);
	
	public Jaxb2Marshaller jaxb2Marshaller(){
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath(properties.getUrlPackage());
		return marshaller;
	}
	
	@Bean(name="message")
	public WebServiceTemplate serviceTemplateSeriva(){
		
		log.info("Consumer client Seriva {}"+ "http://localhost:7005/ws");
		WebServiceTemplate serviceTemplate = new WebServiceTemplate();
		serviceTemplate.setMarshaller(jaxb2Marshaller());
		serviceTemplate.setUnmarshaller(jaxb2Marshaller());
		serviceTemplate.setDefaultUri(properties.getEndpoint());
		return serviceTemplate;
	}
	

}
