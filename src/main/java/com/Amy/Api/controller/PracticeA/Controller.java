package com.Amy.Api.controller.PracticeA;

import com.Amy.Api.configuration.Traceable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {
    //Api for returning sum of two integers
   /* @GetMapping("/Numbers")
    public int getIntegers(@RequestParam("no1")int number1,
                           @RequestParam("no2")int number2) {

        int sum = number1 + number2;

        return sum;
    }*/
    //Api for returning welcomw with a particular name
    /*@GetMapping("/WelcomeMessege")
    public String getName(@RequestParam("name")String name){

        return "Welcome " +name;

    }*/

    @GetMapping("/req")
    @Traceable(value = "data", required = false)
    public String requestReceived(HttpServletRequest request) {
        if(request.getHeader("user-agent").contains("Postman"))
            return "request received from postman";
        else if(request.getHeader("user-agent").contains("Chrome"))
            return "reqeust received from Chrome";
        else
            return "request received from somewhere else";
    }

}
