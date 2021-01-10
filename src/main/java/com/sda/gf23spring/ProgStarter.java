package com.sda.gf23spring;

import com.sda.gf23spring.repository.PersonDao;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class ProgStarter implements CommandLineRunner {
    Logger logger;
    MessageSource messageSource;

    PersonDao personDao;

    @Override
    public void run(String... args) throws Exception {
        personDao.getAll().forEach(System.out::println);
    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Autowired
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }
}
