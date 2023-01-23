package com.api.sdk.okta.oktaSDK.service;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class ServiceFactory {

//	private static final String BASE_URL = "https://dev-838474.okta.com/";
	
	private static final String BASE_URL =	System.getProperty("baseUrl");

	private static Retrofit.Builder builder = new Retrofit.Builder().baseUrl(BASE_URL)
			.addConverterFactory(JacksonConverterFactory.create());

	private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder().readTimeout(30, TimeUnit.SECONDS);

	private static Retrofit retrofit = builder.client(httpClient.build()).build();

	/**
	 * creates the instance of the provided service
	 * 
	 * @param <S>
	 * @param serviceClass class parameter that lists the apis
	 * @return the service instance for the given service class
	 */
	public static <S> S createService(Class<S> serviceClass) {

		return retrofit.create(serviceClass);
	}
}
