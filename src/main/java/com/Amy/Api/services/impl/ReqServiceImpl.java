package com.Amy.Api.services.impl;

import com.Amy.Api.services.IReqService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class ReqServiceImpl implements IReqService {
    @Override
    public  String requestreceived(HttpServletRequest request){
        if(request.getHeader("user-agent").contains("Postman")){
            return "User has used Postman to proceed his request ";
        }
        else if(request.getHeader("user-agent").contains("Chrome")){
            return "User has used Chrome to proceed his request ";
        }
        else{
            return "User has something else to proceed his request ";
        }
    }

}
