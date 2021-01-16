package com.sda.gf23spring;

import com.sda.gf23spring.service.PersonService;
import com.sda.gf23spring.service.PersonServiceImpl;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class ProgStarter implements CommandLineRunner {
    Logger logger;
    MessageSource messageSource;

    PersonServiceImpl personService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(personService.getByFistName("Tate"));
        personService.timer();
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
    public void setPersonService(PersonServiceImpl personService) {
        this.personService = personService;
    }
}
