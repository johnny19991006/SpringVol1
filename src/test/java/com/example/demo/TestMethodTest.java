package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class TestMethodTest {
    @Test
    void timeTraceMethode(){
        //스프링 컨테이너 생성
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("com.example.demo");
        context.refresh();

        // 스프링 빈 사용
        TestMethod testMethod = context.getBean(TestMethod.class);
        testMethod.timeTraceMethod();

        context.close();
    }
}