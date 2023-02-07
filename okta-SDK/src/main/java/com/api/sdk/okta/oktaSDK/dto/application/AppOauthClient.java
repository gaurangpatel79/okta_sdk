package com.api.sdk.okta.oktaSDK.dto.application;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppOauthClient {

	 @JsonInclude(Include.NON_NULL)
	 private String client_uri;
	 @JsonInclude(Include.NON_NULL)
	 private String logo_uri;
	 @JsonInclude(Include.NON_NULL)
	 private List<String> redirect_uris;
	 @JsonInclude(Include.NON_NULL)
	 private List<String> response_types;
	 @JsonInclude(Include.NON_NULL)
	 private List<String> grant_types;
	 @JsonInclude(Include.NON_NULL)
	 private String initiate_login_uri;
	 @JsonInclude(Include.NON_NULL)
	 private String application_type;
	 @JsonInclude(Include.NON_NULL)
	 private String consent_method;
	 @JsonInclude(Include.NON_NULL)
	 private String issuer_mode;
	 @JsonInclude(Include.NON_NULL)
	 private AppRefreshToken refresh_token;
	 @JsonInclude(Include.NON_NULL)
	 private AppIdpInitiatedLogin idp_initiated_login;
	 @JsonInclude(Include.NON_NULL)
	 private String wildcard_redirect;
	 @JsonInclude(Include.NON_NULL)
	 private String token_endpoint_auth_method;
	 @JsonInclude(Include.NON_NULL)
	 private Boolean autoKeyRotation;
	 @JsonInclude(Include.NON_NULL)
	 private String client_id;
	 @JsonInclude(Include.NON_NULL)
	 private String client_secret;
	 @JsonInclude(Include.NON_NULL)
	 private Boolean pkce_required;
}
