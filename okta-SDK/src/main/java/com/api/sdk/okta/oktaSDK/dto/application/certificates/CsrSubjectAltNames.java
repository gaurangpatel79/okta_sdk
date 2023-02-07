package com.api.sdk.okta.oktaSDK.dto.application.certificates;

import java.util.List;

import lombok.Data;

@Data
public class CsrSubjectAltNames {
	
	private List<String> dnsNames;

}
