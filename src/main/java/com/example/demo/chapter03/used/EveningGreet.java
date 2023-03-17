package com.example.demo.chapter03.used;

/**
 * Greet 구현 클래스<br>
 * 저녁 인사하기
 */
public class EveningGreet implements Greet {
    @Override
    public void greeting() {
        System.out.println("--------------------");
        System.out.println("편안한 저녁입니다.");
        System.out.println("--------------------");
    }
}
