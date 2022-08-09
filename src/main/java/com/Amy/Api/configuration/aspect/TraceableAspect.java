package com.Amy.Api.configuration.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TraceableAspect {

    @Around("@annotation(com.Amy.Api.configuration.Traceable)")
    public void runAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("Amna Advice");
        point.proceed();
    }

}
