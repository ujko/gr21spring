package com.sda.gf23spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PersonController {

    @GetMapping("/spersons")
    public String getAllPersons(Model model) {
        model.addAttribute("hello", "Persons");
        return "index";
    }

}
