package com.zhouyu.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 统计方法耗时切面
 */
@Aspect
@Component
public class AuditAspect {

	@Pointcut("execution(* com.zhouyu.service.*.*(..))")
	public void pointcut() {
	}

	@Around("pointcut()")
	public void audit(ProceedingJoinPoint joinPoint) throws Throwable {
		final long start = System.currentTimeMillis();
		final Object result = joinPoint.proceed();
		final long duration = System.currentTimeMillis() - start;
		System.err.println("#########AuditAspect#$audit() execute cost:" + duration + "########");
	}
}
