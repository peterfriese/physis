package com.itemis.mobile.physis.android;

import java.io.InputStream;
import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class AndroidServerConnector {

	public InputStream getJSONData(String url) {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		InputStream data = null;
		try {
			URI uri = new URI(url);
			HttpGet method = new HttpGet(uri);
			HttpResponse response = httpClient.execute(method);
			data = response.getEntity().getContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

}
