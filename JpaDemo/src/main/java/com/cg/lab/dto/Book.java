package com.cg.lab.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@Entity
public class Book {
	@Id
	@Column(name="book_id")
	private Integer isbn;
	private String bookNamee;
	private Double bookPrice;
	@ManyToMany(mappedBy = "bookList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Author> authorList;
	
	public Book()
	{
		
	}

	public Book(Integer isbn, String bookNamee, Double bookPrice, List<Author> authorList) {
		super();
		this.isbn = isbn;
		this.bookNamee = bookNamee;
		this.bookPrice = bookPrice;
		this.authorList = authorList;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public String getBookNamee() {
		return bookNamee;
	}

	public void setBookNamee(String bookNamee) {
		this.bookNamee = bookNamee;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public List<Author> getAuthorList() {
		return authorList;
	}

	public void setAuthorList(List<Author> authorList) {
		this.authorList = authorList;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookNamee=" + bookNamee + ", bookPrice=" + bookPrice + ", authorList="
				+ authorList + "]";
	}
	
	
	

}
