package com.sda.gf23spring.repository;

import com.sda.gf23spring.person.Person;

import java.time.LocalDate;
import java.util.List;

public interface PersonDao {
    List<Person> getAll();
    Person getById(int personId);
    List<Person> getByFistName(String firstName);
    List<Person> getByLastName(String lastName);
    List<Person> getByBirthDateBetween(LocalDate from, LocalDate to);
    List<Person> getBySalaryBetween(double from, double to);

    Person add(Person person);
    Person modify(int personId, Person person);
    Person remove(int personId);
}
