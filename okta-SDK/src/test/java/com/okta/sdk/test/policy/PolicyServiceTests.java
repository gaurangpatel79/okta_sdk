package com.okta.sdk.test.policy;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
import com.api.sdk.okta.oktaSDK.dto.policy.PolicyResponse;
import com.api.sdk.okta.oktaSDK.factory.PolicyServiceFactory;
import com.api.sdk.okta.oktaSDK.service.policy.PolicyService;
import com.okta.sdk.test.Utils;

public class PolicyServiceTests {

	private PolicyService policyService;

	@BeforeEach
	public void tearUp() {
		policyService = PolicyServiceFactory.getPolicyService();
	}

	@Test
	public void testCreateMFAEnrollRule() {

		MFAEnrollRuleRequest request = Utils.createRequest(this.getClass(), "createMFAEnrollRule.json",
				MFAEnrollRuleRequest.class);
		MFAEnrollRuleResponse response = policyService.createMFAEnrollRule("00ptt7ljeqxTXox9Y356", request);
		assertNotNull(response);
		assertNotNull(response.getId());

		System.out.println("Rule Response: " + response);
	}

	@Test
	public void testUpdateMFAEnrollRule() {

		MFAEnrollRuleUpdateRequest request = Utils.createRequest(this.getClass(), "updateMFAEnrollRule.json",
				MFAEnrollRuleUpdateRequest.class);
		MFAEnrollRuleResponse response = policyService.updateMFAEnrollRule("00ptt7ljeqxTXox9Y356",
				"0prpcn7oveR6zCYGm357", request);
		assertNotNull(response);
		assertNotNull(response.getId());

		System.out.println("Rule Response: " + response);
	}

	@Test
	public void testGetMFAEnrollPolicies() {

		List<PolicyResponse> response = policyService.getPoliciesByType("MFA_ENROLL");
		assertNotNull(response);
		assertTrue(response.size() > 0);

		System.out.println("Policy Response: " + response);
	}

	@Test
	public void testCreateGlobalSessionPolicy() {

		GlobalSessionPolicyRequest request = Utils.createRequest(this.getClass(), "createGlobalSessionPolicy.json",
				GlobalSessionPolicyRequest.class);
		PolicyResponse response = policyService.createGlobalSessionPolicy(request);
		assertNotNull(response);
		assertNotNull(response.getId());

		System.out.println("Policy Response: " + response);
	}

	@Test
	public void testGetGlobalSessionPolicies() {

		List<PolicyResponse> response = policyService.getPoliciesByType("OKTA_SIGN_ON");
		assertNotNull(response);
		assertTrue(response.size() > 0);

		System.out.println("Policy Response: " + response);
	}

	@Test
	public void testCreateRadiusRule() {

		GlobalSessionRadiusRuleRequest request = Utils.createRequest(this.getClass(), "createRadiusRuleRequest.json",
				GlobalSessionRadiusRuleRequest.class);
		GlobalSessionRuleResponse response = policyService.createRadiusRule("00ppemj9ckARUcdlF357", request);
		assertNotNull(response);
		assertNotNull(response.getId());
		System.out.println("Rule Response: " + response);
	}

	@Test
	public void testUpdateGlobalSessionPolicy() {

		GlobalSessionPolicyUpdateRequest request = Utils.createRequest(this.getClass(),
				"updateGlobalSessionPolicy.json", GlobalSessionPolicyUpdateRequest.class);
		PolicyResponse response = policyService.updateGlobalSessionPolicy("00ppeoiflhUSw8Z59357", request);
		assertNotNull(response);
		assertNotNull(response.getId());
		System.out.println("Policy Response: " + response);
	}
	
	@Test
	public void testCreateDenyRule() {

		GlobalSessionDenyRuleRequest request = Utils.createRequest(this.getClass(), "createDenyRuleRequest.json",
				GlobalSessionDenyRuleRequest.class);
		GlobalSessionRuleResponse response = policyService.createDenyRule("00ppemj9ckARUcdlF357", request);
		assertNotNull(response);
		assertNotNull(response.getId());
		System.out.println("Rule Response: " + response);
	}
	
	@Test
	public void testGetPasswordPolicies() {

		List<PasswordPolicyResponse> response = policyService.getPasswordPolicies("PASSWORD");
		assertNotNull(response);
		assertTrue(response.size() > 0);

		System.out.println("Policy Response: " + response);
	}
	
	@Test
	public void testCreatePasswordPolicy() {

		PasswordPolicyRequest request = Utils.createRequest(this.getClass(), "createPasswordPolicy.json",
				PasswordPolicyRequest.class);
		PasswordPolicyResponse response = policyService.createPasswordPolicy(request);
		assertNotNull(response);
		assertNotNull(response.getId());

		System.out.println("Policy Response: " + response);
	}
	
	@Test
	public void testCreatePasswordPolicyRule() {

		PasswordPolicyRuleRequest request = Utils.createRequest(this.getClass(), "createPasswordPolicyRule.json",
				PasswordPolicyRuleRequest.class);
		PasswordPolicyRuleResponse response = policyService.createPasswordPolicyRule("00pperde2bCOQV7GM357", request);
		assertNotNull(response);
		assertNotNull(response.getId());

		System.out.println("Policy Response: " + response);
	}
	
	@Test
	public void testUpdatePasswordPolicyRule() {

		PasswordPolicyRuleUpdate request = Utils.createRequest(this.getClass(), "updatePasswordPolicyRule.json",
				PasswordPolicyRuleUpdate.class);
		PasswordPolicyRuleResponse response = policyService.updatePasswordPolicyRule("00ppesqrqbhY6ROpP357", "0prpesovlbgqdlPhB357", request);
		assertNotNull(response);
		assertNotNull(response.getId());

		System.out.println("Policy Response: " + response);
	}
}
