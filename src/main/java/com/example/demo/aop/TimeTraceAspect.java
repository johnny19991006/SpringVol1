package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class TimeTraceAspect {
    @Pointcut("@annotation(com.example.demo.aop.TimeTrace)")
    private void timeTracePointcut() {
    }

    @Around("timeTracePointcut()")
    public Object traceTime(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();

        try {
            stopWatch.start();
            return joinPoint.proceed();
        } finally {
            stopWatch.stop();
            System.out.printf("%s - Total time = %fs\n",
                    joinPoint.getSignature().toShortString(),
                    stopWatch.getTotalTimeSeconds());
        }
    }
}
