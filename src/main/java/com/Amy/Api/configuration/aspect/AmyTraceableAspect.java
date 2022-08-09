package com.Amy.Api.configuration.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AmyTraceableAspect {
    @Around("@annotation(com.Amy.Api.configuration.Amy)")
    public void executeAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("Usman Advice is useful for your future");
        point.proceed();


    }
}
