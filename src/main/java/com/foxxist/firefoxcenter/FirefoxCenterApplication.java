package com.foxxist.firefoxcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FirefoxCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirefoxCenterApplication.class, args);
    }

}
