package com.api.sdk.okta.oktaSDK.service.policy;

import java.io.IOException;
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
import com.api.sdk.okta.oktaSDK.dto.policy.PasswordPolicyRequest;
import com.api.sdk.okta.oktaSDK.dto.policy.PasswordPolicyResponse;
import com.api.sdk.okta.oktaSDK.dto.policy.PasswordPolicyRuleRequest;
import com.api.sdk.okta.oktaSDK.dto.policy.PasswordPolicyRuleResponse;
import com.api.sdk.okta.oktaSDK.dto.policy.PasswordPolicyRuleUpdate;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import retrofit2.Call;
import retrofit2.Response;

public class PolicyServiceImpl implements PolicyService {

	final PolicyOkta oktaService;

	public PolicyServiceImpl() {
		oktaService = ServiceFactory.createService(PolicyOkta.class);
	}

	@Override
	public MFAEnrollRuleResponse createMFAEnrollRule(String policyId, MFAEnrollRuleRequest request) {
		try {
			Call<MFAEnrollRuleResponse> call = oktaService.createMFAEnrollRule(policyId, request);
			Response<MFAEnrollRuleResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public MFAEnrollRuleResponse updateMFAEnrollRule(String policyId, String ruleId,
			MFAEnrollRuleUpdateRequest request) {
		try {
			Call<MFAEnrollRuleResponse> call = oktaService.updateMFAEnrollRule(policyId, ruleId, request);
			Response<MFAEnrollRuleResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<PolicyResponse> getPoliciesByType(String type) {
		try {
			Call<List<PolicyResponse>> call = oktaService.getPoliciesByType(type);
			Response<List<PolicyResponse>> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public PolicyResponse createGlobalSessionPolicy(GlobalSessionPolicyRequest request) {
		try {
			Call<PolicyResponse> call = oktaService.createGlobalSessionPolicy(request);
			Response<PolicyResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public GlobalSessionRuleResponse createRadiusRule(String policyId, GlobalSessionRadiusRuleRequest request) {
		try {
			Call<GlobalSessionRuleResponse> call = oktaService.createRadiusRule(policyId, request);
			Response<GlobalSessionRuleResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public PolicyResponse updateGlobalSessionPolicy(String policyId, GlobalSessionPolicyUpdateRequest request) {
		try {
			Call<PolicyResponse> call = oktaService.updateGlobalSessionPolicy(policyId, request);
			Response<PolicyResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public GlobalSessionRuleResponse createDenyRule(String policyId, GlobalSessionDenyRuleRequest request) {
		try {
			Call<GlobalSessionRuleResponse> call = oktaService.createDenyRule(policyId, request);
			Response<GlobalSessionRuleResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<PasswordPolicyResponse> getPasswordPolicies(String type) {
		try {
			Call<List<PasswordPolicyResponse>> call = oktaService.getPasswordPolicies(type);
			Response<List<PasswordPolicyResponse>> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public PasswordPolicyResponse createPasswordPolicy(PasswordPolicyRequest request) {
		try {
			Call<PasswordPolicyResponse> call = oktaService.createPasswordPolicy(request);
			Response<PasswordPolicyResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public PasswordPolicyRuleResponse createPasswordPolicyRule(String policyId, PasswordPolicyRuleRequest request) {
		try {
			Call<PasswordPolicyRuleResponse> call = oktaService.createPasswordPolicyRule(policyId, request);
			Response<PasswordPolicyRuleResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
		
	}

	@Override
	public PasswordPolicyRuleResponse updatePasswordPolicyRule(String policyId, String ruleId,
			PasswordPolicyRuleUpdate request) {
		try {
			Call<PasswordPolicyRuleResponse> call = oktaService.updatePasswordPolicyRule(policyId, ruleId, request);
			Response<PasswordPolicyRuleResponse> response = call.execute();
			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return response.body();
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

}
