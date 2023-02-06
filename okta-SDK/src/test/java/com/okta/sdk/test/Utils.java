package com.okta.sdk.test;

import java.io.IOException;
import java.net.URL;

import com.api.sdk.okta.oktaSDK.util.ObjectMapperHelper;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;

public class Utils {

	public static <T> T createRequest(Class<?> clazz, String fileName, Class<T> valueType) {
		try {
			String requestStr = loadFile(clazz, fileName);
			T request = ObjectMapperHelper.readValueFromJSON(requestStr, valueType);
			return request;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static String loadFile(Class<?> clazz, String fileName) {
		URL url = Resources.getResource(clazz, fileName);
		try {
			String data = Resources.toString(url, Charsets.UTF_8);
			return data;
		} catch (IOException e) {
			throw new RuntimeException("Couldn't load a JSON file.", e);
		}
	}

}
