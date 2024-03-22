package com.javaex.ex06;

public class CConverterApp {
    public static void main(String[] args) {
        double dollar = 1_000_000;
        double won = 100;
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        System.out.printf("백만원은 %,.13f달러입니다", CConverter.toDoller(dollar));
        
        //100달려를 원으로 출력하기
        System.out.printf("\n백달러는 %,.1f원입니다", CConverter.toKWR(won));
    }
}