package com.api.sdk.okta.oktaSDK.dto.application;

import lombok.Data;

@Data
public class OktaOrg2OrgAppRequest {

	private String name;
	private String label;
	private String signOnMode;
	private AppSettings settings;
}
