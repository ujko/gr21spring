package com.sda.gf23spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@PropertySource({"classpath:person.properties"})
@EnableScheduling
public class Gf23springApplication {

    public static void main(String[] args) {
        SpringApplication.run(Gf23springApplication.class, args);
    }

}
