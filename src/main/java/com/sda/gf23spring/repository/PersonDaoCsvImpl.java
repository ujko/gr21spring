package com.sda.gf23spring.repository;

import com.sda.gf23spring.person.Person;
import com.sda.gf23spring.utils.Utils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PersonDaoCsvImpl implements PersonDao {
    private Map<Integer, Person> personMap = new HashMap<>();
    @Value("${persons.size}")
    private int personsSize;

    @PostConstruct
    public void initPersonMap() throws IOException {
        Files
                .lines(Path.of("persons.csv"))
                .map(x -> x.split(","))
                .map(x -> new Person(x[0], x[1], LocalDate.parse(x[2], Utils.DATE_FORMAT), Double.parseDouble(x[3])))
                .limit(personsSize)
                .forEach(x -> add(x));
    }

    @Override
    public List<Person> getAll() {
        return new ArrayList<>(personMap.values());
    }

    @Override
    public Person getById(int personId) {
        return null;
    }

    @Override
    public List<Person> getByFistName(String firstName) {
        return null;
    }

    @Override
    public List<Person> getByLastName(String lastName) {
        return null;
    }

    @Override
    public List<Person> getByBirthDateBetween(LocalDate from, LocalDate to) {
        return null;
    }

    @Override
    public List<Person> getBySalaryBetween(double from, double to) {
        return null;
    }

    @Override
    public Person add(Person person) {
        int personId = generatePersonId();
        person.setPersonId(personId);
        personMap.put(person.getPersonId(), person);
        return person;
    }

    private int generatePersonId() {
        int maxId = personMap
                .keySet()
                .stream()
                .mapToInt(x -> x)
                .max()
                .orElse(0);
        return maxId + 1;
    }

    @Override
    public Person modify(int personId, Person person) {
        return null;
    }

    @Override
    public Person remove(int personId) {
        return null;
    }
}
