package com.sda.gf23spring.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dom {
    private int id = 4;

//    @Autowired
    private Person person;

//    public Dom() {
////        this.person = person;
//        System.out.println("Person z konstruktora " + person);
//    }

    @PostConstruct
    public void init() {
        System.out.println("Person z metody init " + person);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("tu zamykam dom");
    }

    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

//    public Dom(Person person) {
//        this.person = person;
//    }

//    @Autowired
//    public void setPerson(Person person) {
//        this.person = person;
//    }

    @Override
    public String toString() {
        return "Dom{" +
                "id=" + id +
                ", person=" + person +
                '}';
    }
}
