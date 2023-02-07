package com.api.sdk.okta.oktaSDK.dto.application.certificates;

import org.simpleframework.xml.Element;

import lombok.Data;

@Data
public class X509Data {
	
	@Element(name = "X509Certificate")
	private String x509Certificate;
	
}
