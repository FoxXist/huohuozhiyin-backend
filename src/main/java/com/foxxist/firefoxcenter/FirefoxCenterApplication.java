package com.foxxist.firefoxcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class FirefoxCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirefoxCenterApplication.class, args);
        System.out.println("\uD83D\uDE80 Football Club Management System Started Successfully! ⚽");
    }

}
