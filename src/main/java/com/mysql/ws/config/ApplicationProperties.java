package com.mysql.ws.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties
@Configuration
@Getter
@Setter
public class ApplicationProperties {
	
	@Value("${application.ws.endpoint:http://localhost:8888/ws}")
	private String endpoint;
	
	@Value("${application.ws.package:com.mysql.ws.model.thirdparty.serivafsdsds}")
	private String urlPackage;
}
