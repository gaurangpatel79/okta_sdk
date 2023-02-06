package com.api.sdk.okta.oktaSDK.dto.policy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
public class GlobalSessionRuleConditions {
	@JsonInclude(Include.NON_NULL)
	private GlobalSessionRulePeople people;
	@JsonInclude(Include.NON_NULL)
	private Network network;
	@JsonInclude(Include.NON_NULL)
	private GlobalSessionRuleAuthContext authContext;
	@JsonInclude(Include.NON_NULL)
	private GlobalSessionRuleRisk risk;
	@JsonInclude(Include.NON_NULL)
	private GlobalSessionRuleRiskScore riskScore;
	@JsonInclude(Include.NON_NULL)
	private GlobalSessionRuleIdentityProvider identityProvider;
	@JsonInclude(Include.NON_NULL)
	private GlobalSessionRuleActions actions;
}
