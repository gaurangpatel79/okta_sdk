package com.api.sdk.okta.oktaSDK.dto.administratorRoles;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceSetsResponse {

	@JsonProperty(value = "resource-sets")
	private List<ResourceSetResponse> resourceSets;
}
