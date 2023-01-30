package com.api.sdk.okta.oktaSDK.dto.application.certificates;

import lombok.Data;

@Data
public class CsrSubject {

	private String countryName;
	private String stateOrProvinceName;
	private String localityName;
	private String organizationName;
	private String organizationalUnitName;
	private String commonName;
}
