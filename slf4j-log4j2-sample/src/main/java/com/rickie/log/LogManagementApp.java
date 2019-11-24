package com.rickie.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LogManagementApp
{
    public static void main( String[] args ) {
        ConfigurableApplicationContext context = SpringApplication.run(LogManagementApp.class, args);
        MyBean bean = context.getBean(MyBean.class);
        bean.doSomething();
    }
}
