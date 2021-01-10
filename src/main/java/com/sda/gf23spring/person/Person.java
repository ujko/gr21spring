package com.sda.gf23spring.person;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component("person")
//@DependsOn("personK")
public class Person implements PersonInt {
    @Value("${person.id}")
    private int personId;
    @Value("${person.name}")
    private String name;

    public Person() {
        System.out.println("Start klasy Person");
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }
}
