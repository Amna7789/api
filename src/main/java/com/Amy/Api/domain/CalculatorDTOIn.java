package com.Amy.Api.domain;

public class CalculatorDTOIn {
    int num1;
    int num2;
    String operator;

    public CalculatorDTOIn() {
    }

    public CalculatorDTOIn(int num1, int num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String get0perator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
