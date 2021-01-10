package com.sda.gf23spring.person;

import org.slf4j.Logger;

public class Dom {
    Logger logger;
    private int id;
    private PersonInt personInt;

    public Dom(int id, PersonInt personInt) {
        this.id = id;
        this.personInt = personInt;
    }

    public void init() {
        logger.info("Metoda init klasy Dom");
    }

    public void end() {
        logger.info("Kończę zmianę");
    }

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
}
