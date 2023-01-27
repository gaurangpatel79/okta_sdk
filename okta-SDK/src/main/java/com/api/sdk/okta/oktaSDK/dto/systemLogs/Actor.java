package com.api.sdk.okta.oktaSDK.dto.systemLogs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Actor {

	private String id;
	private String type;
	private String alternateId;
	private String displayName;
	private String detailEntry;
}
