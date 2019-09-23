package com.cg.lab.service;

import com.cg.lab.dao.AuthorBookDao;
import com.cg.lab.dao.AuthorBookImpl;
import com.cg.lab.dto.Book;

public class AuthorBookServiceImpl implements AuthorBookService{

	AuthorBookDao dao=new AuthorBookImpl();
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return dao.saveBook(book);
	}

	public boolean deleteBook(int bookId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Book findBook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
