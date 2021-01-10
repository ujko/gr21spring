package com.sda.gf23spring;

import com.sda.gf23spring.person.Dom;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class ProgStarter implements CommandLineRunner {

    Logger logger;

    @Autowired
    Dom dom;

    MessageSource messageSource;

    @Override
    public void run(String... args) throws Exception {
//        logger.info("Logger info");
//        logger.debug("Logger debug");
//        logger.warn("Logger warn");
//        logger.error("Logger error");
//        logger.trace("Logger trace");
        String test = messageSource.getMessage("pr.name", null, Locale.GERMAN);
        logger.info("{}", test);
        logger.info("{}", dom);
    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
