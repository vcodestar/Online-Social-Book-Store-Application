package app.bookstore.socialbookstore.searchstrategy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import app.bookstore.socialbookstore.domain.Book;
import app.bookstore.socialbookstore.services.BookService;

public class BookAuthorInexactStrategy implements SearchEngineStrategy{
	
	@Override
	public List<Book> executeSearch(String query,BookService bookService) {
	
		return bookService.getByInexactAuthorName(query);
		
	}

}