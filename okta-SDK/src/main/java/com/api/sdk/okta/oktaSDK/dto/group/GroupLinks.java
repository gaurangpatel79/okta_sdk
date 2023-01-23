package com.api.sdk.okta.oktaSDK.dto.group;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupLinks {

	@JsonProperty(value = "logo")
	private List<GroupLogo> logo;

	@JsonProperty(value = "users")
	private GroupLogo users;

	@JsonProperty(value = "apps")
	private GroupLogo apps;

}
