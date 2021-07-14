package com.example.calculator;


public class Calculator {
    double operandOne, operandTwo, result;

    char operator;


    public Calculator() {

    }

    public char getOperator() {
        return operator;
    }

    public double getOperandOne() {
        return operandOne;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void performOperation() {
        switch (operator) {
            case '+':
                result = getOperandOne() + getOperandTwo();
                break;
            case '-':
                result = getOperandOne() - getOperandTwo();
                break;
         /*   case '*':
                result = getOperandOne() * getOperandTwo();
                break;
            case '/':
                result = getOperandOne() / getOperandTwo();
                break;*/
        }


    }

    public double getResult() {
        performOperation();
        return result;

    }
}
