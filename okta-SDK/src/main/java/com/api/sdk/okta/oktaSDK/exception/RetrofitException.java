package com.api.sdk.okta.oktaSDK.exception;

import com.api.sdk.okta.oktaSDK.dto.error.RetrofitError;

public class RetrofitException extends Exception {

	private static final long serialVersionUID = 1L;
	private RetrofitError retrofitError;

	public RetrofitException(RetrofitError retrofitError) {
		this.retrofitError = retrofitError;
	}

	public RetrofitError getRetrofitError() {
		return retrofitError;
	}

	public void setRetrofitError(RetrofitError retrofitError) {
		this.retrofitError = retrofitError;
	}
}
