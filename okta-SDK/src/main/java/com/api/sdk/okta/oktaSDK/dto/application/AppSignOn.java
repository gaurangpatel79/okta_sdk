package com.api.sdk.okta.oktaSDK.dto.application;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppSignOn {
	
	private String defaultRelayState;
	private String ssoAcsUrl;
	private String idpIssuer;
	private String audience;
	private String recipient;
	private String destination;
	private String subjectNameIdTemplate;
	private String subjectNameIdFormat;
	private boolean responseSigned;
	private boolean assertionSigned;
	private String signatureAlgorithm;
	private String digestAlgorithm;
	private boolean honorForceAuthn;
	private String authnContextClassRef;
	private String spIssuer;
	private boolean requestCompressed;
	private boolean allowMultipleAcsEndpoints;
	
}
