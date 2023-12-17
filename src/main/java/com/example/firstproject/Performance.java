package com.example.firstproject;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Performance {

    //@Around("execution(* com.example.firstproject.Application.home(..))")
    @Around("execution(* *..Application.home(..))")
    public Object calculatePerformance(ProceedingJoinPoint proceedingJoinPoint){
        Object result = null;
        try {
            long start = System.nanoTime();
            result = proceedingJoinPoint.proceed();
            long end = System.nanoTime();

            System.out.println("수행 시간 : " + (end-start)/1000000.0 + "초");
        } catch (Throwable e) {
            System.out.println("exception!");
        }
        return result;
    }

}