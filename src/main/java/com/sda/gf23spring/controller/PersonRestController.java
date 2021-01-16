package com.sda.gf23spring.controller;

import com.sda.gf23spring.person.Person;
import com.sda.gf23spring.service.PersonService;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonRestController {
    PersonService personService;
    Logger logger;

    public PersonRestController(PersonService personService, Logger logger) {
        this.personService = personService;
        this.logger = logger;
    }

    @GetMapping("/persons")
    public List<Person> getAllPerson() {
        logger.info("Get all Persons");
        return personService.getAll();
    }

    @GetMapping("/person/id/{id}")
    public Person getPersonById(@PathVariable("id") int personId) {
        logger.info("Get person by id {}", personId);
        return personService.getById(personId);
    }

    @GetMapping("/person/byFirstName")
    public List<Person> getByFirstName(@RequestParam("firstName") String firstName) {
        logger.info("Get person by first name: {}", firstName);
        return personService.getByFistName(firstName);
    }

    @GetMapping("/person/byFirstAndLastName")
    public List<Person> getByFirstAndLastName(@RequestParam("fn") String firstName, @RequestParam("ln") String lastName) {
        return personService.getByFirstNameAndLastName(firstName, lastName);
    }

    @GetMapping("/person/byFirstAndLastNameP/{ln}")
    public List<Person> getByFirstAndLastName1(@RequestParam("firstName") String firstName, @PathVariable("ln") String lastName) {
        return personService.getByFirstNameAndLastName(firstName, lastName);
    }

    @GetMapping("/person/byDateBetween")
    public List<Person> getByDateBetween(@RequestParam(value = "from",defaultValue = "") String from, @RequestParam(value = "to", defaultValue = "") String to) {
        logger.info("from: {}, to: {}", from, to);
        return personService.getByBirthDateBetween(from, to);
    }

    @GetMapping("/person/delete/{id}")
    public Person removePerson(@PathVariable("id") int personId) {
        return personService.remove(personId);
    }
}
