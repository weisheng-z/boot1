package com.codefei.boot1.config;

import com.codefei.boot1.common.MyTask;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:aa.properties")
public class MyConfig {

    @Value("${taskName}")
    private  String taskName;

    @Bean
    public MyTask CreateMyTaskBean(){
        System.out.println(taskName+"---");
        return  new MyTask();
    }

}
