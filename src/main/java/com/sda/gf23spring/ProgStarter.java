package com.sda.gf23spring;

import com.sda.gf23spring.person.Dom;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProgStarter implements CommandLineRunner {

    Logger logger;

    @Autowired
    Dom dom;

    @Override
    public void run(String... args) throws Exception {
//        logger.info("Logger info");
//        logger.debug("Logger debug");
//        logger.warn("Logger warn");
//        logger.error("Logger error");
//        logger.trace("Logger trace");
        logger.info("{}", dom);
    }

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
