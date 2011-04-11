package com.itemis.mobile.physis.android;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class BaseServerConnector {
	
	public InputStream getJSONData(String urlString) {
		InputStream data = null;
		try {
			URL url = new URL(urlString);
			URLConnection con = url.openConnection();
			return data = con.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}	

}
