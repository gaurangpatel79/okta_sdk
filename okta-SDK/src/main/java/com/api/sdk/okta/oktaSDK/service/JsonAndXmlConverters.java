package com.api.sdk.okta.oktaSDK.service;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import org.jetbrains.annotations.Nullable;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

public final class JsonAndXmlConverters {

	static class QualifiedTypeConverterFactory extends Converter.Factory {
		private final Converter.Factory jsonFactory;
		private final Converter.Factory xmlFactory;

		QualifiedTypeConverterFactory(Converter.Factory jsonFactory, Converter.Factory xmlFactory) {
			this.jsonFactory = jsonFactory;
			this.xmlFactory = xmlFactory;
		}

		@Override
		public @Nullable Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations,
				Retrofit retrofit) {
			for (Annotation annotation : annotations) {
				if (annotation instanceof Json) {
					return jsonFactory.responseBodyConverter(type, annotations, retrofit);
				}
				if (annotation instanceof Xml) {
					return xmlFactory.responseBodyConverter(type, annotations, retrofit);
				}
			}
			return jsonFactory.responseBodyConverter(type, annotations, retrofit);
		}

		@Override
		public @Nullable Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations,
				Annotation[] methodAnnotations, Retrofit retrofit) {
			for (Annotation annotation : parameterAnnotations) {
				if (annotation instanceof Json) {
					return jsonFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
				}
				if (annotation instanceof Xml) {
					return xmlFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
				}
			}
			return jsonFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
		}
	}
}
