package com.api.sdk.okta.oktaSDK;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//@EnableSwagger2
@SpringBootApplication
@EnableConfigurationProperties
public class OktaSdkApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(OktaSdkApplication.class, args);
	}

}
