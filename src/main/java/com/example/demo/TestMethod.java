package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class TestMethod {
    public void timeTraceMethod1() {
        System.out.println("나의 이름은 홍길동입니다.");
        try {
            Thread.sleep(2000); //시간지연
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void timeTraceMethod2() {
        System.out.println("나의 이름은 김철수입니다.");
        try {
            Thread.sleep(1500); //시간지연
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void timeTraceMethod3() {
        System.out.println("나의 이름은 박옥순입니다.");
        try {
            Thread.sleep(1300); //시간지연
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
