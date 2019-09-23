package com.cg.lab.service;

import com.cg.lab.dto.Book;

public interface AuthorBookService {
	public Book saveBook(Book book);
	public boolean deleteBook(int bookId);
	public Book findBook(int bookId);
}
