package com.oracle.microsvctk.demo;
  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
  
@RestController
public class HelloController {  
    @RequestMapping("/hello")  
    String greeting() {  
        return "Hello from  Oracle Microservice Development Toolkit!";
    }
}