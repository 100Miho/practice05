package com.javaex.ex10;

public class Book {
    private int bookNo;
    private String title;
    private String author;
    private int stateCode=1;
    
    public Book() {}
    public Book(int bookNo, String title, String author) {
    	this.bookNo=bookNo;
    	this.title=title;
    	this.author=author;
    }
    
    public void setBookNo(int bookNo) {
    	this.bookNo=bookNo;
    }
    public int getBookNo() {
    	return bookNo;
    }
    public void setTitle(String title) {
    	this.title=title;
    }
    public String getTitle() {
    	return title;
    }
    public void setAuthor(String author) {
    	this.author=author;
    }
    public String getAuther() {
    	return author;
    }
    
    public void rent(int num) {
    	System.out.printf("\"%s\"이(가) 대여되었습니다.\n\n", title);
    	this.stateCode=0;
    }
    
    public void print() {
    	String state = this.stateCode == 1 ? "재고 있음" : "대여중";
    	System.out.printf("%d 책 제목: %s, 작가: %s, 대여 유무: %s%n", this.bookNo, this.title, this.author, state);
    }
}
