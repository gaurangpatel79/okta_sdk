package com.api.sdk.okta.oktaSDK.dto.application.certificates;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CertificateResponse {
	
	private String kty;
	private String lastUpdated;
	private String created;
	private String expiresAt;
	private String kid;
	private String use;
	private List<String> x5c;
	@JsonProperty(value = "x5t#S256")
	private String x5tS256;
	private String e;
	private String n;

}
