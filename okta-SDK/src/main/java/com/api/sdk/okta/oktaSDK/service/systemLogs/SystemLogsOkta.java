package com.api.sdk.okta.oktaSDK.service.systemLogs;

import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.systemLogs.LogsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SystemLogsOkta {
	
	@GET("/api/v1/logs")
	public Call<List<LogsResponse>> getAllSystemLogs();

	@GET("/api/v1/logs")
	public Call<List<LogsResponse>> getAllSystemLogs(@Query("q") String query);

	@GET("/api/v1/logs")
	public Call<List<LogsResponse>> filterSystemLogs(@Query("filter") String filter);

	@GET("/api/v1/logs")
	public Call<List<LogsResponse>> getSystemLogsWithFromDate(@Query("since") String since);

	
}
