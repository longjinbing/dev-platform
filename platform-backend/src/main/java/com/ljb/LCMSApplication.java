package com.ljb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author longjinbin
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class LCMSApplication
{
    public static void main(String[] args)
    {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(LCMSApplication.class, args);
    }
}
