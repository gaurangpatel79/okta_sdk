package com.api.sdk.okta.oktaSDK.dto.organization;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrganizationBody {

	private String id;
	private String subdomain;
	private String companyName;
	private String status;
	private String expiresAt;
	private String created;
	private String lastUpdated;
	private String website;
	private String phoneNumber;
	private String endUserSupportHelpURL;
	private String supportPhoneNumber;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private String postalCode;
	
	@JsonProperty(value = "_links")
	private OrgLinks links;
	
	
}
