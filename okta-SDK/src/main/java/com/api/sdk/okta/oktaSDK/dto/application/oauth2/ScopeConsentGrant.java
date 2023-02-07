package com.api.sdk.okta.oktaSDK.dto.application.oauth2;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ScopeConsentGrant {

	private String id;
	private String status;
	private String created;
	private CreatedBy createdBy;
	private String lastUpdated;
	private String issuer;
	private String clientId;
	private String scopeId;
	private String source;
	@JsonProperty(value = "_embedded")
	private ScopeConsentGrantEmbedded embedded;
	@JsonProperty(value = "_links")
	private ScopeConsentGrantLinks links;

}
