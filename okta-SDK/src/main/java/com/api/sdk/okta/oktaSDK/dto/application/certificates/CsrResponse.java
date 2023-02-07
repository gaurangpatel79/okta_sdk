package com.api.sdk.okta.oktaSDK.dto.application.certificates;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CsrResponse {
	
	private String id;
	private String created;
	private String csr;
	private String kty;
	@JsonProperty(value = "_links")
	private CsrLinks links;
}
