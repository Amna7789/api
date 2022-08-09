package com.Amy.Api.controller.PracticeA;

import com.Amy.Api.domain.MarksDTOIn;
import com.Amy.Api.domain.ResultDTO;
import com.Amy.Api.services.impl.MyFirstServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {


    @Autowired
    MyFirstServiceImpl mfs;

    @PostMapping("/result")
    public String getResult(@RequestBody MarksDTOIn marksDTOIn){
       return mfs.getFriendResult(marksDTOIn);
    }

    @PostMapping("/resultDetail")
    public ResultDTO getResultDetail(@RequestBody MarksDTOIn marksDTOIn){
        return getPersonalResultDetail(marksDTOIn);
    }

    public  ResultDTO getPersonalResultDetail(MarksDTOIn marksDTOIn){

        double sum = marksDTOIn.getEng() + marksDTOIn.getMath() + marksDTOIn.getPhy()+
                marksDTOIn.getComp() + marksDTOIn.getChem();
        double percentage = sum/500 * 100;


        ResultDTO resultDTO = new ResultDTO();

        resultDTO.setSum(sum);
        resultDTO.setPercentage(percentage);

        if(percentage > 55.5){
            resultDTO.setStatus("PASS");
            resultDTO.setDesc("Student has passed all the courses");
        }
        else{
            resultDTO.setStatus("FAIL");
            resultDTO.setDesc("Student has failed");
        }

        return resultDTO;
    }

}
