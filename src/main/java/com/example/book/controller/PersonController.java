package com.example.book.controller;

import com.example.book.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.Arrays;

@Controller
public class PersonController {
    @GetMapping("/person")
    public String index(Model model)
    {
        model.addAttribute("title","Demo Thymeleaf");

        Person p = new Person();
        p.setName("Thymeleaf Spring Boot");
        p.setAge(36);
        p.setSex(1);
        p.setMarried(true);
        p.setCreateTime(LocalDate.now());
        p.setLanguage(Arrays.asList("Java","C#","Python"));
                model.addAttribute("person", p);
        return "person";
    }
}