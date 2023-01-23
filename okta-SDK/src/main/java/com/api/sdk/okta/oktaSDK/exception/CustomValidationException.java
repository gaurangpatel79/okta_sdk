package com.api.sdk.okta.oktaSDK.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class CustomValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String result;

	public CustomValidationException(String message) {
		super(message);
		this.result = message;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
