package com.api.sdk.okta.oktaSDK.dto.systemLogs;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LogsResponse {
	
	private Actor actor;
	private Client client;
	private String device;
	private AuthenticationContext authenticationContext;
	private String displayMessage;
	private String eventType;
	private Outcome outcome;
	private String published;
	private SecurityContext securityContext;
	private String severity;
	
	private DebugContext debugContext;
	private String legacyEventType;
	private Transaction transaction;
	
	private String uuid;
	private String version;
	private LogRequest request;
	private List<Target> target;
}
