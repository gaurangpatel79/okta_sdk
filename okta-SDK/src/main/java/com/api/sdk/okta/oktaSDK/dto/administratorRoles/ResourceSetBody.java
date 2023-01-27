package com.api.sdk.okta.oktaSDK.dto.administratorRoles;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceSetBody {

	private String label;
	private String description;
	private List<String> resources;

}
	