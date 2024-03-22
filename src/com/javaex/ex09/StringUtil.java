package com.javaex.ex09;

public class StringUtil {
    public static String concatString(String[] strArray){
        //메소드 내용작성
    	String str = "";
    	for(String val : strArray) {
    		str += val;
    	}
    	return str;
    }
}