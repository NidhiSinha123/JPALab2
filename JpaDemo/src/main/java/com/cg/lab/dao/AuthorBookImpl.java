package com.cg.lab.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.lab.dto.Book;

public class AuthorBookImpl implements AuthorBookDao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("bookAuthor");
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Book newbook=em.merge(book);
		em.persist(newbook);
		tx.commit();
		return newbook;
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
