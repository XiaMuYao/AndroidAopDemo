package com.lqr.androidaopdemo;

import android.os.SystemClock;
import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

@Aspect
public class TestAnnoAspect {

    // TODO: 2018/11/26 这里你要修改成你项目里面这个类的地址

    @Pointcut("execution(@com.lqr.androidaopdemo.IsLogin * *(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void before(JoinPoint point) {
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        Log.d("XiaMuYao", "around: 方法触发之前被我拦截了");
        Log.d("XiaMuYao", "around: 判断登录");

//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        Method method = signature.getMethod();
//        IsLogin annotation = method.getAnnotation(IsLogin.class);
//
//        String value = annotation.value();
//        int type = annotation.type();

        // TODO: 2018/11/26 这个判断是你要根据什么本地没有token什么的去做 是否登录了
        if (false) {
            //登录了 放行方法
            joinPoint.proceed();
        } else {
            Log.d("XiaMuYao", "around: 去登陆的操作");
        }

    }

    @After("pointcut()")
    public void after(JoinPoint point) {
    }

    @AfterReturning("pointcut()")
    public void afterReturning(JoinPoint point, Object returnValue) {
    }

    @AfterThrowing(value = "pointcut()", throwing = "ex")
    public void afterThrowing(Throwable ex) {
    }

}
