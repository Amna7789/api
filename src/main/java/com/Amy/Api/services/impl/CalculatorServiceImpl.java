package com.Amy.Api.services.impl;

import com.Amy.Api.domain.CalculatorDTOIn;
import com.Amy.Api.domain.CalculatorResultDTO;
import com.Amy.Api.services.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {

    @Override
    public int getResult(  CalculatorDTOIn calculatorDTOIn){
       // CalculatorResultDTO crd = new CalculatorResultDTO();


        if(calculatorDTOIn.get0perator().equals("+")){
            int sum = calculatorDTOIn.getNum1() +  calculatorDTOIn.getNum2();

            return  sum;

        }

        else if(calculatorDTOIn.get0perator().equals("-")){
           int subtract = calculatorDTOIn.getNum1() -  calculatorDTOIn.getNum2();
           return  subtract;

        } else if (calculatorDTOIn.get0perator().equals("*")) {
            int multiply = calculatorDTOIn.getNum1() *  calculatorDTOIn.getNum2();
            return  multiply;
        }
        else if (calculatorDTOIn.get0perator().equals("/")) {
            int division = calculatorDTOIn.getNum1() /  calculatorDTOIn.getNum2();
            return  division;
        }

        return  0;
    }

    @Override
    public CalculatorResultDTO getResultCalculator(CalculatorDTOIn calculatorDTOIn){
        CalculatorResultDTO crd = new CalculatorResultDTO();


        if(calculatorDTOIn.get0perator().equals("+")){

            int sum =  calculatorDTOIn.getNum1() + calculatorDTOIn.getNum2();

            int num1 = calculatorDTOIn.getNum1();
            crd.setNum1(num1);
            int num2 = calculatorDTOIn.getNum2();
            crd.setNum2(num2);
            crd.setOperator("+");
            crd.setResult(sum);


            return crd;

        }

        else if(calculatorDTOIn.get0perator().equals("-")){
            int subtract = calculatorDTOIn.getNum1() -  calculatorDTOIn.getNum2();
            int num1 = calculatorDTOIn.getNum1();
            crd.setNum1(num1);
            int num2 = calculatorDTOIn.getNum2();
            crd.setNum2(num2);
            crd.setOperator("-");
            crd.setResult(subtract);
            return crd;

        } else if (calculatorDTOIn.get0perator().equals("*")) {
            int multiply = calculatorDTOIn.getNum1() *  calculatorDTOIn.getNum2();
            int num1 = calculatorDTOIn.getNum1();
            crd.setNum1(num1);
            int num2 = calculatorDTOIn.getNum2();
            crd.setNum2(num2);
            crd.setOperator("*");
            crd.setResult(multiply);
            return crd;
        }
        else if (calculatorDTOIn.get0perator().equals("/")) {
            int division = calculatorDTOIn.getNum1() /  calculatorDTOIn.getNum2();
            int num1 = calculatorDTOIn.getNum1();
            crd.setNum1(num1);
            int num2 = calculatorDTOIn.getNum2();
            crd.setNum2(num2);
            crd.setOperator("/");
            crd.setResult(division);
            return crd;
        }

        return null;
    }




}

