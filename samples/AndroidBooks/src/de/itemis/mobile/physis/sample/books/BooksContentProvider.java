package de.itemis.mobile.physis.sample.books;

import java.util.List;

import android.content.UriMatcher;
import android.database.MatrixCursor;
import android.net.Uri;

import com.itemis.mobile.physis.android.BasePhysisContentProvider;
import com.itemis.mobile.physis.android.BasePhysisJSONTransformer;

public class BooksContentProvider extends BasePhysisContentProvider<List<Book>> {
	
	public static final String ID_COLUMN = "_id";
	public static final String AUTHOR_COLUMN = "author";
	public static final String TITLE_COLUMN = "title";
	public static final String PUBLISHER_COLUMN = "PUBLISHER";
	
	private static final int ID_COLUMN_IDX = 1;
	private static final int AUTHOR_COLUMN_IDX = 2;
	private static final int TITLE_COLUMN_IDX = 3;
	private static final int PUBLISHER_COLUMN_IDX = 4;
	
	private static String[] COLUMN_NAMES = {ID_COLUMN, AUTHOR_COLUMN, TITLE_COLUMN, PUBLISHER_COLUMN};
	
	private static final String PROVIDER_NAME = BooksContentProvider.class.getName();
	private static final String URI_ITEMS = "items";
	private static final String URI_ITEM = URI_ITEMS + "/#";
	private static final String URI_STRING = "content://" + PROVIDER_NAME + "/"  + URI_ITEMS;
	public static final Uri CONTENT_URI = Uri.parse(URI_STRING);
	
	private static final int ITEMS = 1;
	private static final int ITEM = 2;
	private static UriMatcher uriMatcher;
	static {
		uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
		uriMatcher.addURI(PROVIDER_NAME, URI_ITEMS, ITEMS);
		uriMatcher.addURI(PROVIDER_NAME, URI_ITEM, ITEM);
	}

	@Override
	protected MatrixCursor createCursor(List<Book> element) {
		MatrixCursor matrixCursor = new MatrixCursor(COLUMN_NAMES, element.size());
		for (Book book : element) {
			matrixCursor.addRow(new Object[] {book.getId(), book.getAuthor(), book.getTitle(), book.getPublisher()});
		}
		return matrixCursor;
	}

	@Override
	public String getType(Uri uri) {
		switch (uriMatcher.match(uri)) {
		case ITEMS:
			return "vnd.android.cursor.dir/vnd." + PROVIDER_NAME;
		case ITEM:
		default:
			throw new IllegalArgumentException("Unsupported URI: " + uri);
		}
	}

	@Override
	protected String getUrl(Uri uri, String[] projection, String selection,
			String[] selectionargs, String sortOrder) {
		switch (uriMatcher.match(uri)) {
		case ITEMS:
			return "http://192.168.210.1/~peterfriese/books/books.json";
		case ITEM:
		default:
			throw new IllegalArgumentException("Unsupported URI: " + uri);
		}
	}

	@Override
	protected BasePhysisJSONTransformer createTransformer() {
		return new BooksTransformer();
	}

}
