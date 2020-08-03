package com.wyq.springboot_learning.component;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {
    /**
     * execution(public * com.wyq.springboot_learning..*.*(..))
     * 第一个 * 方法的返回值
     * 第一个..代表的是springboot_learning下的子包
     * 第二个*代表任意包名
     * 第三个*代表的是方法名
     * 第二个.. 代表的是方法的参数
     */
    @Pointcut("execution(public * com.wyq.springboot_learning..*.*(..))")
    public void sayHello(){
    }
    /**
     * 设置前置通知
     */
    @Before("sayHello()")
    public void doBefore(){
        System.out.println("hello world-------------");
    }
}
