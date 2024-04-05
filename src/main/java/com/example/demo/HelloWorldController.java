package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {
//    @RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
//    public String helloWorld(){
//        return "hello world";
//    }
    @GetMapping(path = "/ciao")
    public String ciao(@RequestParam String nome, @RequestParam String provincia){
        return "ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}
