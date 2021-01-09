package com.sda.gf23spring;

import com.sda.gf23spring.person.Dom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProgStarter implements CommandLineRunner {

    @Autowired
    Dom dom;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(dom);
    }
}
