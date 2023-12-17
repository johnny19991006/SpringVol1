package com.example.SpringVol1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimingAspect {

    private long startTime;

    @Before("execution(* com.example.SpringVol1..*.*(..))")
    public void before(JoinPoint joinPoint) {
        startTime = System.currentTimeMillis();
        System.out.println("Method " + joinPoint.getSignature().toShortString() + " start");
    }

    @After("execution(* com.example.SpringVol1..*.*(..))")
    public void after(JoinPoint joinPoint) {
        long endTime = System.currentTimeMillis();
        System.out.println("Method " + joinPoint.getSignature().toShortString() + " execution time: " + (endTime - startTime) + " milliseconds");
    }
}
