package it.aulab.progetto_finale.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ch.qos.logback.core.model.Model;

@Controller
public class ExceptionHandlingController {

    @GetMapping("/error/{number}")
    public String accessDenied(@PathVariable int number, Model model){
        if (number == 403) {
            return "redirect:/?notAuthorized";
        }
        return "redirect:/";
    }

}
