package com.shgxzybaba.htmx_poc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SimpleController {

    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/greet")
    public String greet() {
        return "greetings";
    }

    
}
