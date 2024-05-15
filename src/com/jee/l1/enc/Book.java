package com.jee.l1.enc;

public class Book {
 int price, pages;
 String title, author, discription, publication;

public void setPrice(int price) {
	this.price = price;
}
public void setPages(int pages) {
	this.pages = pages;
}
public void setTitle(String title) {
	this.title = title;
}

public void setAuthor(String author) {
	this.author = author;
}
public void setDiscription(String discription) {
	this.discription = discription;
}
public void setPublication(String publication) {
	this.publication= publication;
}

public int getPrice() {
	return this.price;
}
public int getPages() {
	return this.pages;
}

public String getTitle() {
	return this.title;
}
public String getDiscription() {
	return this.discription;
}

public String getPublication() {
	return this.publication;
}

public String toString() {
	return "Price : " + this.price + "\n pages : "+ this.pages + "\n title :" + this.title +
			"\n Discription : " + this.discription + "\n publication : "+ this.publication;
}



}
