package com.cg.lab.dao;

import com.cg.lab.dto.Book;

public interface AuthorBookDao {
	public Book saveBook(Book book);
	public boolean deleteBook(int bookId);
	public Book findBook(int bookId);
}
