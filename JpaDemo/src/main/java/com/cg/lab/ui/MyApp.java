package com.cg.lab.ui;

import java.util.ArrayList;
import java.util.List;

import com.cg.lab.dao.AuthorBookDao;
import com.cg.lab.dto.Author;
import com.cg.lab.dto.Book;
import com.cg.lab.service.AuthorBookService;
import com.cg.lab.service.AuthorBookServiceImpl;

public class MyApp {
public static void main(String args[])
{
	AuthorBookService service=new AuthorBookServiceImpl();
	List<Author> authorList=new ArrayList<Author>();
	Author a=new Author();
	a.setAuthorId(1);
	a.setAuthorName("aaaaaaaaaa");
	a.setBookList(null);
	authorList.add(a);
	Book book=new Book();
	book.setIsbn(1);
	book.setBookNamee("abc");
	book.setBookPrice(100.0);
	book.setAuthorList(authorList);
	service.saveBook(book);
	
}
}
