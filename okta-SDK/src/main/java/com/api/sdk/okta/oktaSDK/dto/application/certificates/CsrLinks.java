package com.api.sdk.okta.oktaSDK.dto.application.certificates;

import com.api.sdk.okta.oktaSDK.dto.application.UploadLogo;

import lombok.Data;

@Data
public class CsrLinks {

	private UploadLogo publish;
	private UploadLogo self;
}
