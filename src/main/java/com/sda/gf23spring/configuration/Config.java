package com.sda.gf23spring.configuration;

import com.sda.gf23spring.person.Dom;
import com.sda.gf23spring.person.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

//    @Autowired
//    Person person;

//    @Bean(initMethod = "init", destroyMethod = "end")
//    public Dom createDom(Logger logger) {
//        Dom dom = new Dom();
//        dom.setId(1);
////        dom.setLogger(logger);
//        logger.info("createDom");
//        dom.setPerson(person);
//        return dom;
//    }

//    @Bean("logger")
//    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
//    public Logger getLogger(InjectionPoint injectionPoint) {
//        return LoggerFactory.getLogger(injectionPoint.getMethodParameter().getContainingClass());
//    }


}
