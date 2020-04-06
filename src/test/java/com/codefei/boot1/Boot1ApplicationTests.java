package com.codefei.boot1;

import com.codefei.boot1.common.MyTask;
import com.codefei.boot1.config.MyDataSourceProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Boot1ApplicationTests {

    @Autowired
    private MyTask task;
    @Autowired
    private MyDataSourceProperties ms;
    @Test
    void contextLoads() {
        System.out.println(ms);
        task.test();
    }

}
