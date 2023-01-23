package com.api.sdk.okta.oktaSDK.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "okta")
public class OktaConfig {
	
	   private String authService; 
	   private String grantType;
	   private String redirectUri;
	   private String clientId;
	   private String secret;
	   private String apiKey;

}
