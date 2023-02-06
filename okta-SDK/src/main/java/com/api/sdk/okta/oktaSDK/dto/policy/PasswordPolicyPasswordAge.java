package com.api.sdk.okta.oktaSDK.dto.policy;

import lombok.Data;

@Data
public class PasswordPolicyPasswordAge {

	private Integer maxAgeDays;
	private Integer expireWarnDays;
	private Integer minAgeMinutes;
	private Integer historyCount;
}
