package com.Amy.Api.controller.PracticeA;

import com.Amy.Api.configuration.Amy;
import com.Amy.Api.services.IRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Amy(val = "requestdata", required = false)
public class RequestController {
    @Autowired
    IRequestService rs;
    @GetMapping("/requestlang")
    @Amy(val = "requestdata", required = false)
    public String request(HttpServletRequest request){
        return rs.request(request);


    }
}
