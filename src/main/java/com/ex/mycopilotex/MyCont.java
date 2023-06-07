package com.ex.mycopilotex;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCont {
   /*create a controller */ 

    @RequestMapping("/hello")
   public String hello() {
      return "Hello World";
   }
   


}