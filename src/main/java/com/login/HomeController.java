package com.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {return "Home,home!";}

    @GetMapping("/secured")
    public String secured() {return "Secured,secured!";}
}
