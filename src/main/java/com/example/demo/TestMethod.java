package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class TestMethod {
    public void timeTraceMethod() {
        System.out.println("나의 이름은 홍길동입니다.");
        try {
            Thread.sleep(2000); //시간지연
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
