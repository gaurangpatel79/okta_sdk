package com.api.sdk.okta.oktaSDK.dto.application.certificates;

import lombok.Data;

@Data
public class CsrRequest {
	
	private CsrSubject subject;
	private CsrSubjectAltNames subjectAltNames;

}
