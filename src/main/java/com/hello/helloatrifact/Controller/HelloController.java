package com.hello.helloatrifact.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    public String sayHello(){

        System.out.println("I am saying hello from Controller");

        return "Hello Folks!!";
    }
}
