package com.Amy.Api.controller.PracticeA;

import com.Amy.Api.domain.CalculatorDTOIn;
import com.Amy.Api.domain.CalculatorResultDTO;
import com.Amy.Api.services.ICalculatorService;
import com.Amy.Api.services.impl.CalculatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    ICalculatorService cs;

    @GetMapping("/calculator")
    public int getResults(@RequestBody CalculatorDTOIn calculatorDTOIn){
        return cs.getResult(calculatorDTOIn);
    }
    @GetMapping("/resultCalculator")
    public CalculatorResultDTO getResultCalculator(@RequestBody CalculatorDTOIn calculatorDTOIn){

        return cs.getResultCalculator(calculatorDTOIn);
    }


}
