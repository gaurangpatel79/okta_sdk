package com.api.sdk.okta.oktaSDK.dto.application.certificates;

import org.simpleframework.xml.Element;

import lombok.Data;

@Data
public class KeyInfo {

	// @Attribute(name = "xmlns:ds")
	private String xmlns;

	@Element(name = "X509Data")
	private X509Data x509Data;

}
