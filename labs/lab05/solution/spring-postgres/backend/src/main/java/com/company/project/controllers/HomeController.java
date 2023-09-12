package com.company.project.controllers;

import com.company.project.entity.Greeting;
import com.company.project.entity.Thing;
import com.company.project.repository.GreetingRepository;
import com.company.project.repository.ThingRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private GreetingRepository repository;
    @Autowired
    private ThingRepository thingRepository;

    @GetMapping("/")
    public String showHome(String name, Model model) {
        Greeting dockerGreeting = repository.findById(1).orElse(new Greeting("Not Found 😕"));
        model = model.addAttribute("name", dockerGreeting.getName());
        return "home";
    }

    @GetMapping("/things")
    public String showThings(Model model) {
        List<Thing> list = new ArrayList<>();
        thingRepository.findAll().forEach(list::add);
        model = model.addAttribute("things", list);
        return "things";
    }

}
