package com.nanchaos.tech.config.aop;

import com.alibaba.fastjson.JSON;
import com.nanchaos.tech.config.aop.ann.AppInterfaceLog;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.Objects;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/8
 * @time 09:53
 */
@Slf4j
@Aspect
@Component
public class AppInterfaceLogAdvice {

    @Pointcut("execution(* com.nanchaos.tech.service..*(..))")
    public void pointcutService() {
    }

    @Pointcut("@annotation(com.nanchaos.tech.config.aop.ann.AppInterfaceLog)")
    public void pointcutAppInterfaceLog() {
    }

    @Around("pointcutService()|| pointcutAppInterfaceLog()")
    public Object around(ProceedingJoinPoint joinPoint) {
        log.info("AppInterfaceLogAdvice.around.start");

        // traceLogId替换 略。。。
        // 耗时监控
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object result = null;
        boolean isPrintAsJson = false, useDefaultErrorResp = false;
        long alarmThreshold = 300L;
        String methodName = "UNKNOWN", className = null;
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;

        if (methodSignature != null) {
            AppInterfaceLog annotation = methodSignature.getMethod().getAnnotation(AppInterfaceLog.class);
            if (annotation != null) {
                alarmThreshold = annotation.alarmThreshold();
                isPrintAsJson = annotation.printJSON();
                useDefaultErrorResp = annotation.useDefaultErrorResp();
            }
            className = joinPoint.getTarget().getClass().getName();
            methodName = methodSignature.getName();
        }

        log.info("AppName AppInterfaceLogAdvice.around.process, current is {}.{}, threadHold is:{}, args is:{}", className, methodName, alarmThreshold, isPrintAsJson ? JSON.toJSONString(joinPoint.getArgs()) : joinPoint.getArgs());

        try {
            result = joinPoint.proceed();
            log.info("AppName AppInterfaceLogAdvice.around.finish, current is {}.{}", className, methodName);
        } catch (Throwable throwable) {
            // 使用标准错误返回，略
            if (useDefaultErrorResp) result = null;
            log.error("AppName AppInterfaceLogAdvice.around.error, cause:{}", ExceptionUtils.getStackTrace(throwable));
        }
        stopWatch.stop();
        log.info("AppName AppInterfaceLogAdvice.around.end, current is {}.{}, time used:[{}ms],result is:{}", className, methodName, stopWatch.getTotalTimeMillis(), result);
        return result;
    }
}
