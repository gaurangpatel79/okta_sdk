package com.api.sdk.okta.oktaSDK.dto.policy;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
public class PasswordPolicyComplexity {

	private Integer minLength;
	private Integer minLowerCase;
	private Integer minUpperCase;
	private Integer minNumber;
	private Integer minSymbol;
	private Boolean excludeUsername;
	@JsonInclude(Include.NON_NULL)
	private PasswordPolicyDictionary dictionary;
	@JsonInclude(Include.NON_NULL)
	private List<Object> excludeAttributes;
}
