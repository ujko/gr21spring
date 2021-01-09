package com.sda.gf23spring.configuration;

import com.sda.gf23spring.person.Dom;
import com.sda.gf23spring.person.Person;
import com.sda.gf23spring.person.PersonInt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Autowired
    PersonInt personInt;

    @Bean(initMethod = "init", destroyMethod = "end")
    public Dom createDom(Logger logger) {
        Dom dom = new Dom();
        dom.setId(1);
//        dom.setLogger(logger);
        logger.info("createDom");
        dom.setPerson(personInt);
        return dom;
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Logger getLogger(InjectionPoint injectionPoint) {
        return LoggerFactory.getLogger(injectionPoint.getMethodParameter().getContainingClass());
    }

    @Bean
    @Profile("dev")
    public PersonInt getPerson1(@Value("${person.id}") int personId, @Value("${person.name}") String personName) {
        PersonInt person = new Person();
        person.setPersonId(personId);
        person.setName(personName);
        return person;
    }
    @Bean
    @Profile("prod")
    public PersonInt getPerson2(@Value("${person.id}") int personId, @Value("${person.name}") String personName) {
        PersonInt person = new Person();
        person.setPersonId(personId);
        person.setName(personName);
        return person;
    }

}
