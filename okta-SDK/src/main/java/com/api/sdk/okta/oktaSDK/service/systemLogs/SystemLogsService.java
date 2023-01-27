package com.api.sdk.okta.oktaSDK.service.systemLogs;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.systemLogs.LogsResponse;

public interface SystemLogsService {

	public List<LogsResponse> getAllSystemLogs();

	public List<LogsResponse> getAllSystemLogs(String query);

	public List<LogsResponse> filterSystemLogs(String filter);

	public List<LogsResponse> getSystemLogsWithFromDate(String date);
}
