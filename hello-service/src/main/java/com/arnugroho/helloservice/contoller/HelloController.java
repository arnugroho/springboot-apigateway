package com.arnugroho.helloservice.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/katakan")
    public String sayHello(){
      return "Hello World";
    }

    @GetMapping("/katakan/{nama}")
    public String sayHello(@PathVariable String nama){
        return "Hello World : " + nama;
    }
}
