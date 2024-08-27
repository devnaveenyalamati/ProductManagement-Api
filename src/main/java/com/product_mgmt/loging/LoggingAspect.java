package com.product_mgmt.loging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.product_mgmt.service.ProductService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Executing method: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* com.product_mgmt.service.ProductService.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("Method " + joinPoint.getSignature().getName() + " returned " + result);
    }

    @Around("execution(* com.product_mgmt.service.ProductService.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Method " + joinPoint.getSignature().getName() + " execution start");
        Object result = joinPoint.proceed();
        System.out.println("Method " + joinPoint.getSignature().getName() + " execution end");
        return result;
    }
}

