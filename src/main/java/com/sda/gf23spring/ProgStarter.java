package com.sda.gf23spring;

import com.sda.gf23spring.person.Person;
import com.sda.gf23spring.person.User;
import com.sda.gf23spring.person.UserRole;
import com.sda.gf23spring.repository.PersonDao;
import com.sda.gf23spring.repository.PersonDaoHibernate;
import com.sda.gf23spring.repository.UserDao;
import com.sda.gf23spring.repository.UserRoleDao;
import com.sda.gf23spring.service.PersonService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProgStarter implements CommandLineRunner {
    Logger logger;
    MessageSource messageSource;

    PersonService personService;
    PersonDao personDao;
    PersonDaoHibernate personDaoHibernate;
    UserRoleDao userRoleDao;
    UserDao userDao;

    @Override
    public void run(String... args) throws Exception {
        List<Person> all = personDao.getAll();
        personDaoHibernate.saveAll(all);

        List<Person> d = personDaoHibernate.pobierz("d", "t");
        d.forEach(System.out::println);

        User pawel = new User();
        pawel.setLogin("pawel");
        pawel.setPassword("$2a$10$LXatYAc.YlKZ2ZU/NP3hbONQG7mibqn8r1WEvVxVr47xTZykXe4Rm");
        pawel.setEnabled(true);
        userDao.save(pawel);

        User ania = new User();
        ania.setLogin("ania");
        ania.setPassword("$2a$10$bNZxnuPqFf/ZQm1PtUPKxe.6CbzyDzTjCZ46ihz4XiAG3CQlRObYu");
        ania.setEnabled(true);
        userDao.save(ania);
        UserRole pawelRoleAdmin = new UserRole();
        pawelRoleAdmin.setLogin("pawel");
        pawelRoleAdmin.setRole("ADMIN");
        userRoleDao.save(pawelRoleAdmin);
        UserRole aniaRoleUser = new UserRole();
        aniaRoleUser.setLogin("ania");
        aniaRoleUser.setRole("USER");
        userRoleDao.save(aniaRoleUser);
    }

    @Autowired
    public void setUserRoleDao(UserRoleDao userRoleDao) {
        this.userRoleDao = userRoleDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Autowired
    public void setPersonDaoHibernate(PersonDaoHibernate personDaoHibernate) {
        this.personDaoHibernate = personDaoHibernate;
    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Autowired
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
}
