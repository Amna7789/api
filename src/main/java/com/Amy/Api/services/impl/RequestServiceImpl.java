package com.Amy.Api.services.impl;

import com.Amy.Api.services.IRequestService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
@Service
public class RequestServiceImpl implements IRequestService {
    @Override
    public String request(HttpServletRequest request){
        if(request.getHeader("lang").contains("English")){
            return "English language received ";
        }
        else if(request.getHeader("lang").contains("Urdu")){
            return "Urdu language received ";
        }
        else if(request.getHeader("lang").contains("Arabic")){
            return "Arabic language received ";
        }
        else {
            return "Received language is out of context ";
        }

    }
}
