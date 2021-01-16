package com.sda.gf23spring.controller;

import com.sda.gf23spring.person.Person;
import com.sda.gf23spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/personsServlet")
public class PersonServlet extends HttpServlet {
    PersonService personService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html><head><title>Test Person Servlet</title></head>");
        writer.println("<body>");

        writer.println("<h1>Persons</h1>");
        writer.println("<table>");
        writer.println("<thead>");
        writer.println("<th>ID</><th>Imie</><th>Nazwisko</>");
        writer.println("</thead>");
        writer.println("<tbody>");
        List<Person> personList = personService.getAll();

        personList
                .stream()
                .map(this::createPerson)
                .forEach(x -> writer.println(x));
        writer.println("</tbody>");
        writer.println("</table>");

        writer.println("</body></html>");
    }

    private String createPerson(Person person) {
        String result = "<tr><td>" + person.getPersonId() + "</td><td>" + person.getFirstName() + "</td><td>" +person.getLastName() + "</td></tr>";
        return result;
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
}
