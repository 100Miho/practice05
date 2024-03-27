package com.javaex.ex06;

public class CConverterApp {
    public static void main(String[] args) {
//        double dollar = 100;
//        double won = 1_000_000;
//        
//        CConverter.setRate(1341.40);	// 환욜 세팅
//        
//        //100만원을 달러로 출력하기
//        System.out.printf("백만원은 %,.13f달러입니다", CConverter.toDoller(won));
//        
//        //100달려를 원으로 출력하기
//        System.out.printf("\n백달러는 %,.1f원입니다", CConverter.toKWR(dollar));
    	
    	double dollar;
    	double won;
    	
        CConverter.setRate(1341.40);	// 환욜 세팅
        
    	dollar = CConverter.toDoller(1_000_000);
    	System.out.printf("백만원은 %f달러입니다.", dollar);

    	won = CConverter.toKWR(100);
    	System.out.printf("\n달러는 %f달러입니다.", won);
    }
}