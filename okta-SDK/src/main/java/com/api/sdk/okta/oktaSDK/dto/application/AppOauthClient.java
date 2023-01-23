package com.api.sdk.okta.oktaSDK.dto.application;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppOauthClient {

	 private String client_uri;
	 private String logo_uri;
	 private List<String> redirect_uris;
	 private List<String> response_types;
	 private List<String> grant_types;
	 private String initiate_login_uri;
	 private String application_type;
	 private String consent_method;
	 private String issuer_mode;
	 private AppRefreshToken refresh_token;
	 private AppIdpInitiatedLogin idp_initiated_login;
	 private String wildcard_redirect;
}
