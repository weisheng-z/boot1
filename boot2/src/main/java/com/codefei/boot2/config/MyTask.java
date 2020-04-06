package com.codefei.boot2.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyTask {


    @Scheduled(cron = "0 * 16 4 4 ?")
    public void test() {
        System.out.println("quartz-------test");
    }
}
