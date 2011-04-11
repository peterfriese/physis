package de.itemis.mobile.physis.sample.books;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.reflect.TypeToken;
import com.itemis.mobile.physis.android.BasePhysisJSONTransformer;

public class BooksTransformer extends BasePhysisJSONTransformer<List<Book>> {

	@Override
	protected Type getGenericType() {
		return new TypeToken<List<Book>> () {}.getType();
	}

}
