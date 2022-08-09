package com.Amy.Api.services.impl;

import com.Amy.Api.domain.MarksDTOIn;
import com.Amy.Api.services.IMyFirstService;
import org.springframework.stereotype.Service;

@Service
public class MyFirstServiceImpl implements IMyFirstService {
    @Override
    public String getFriendResult(MarksDTOIn marksDTOIn){

        double sum = marksDTOIn.getEng() + marksDTOIn.getMath() + marksDTOIn.getPhy()+
                marksDTOIn.getComp() + marksDTOIn.getChem();
        double percentage = sum/500 * 100;
        if(percentage > 55.5){
            return "Student has passed all the courses";
        }
        else{
            return "Student has failed";
        }
    }

}
