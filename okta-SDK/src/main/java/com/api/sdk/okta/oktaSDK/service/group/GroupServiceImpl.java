package com.api.sdk.okta.oktaSDK.service.group;

import java.io.IOException;
import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.application.ApplicationResponse;
import com.api.sdk.okta.oktaSDK.dto.group.CreateGroupRequest;
import com.api.sdk.okta.oktaSDK.dto.group.GroupResponse;
import com.api.sdk.okta.oktaSDK.dto.group.RulesRequest;
import com.api.sdk.okta.oktaSDK.dto.user.User;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import retrofit2.Call;
import retrofit2.Response;

public class GroupServiceImpl implements GroupService {

	final GroupOkta oktaService;
	String apiKey;

	public GroupServiceImpl() {
		apiKey = System.getProperty("apiKey");
		oktaService = ServiceFactory.createService(GroupOkta.class);
	}

	@Override
	public GroupResponse createGroup(CreateGroupRequest createGroupRequest) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<GroupResponse> call = oktaService.createGroup(authorization, createGroupRequest);
			Response<GroupResponse> response = call.execute();

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
	public GroupResponse getGroupById(String groupId) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<GroupResponse> call = oktaService.getGroupById(authorization, groupId);
			Response<GroupResponse> response = call.execute();

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
	public List<GroupResponse> getAllGroups() {
		try {
			String authorization = "SSWS " + apiKey;
			Call<List<GroupResponse>> call = oktaService.getAllGroups(authorization);
			Response<List<GroupResponse>> response = call.execute();

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
	public List<GroupResponse> searchGroups(String query) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<List<GroupResponse>> call = oktaService.searchGroups(authorization, query);
			Response<List<GroupResponse>> response = call.execute();

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
	public List<GroupResponse> filterGroups(String filter) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<List<GroupResponse>> call = oktaService.filterGroups(authorization, filter);
			Response<List<GroupResponse>> response = call.execute();

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
	public GroupResponse updateGroup(String groupId, CreateGroupRequest createGroupRequest) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<GroupResponse> call = oktaService.updateGroupById(authorization, groupId, createGroupRequest);
			Response<GroupResponse> response = call.execute();

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
	public String deleteGroupById(String groupId) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<Void> call = oktaService.deleteGroupById(authorization, groupId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Group Successfully Deleted";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<User> getAllUserFromGroupById(String groupId) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<List<User>> call = oktaService.listGroupMembers(authorization, groupId);
			Response<List<User>> response = call.execute();

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
	public String assignUserToGroup(String groupId, String userId) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<Void> call = oktaService.addUserToGroupById(authorization, groupId, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "User Successfully Added to Group";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String removeUserToGroup(String groupId, String userId) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<Void> call = oktaService.removeUserToGroupById(authorization, groupId, userId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "User Successfully Removed from Group";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public List<ApplicationResponse> listAssignedApplicationToGroup(String groupId) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<List<ApplicationResponse>> call = oktaService.listAssignedApplicationToGroup(authorization, groupId);
			Response<List<ApplicationResponse>> response = call.execute();

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
	public RulesRequest addRuleWithGroup(RulesRequest rulesRequest) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<RulesRequest> call = oktaService.addRuleToGroup(authorization, rulesRequest);
			Response<RulesRequest> response = call.execute();

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
	public RulesRequest updateRuleWithGroup(String ruleId, RulesRequest rulesRequest) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<RulesRequest> call = oktaService.updateRuleToGroup(authorization, ruleId, rulesRequest);
			Response<RulesRequest> response = call.execute();

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
	public RulesRequest getRuleById(String ruleId) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<RulesRequest> call = oktaService.getRulebyId(authorization, ruleId);
			Response<RulesRequest> response = call.execute();

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
	public List<RulesRequest> getAllRule(int limit) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<List<RulesRequest>> call = oktaService.getAllRule(authorization, limit, "groupIdToGroupNameMap");
			Response<List<RulesRequest>> response = call.execute();

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
	public List<RulesRequest> searchRule(String query) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<List<RulesRequest>> call = oktaService.searchRule(authorization, query);
			Response<List<RulesRequest>> response = call.execute();

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
	public List<RulesRequest> getRuleWithAfter(String ruleId) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<List<RulesRequest>> call = oktaService.getRuleWithAfter(authorization, ruleId);
			Response<List<RulesRequest>> response = call.execute();

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
	public String deleteRulebyId(String ruleId) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<Void> call = oktaService.deleteRulebyId(authorization, ruleId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Rule Successfully Removed.";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String deleteRuleAndRemoveUsersbyId(String ruleId, boolean isRemoveUsers) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<Void> call = oktaService.deleteRuleAndRemoveUsersbyId(authorization, ruleId, isRemoveUsers);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Rule Successfully Removed.";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String deactivateRulebyId(String ruleId) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<Void> call = oktaService.deactivateRulebyId(authorization, ruleId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Rule Deactivated Successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

	@Override
	public String activateRulebyId(String ruleId) {
		try {
			String authorization = "SSWS " + apiKey;
			Call<Void> call = oktaService.activateRulebyId(authorization, ruleId);
			Response<Void> response = call.execute();

			if (!response.isSuccessful()) {
				ResponseParserUtil.parseErrorResponse(response);
				return null;
			} else {
				return "Rule Activated Successfully";
			}
		} catch (IOException e) {
			throw new CustomValidationException(e.getMessage());
		}
	}

}
