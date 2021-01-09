package com.sda.gf23spring.person;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class Dom {
    Logger logger;
    private int id;

    private PersonInt personInt;

    public void setPerson(PersonInt personInt) {
        this.personInt = personInt;
    }

    public void init() {
        logger.info("Metoda init klasy Dom");
    }

    public void end() {
        logger.info("Kończę zmianę");
    }

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "id=" + id +
                ", person=" + personInt +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }
}
