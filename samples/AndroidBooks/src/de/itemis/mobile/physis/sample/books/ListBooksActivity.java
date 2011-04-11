package de.itemis.mobile.physis.sample.books;

import android.app.ListActivity;
import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;

public class ListBooksActivity extends ListActivity {
	
    private BooksAsyncQueryHandler booksAsyncQueryHandler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        booksAsyncQueryHandler = new BooksAsyncQueryHandler(getContentResolver());
        loadData();
    }
    
    private void loadData() {
    	String orderBy = null;
		String[] selectionArgs = null;
		String selection = null;
		String[] projection = null;
		
		Uri uri = BooksContentProvider.CONTENT_URI;
		booksAsyncQueryHandler.startQuery(1, null, uri, projection, selection, selectionArgs, orderBy);
    }
    
    private class BooksAsyncQueryHandler extends AsyncQueryHandler {
    	@Override
    	protected void onQueryComplete(int token, Object cookie, Cursor cursor) {
    		super.onQueryComplete(token, cookie, cursor);
            SimpleCursorAdapter booksAdapter = new SimpleCursorAdapter(
            		ListBooksActivity.this, 
            		android.R.layout.simple_list_item_2, cursor, 
            		new String[] {BooksContentProvider.AUTHOR_COLUMN, BooksContentProvider.TITLE_COLUMN}, 
            		new int[]{android.R.id.text1, android.R.id.text2});
            setListAdapter(booksAdapter);
    	}

		public BooksAsyncQueryHandler(ContentResolver cr) {
			super(cr);
		}
    }
    
}