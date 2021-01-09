package com.sda.gf23spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(value = {"com.sda.testOutsider", "com.sda.gf23spring"})
@PropertySource({"classpath:person.properties"})
public class Gf23springApplication {

    public static void main(String[] args) {
        SpringApplication.run(Gf23springApplication.class, args);
    }

}
