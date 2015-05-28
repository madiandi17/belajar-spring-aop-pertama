package com.wordpress.bmadi.belajar.spring.aop.pertama.main;

import com.wordpress.bmadi.belajar.spring.aop.pertama.TargetObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTanpaAop {

    public static void main(String[] args) {
        ApplicationContext ctx = 
                new ClassPathXmlApplicationContext("classpath:aop.xml");
        TargetObject to = (TargetObject) ctx.getBean("targetObject");
        String hasil = to.hallo("Madi Andi");
        System.out.println(hasil);
    }
}
