package com.Amy.Api.controller.PracticeA;

import com.Amy.Api.services.IReqService;
import com.Amy.Api.services.impl.ReqServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ReqController {
    @Autowired
    IReqService rs;

    @GetMapping("/reqs")
    public String requestreceived(HttpServletRequest request){
        return rs.requestreceived(request);

    }

}
