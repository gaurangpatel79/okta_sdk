package com.api.sdk.okta.oktaSDK.service.policy;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.policy.PolicyResponse;
import com.api.sdk.okta.oktaSDK.dto.policy.GlobalSessionDenyRuleRequest;
import com.api.sdk.okta.oktaSDK.dto.policy.GlobalSessionPolicyRequest;
import com.api.sdk.okta.oktaSDK.dto.policy.GlobalSessionPolicyUpdateRequest;
import com.api.sdk.okta.oktaSDK.dto.policy.GlobalSessionRadiusRuleRequest;
import com.api.sdk.okta.oktaSDK.dto.policy.GlobalSessionRuleResponse;
import com.api.sdk.okta.oktaSDK.dto.policy.MFAEnrollRuleRequest;
import com.api.sdk.okta.oktaSDK.dto.policy.MFAEnrollRuleResponse;
import com.api.sdk.okta.oktaSDK.dto.policy.MFAEnrollRuleUpdateRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PolicyOkta {

	@POST("/api/v1/policies/{policyId}/rules")
	public Call<MFAEnrollRuleResponse> createMFAEnrollRule(@Path("policyId") String policyId,
			@Body MFAEnrollRuleRequest request);

	@PUT("/api/v1/policies/{policyId}/rules/{ruleId}")
	public Call<MFAEnrollRuleResponse> updateMFAEnrollRule(@Path("policyId") String policyId,
			@Path("ruleId") String ruleId, @Body MFAEnrollRuleUpdateRequest request);

	@GET("/api/v1/policies")
	public Call<List<PolicyResponse>> getPoliciesByType(@Query("type") String type);

	@POST("/api/v1/policies")
	public Call<PolicyResponse> createGlobalSessionPolicy(@Body GlobalSessionPolicyRequest request);

	@POST("/api/v1/policies/{policyId}/rules")
	public Call<GlobalSessionRuleResponse> createRadiusRule(@Path("policyId") String policyId,
			@Body GlobalSessionRadiusRuleRequest request);

	@PUT("/api/v1/policies/{policyId}")
	public Call<PolicyResponse> updateGlobalSessionPolicy(@Path("policyId") String policyId,
			@Body GlobalSessionPolicyUpdateRequest request);

	@POST("/api/v1/policies/{policyId}/rules")
	public Call<GlobalSessionRuleResponse> createDenyRule(@Path("policyId") String policyId,
			@Body GlobalSessionDenyRuleRequest request);
}
