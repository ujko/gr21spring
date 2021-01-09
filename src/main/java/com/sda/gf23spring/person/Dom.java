package com.sda.gf23spring.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Dom {
    private int id = 4;

    private PersonInt personInt;

    @Autowired
    @Qualifier("adam")
    public void setPerson( PersonInt personInt) {
        this.personInt = personInt;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "id=" + id +
                ", person=" + personInt +
                '}';
    }
}
