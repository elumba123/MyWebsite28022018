/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.palogi.controller;

import nl.palogi.persistence.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author gino
 */
@Controller
public class SimpleController {

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }
    
    @PostMapping("/demonstration")
    public String name(@RequestParam String name, Model model) {
        Person p = new Person(name);
        model.addAttribute("person", p);
        return "demonstration";
    }
    
    @RequestMapping("/MainPage")
   public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "MainPage";
}
}