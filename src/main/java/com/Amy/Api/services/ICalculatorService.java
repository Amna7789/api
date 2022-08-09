package com.Amy.Api.services;

import com.Amy.Api.domain.CalculatorDTOIn;
import com.Amy.Api.domain.CalculatorResultDTO;

public interface ICalculatorService {

    public int getResult(  CalculatorDTOIn calculatorDTOIn);

    public CalculatorResultDTO getResultCalculator(CalculatorDTOIn calculatorDTOIn);

}
