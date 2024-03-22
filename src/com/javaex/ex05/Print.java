package com.javaex.ex05;

// 메서드 오버로드

public class Print {
    public void printer(int val){
        System.out.println(val);
    }

    //메소드  3개 를 작성하세요
    public void printer(boolean val) {
    	System.out.println(val);
    }
    
    public void printer(double val) {
    	System.out.println(val);
    }
    
    public void printer(String val) {
    	System.out.println(val);
    }
}
