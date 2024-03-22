package com.javaex.ex02;

public class Goods {
	// Field (Member Variable)
	private String name;
	private int price;
	
	// 생성자
	public Goods() {}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 게터, 세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메서드
	public void showInfo() {
		System.out.printf("상품명: %s, 가격: %d%n", name, price);
	}
}