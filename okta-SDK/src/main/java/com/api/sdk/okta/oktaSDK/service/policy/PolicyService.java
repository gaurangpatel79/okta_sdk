package com.api.sdk.okta.oktaSDK.service.policy;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.policy.GlobalSessionDenyRuleRequest;
import com.api.sdk.okta.oktaSDK.dto.policy.GlobalSessionPolicyRequest;
import com.api.sdk.okta.oktaSDK.dto.policy.GlobalSessionPolicyUpdateRequest;
import com.api.sdk.okta.oktaSDK.dto.policy.GlobalSessionRadiusRuleRequest;
import com.api.sdk.okta.oktaSDK.dto.policy.GlobalSessionRuleResponse;
import com.api.sdk.okta.oktaSDK.dto.policy.MFAEnrollRuleRequest;
import com.api.sdk.okta.oktaSDK.dto.policy.MFAEnrollRuleResponse;
import com.api.sdk.okta.oktaSDK.dto.policy.MFAEnrollRuleUpdateRequest;
import com.api.sdk.okta.oktaSDK.dto.policy.PolicyResponse;

public interface PolicyService {

	public MFAEnrollRuleResponse createMFAEnrollRule(String policyId, MFAEnrollRuleRequest request);

	public MFAEnrollRuleResponse updateMFAEnrollRule(String policyId, String ruleId,
			MFAEnrollRuleUpdateRequest request);

	public List<PolicyResponse> getPoliciesByType(String type);

	public PolicyResponse createGlobalSessionPolicy(GlobalSessionPolicyRequest request);

	public GlobalSessionRuleResponse createRadiusRule(String policyId, GlobalSessionRadiusRuleRequest request);

	public PolicyResponse updateGlobalSessionPolicy(String policyId, GlobalSessionPolicyUpdateRequest request);

	public GlobalSessionRuleResponse createDenyRule(String policyId, GlobalSessionDenyRuleRequest request);

}
