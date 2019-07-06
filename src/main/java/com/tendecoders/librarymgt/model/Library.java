package com.tendecoders.librarymgt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Library {
		@Id
		@GeneratedValue
		private int id;
		
		@Column(name = "bookName")
		private String bookName;
		@Column(name = "bookPrice")
		private int bookPrice;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public int getBookPrice() {
			return bookPrice;
		}
		public void setBookPrice(int bookPrice) {
			this.bookPrice = bookPrice;
		}
		@Override
		public String toString()
		{
			return "subject [id=" +id+ ", bookName="+bookName+ ", authorName="+ ", bookPrice="+bookPrice+ "]";
		}

	}
