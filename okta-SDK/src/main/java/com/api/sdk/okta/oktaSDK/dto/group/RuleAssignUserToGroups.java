package com.api.sdk.okta.oktaSDK.dto.group;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleAssignUserToGroups {
	
	private List<String> groupIds;

}
