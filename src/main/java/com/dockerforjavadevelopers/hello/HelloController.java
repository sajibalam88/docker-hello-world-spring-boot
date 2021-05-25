package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String index() {
        return "Hello All\n";
    }
    @RequestMapping("/hi")
    public String hi() {
        return "Hi World\n";
    }
    
}
