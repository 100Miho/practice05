package com.javaex.ex01;

public class MemberApp {
	public static void main(String[] args) {
		showInfo("정우성", "jws", 50000);
		showInfo("유재석", "yjs", 30000);
		showInfo("이효리", "lhr", 40000);
	}
	
	static void showInfo(String name, String id, int point) {
		System.out.printf("회원정보: %s(%s), %d점\n", name, id, point);
	} 
}