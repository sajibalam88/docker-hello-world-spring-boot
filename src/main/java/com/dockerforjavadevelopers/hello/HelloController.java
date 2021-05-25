package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String index() {
        return "Hello World\n";
    }
    @RequestMapping("/hi")
    public String index() {
        return "Hi World\n";
    }
    
}
