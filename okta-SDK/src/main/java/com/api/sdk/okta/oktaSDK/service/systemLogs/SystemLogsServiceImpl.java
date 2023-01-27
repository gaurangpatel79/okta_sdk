package com.api.sdk.okta.oktaSDK.service.systemLogs;

import java.io.IOException;
import java.util.List;

import com.api.sdk.okta.oktaSDK.dto.systemLogs.LogsResponse;
import com.api.sdk.okta.oktaSDK.exception.CustomValidationException;
import com.api.sdk.okta.oktaSDK.service.ServiceFactory;
import com.api.sdk.okta.oktaSDK.util.ResponseParserUtil;

import retrofit2.Call;
import retrofit2.Response;

public class SystemLogsServiceImpl implements SystemLogsService {

	final SystemLogsOkta oktaService;

	public SystemLogsServiceImpl() {
		oktaService = ServiceFactory.createService(SystemLogsOkta.class);

	}

	@Override
	public List<LogsResponse> getAllSystemLogs() {
		try {
			Call<List<LogsResponse>> call = oktaService.getAllSystemLogs();
			Response<List<LogsResponse>> response = call.execute();

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
	public List<LogsResponse> getAllSystemLogs(String query) {
		try {
			Call<List<LogsResponse>> call = oktaService.getAllSystemLogs(query);
			Response<List<LogsResponse>> response = call.execute();

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
	public List<LogsResponse> filterSystemLogs(String filter) {
		try {
			Call<List<LogsResponse>> call = oktaService.filterSystemLogs(filter);
			Response<List<LogsResponse>> response = call.execute();

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
	public List<LogsResponse> getSystemLogsWithFromDate(String date) {
		try {
			Call<List<LogsResponse>> call = oktaService.getSystemLogsWithFromDate(date);
			Response<List<LogsResponse>> response = call.execute();

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
}
