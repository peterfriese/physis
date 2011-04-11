package com.itemis.mobile.physis.android;

import java.io.InputStream;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;

public abstract class BasePhysisContentProvider<T> extends ContentProvider {

	private AndroidServerConnector serverConnector;
	private BasePhysisJSONTransformer<T> transformer;

	@Override
	public boolean onCreate() {
		serverConnector = new AndroidServerConnector();
		transformer = createTransformer();
		return true;
	}
	
	protected abstract BasePhysisJSONTransformer createTransformer();

	protected abstract String getUrl(Uri uri, String[] projection, String selection,
			String[] selectionargs, String sortOrder);

	protected abstract MatrixCursor createCursor(T element);

	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		String url = getUrl(uri, projection, selection, selectionArgs,
				sortOrder);
		InputStream inputStream = serverConnector.getJSONData(url);
		T transformedObject = transformer.transform(inputStream);
		MatrixCursor cursor = createCursor(transformedObject);
		return cursor;
	}

	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		return null;
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection,
			String[] selectionArgs) {
		return 0;
	}

}
