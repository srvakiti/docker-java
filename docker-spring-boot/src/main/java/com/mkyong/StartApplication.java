package com.mkyong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/srinivas")
    public String index(final Model model) {
        model.addAttribute("title", "Docker + Spring Boot");
        model.addAttribute("msg", "Welcome to the docker container!");
        model.addAttribute("cloud", "GCP CLOUD Run Service!");
      
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
