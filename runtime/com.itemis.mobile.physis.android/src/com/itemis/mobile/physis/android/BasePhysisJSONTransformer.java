package com.itemis.mobile.physis.android;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.google.gson.Gson;

public abstract class BasePhysisJSONTransformer<T> {

	public T transform(InputStream inputStream) {
		InputStreamReader reader = new InputStreamReader(inputStream);
		BufferedReader buffered = new BufferedReader(reader);
		Gson gson = new Gson();
		Type clazz = getGenericType();
		T results = gson.fromJson(buffered, clazz);
		try {
			buffered.close();
			reader.close();
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return results;
	}
	
	protected abstract Type getGenericType();

	private Type getGenericType_() {
		Class clazz = getClass();
		Type genericSuperclass = clazz.getGenericSuperclass();
		if (genericSuperclass instanceof ParameterizedType) {
			ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
			Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
			Type genericType = actualTypeArguments[0];
		}
		Type type = ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		return type;
	}

}
