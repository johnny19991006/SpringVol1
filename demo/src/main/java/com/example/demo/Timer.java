package com.example.demo;



import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@Aspect
public class Timer {

    @Around("execution(* *..DemoApplication.doGetHelloWorld(..))")
    public Object calculatePerformance(ProceedingJoinPoint proceedingJoinPoint){
        Object time = null;
        try {
            long start = System.nanoTime();
            time = proceedingJoinPoint.proceed();
            long end = System.nanoTime();
            System.out.println("AOP : " + (end-start)+" ns");
        } catch (Throwable e) {
            System.out.println("ㅜㅜ");
        }
        return time;
    }

}
