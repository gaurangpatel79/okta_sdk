package com.api.sdk.okta.oktaSDK.service;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class ServiceFactory {

//	private static final String BASE_URL = "https://dev-838474.okta.com/";

	private static final String BASE_URL = System.getProperty("baseUrl");
	private static final String API_KEY = System.getProperty("apiKey");

	private static Retrofit.Builder builder = new Retrofit.Builder().baseUrl(BASE_URL)
			.addConverterFactory(JacksonConverterFactory.create())
			.addConverterFactory(SimpleXmlConverterFactory.create());

	private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder().readTimeout(30, TimeUnit.SECONDS);

	static {
		httpClient.addInterceptor(new Interceptor() {
			public Response intercept(Chain chain) throws IOException {
				Request original = chain.request();

				// Request customization: add request headers
				Request.Builder requestBuilder = original.newBuilder().header("Authorization", "SSWS " + API_KEY)
						.method(original.method(), original.body()).url(original.url());

				Request request = requestBuilder.build();
				return chain.proceed(request);
			}
		});
	}

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
