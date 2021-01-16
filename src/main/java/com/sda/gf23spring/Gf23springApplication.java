package com.sda.gf23spring;

import com.sda.gf23spring.controller.PersonServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:person.properties"})
@ServletComponentScan(basePackageClasses = PersonServlet.class)
public class Gf23springApplication {

    public static void main(String[] args) {
        SpringApplication.run(Gf23springApplication.class, args);
    }

}
