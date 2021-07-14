
package com.example.calculator;

import java.util.ArrayList;

public class Calculator2 {


    private ArrayList<Double> numbersArray = new ArrayList<>();
    private ArrayList<String> operationsArray = new ArrayList<>();
    private double result = 0;

    public void performOperation(double number) {
        numbersArray.add(number);
    }

    public void performOperation(String operation) {
        double result = 0;
        if (!operation.equals("=")) {
            this.operationsArray.add(operation);
        } else {
            int i = 0;
            while (this.operationsArray.contains("*") || this.operationsArray.contains("/")) {
                if (this.operationsArray.get(i).equals("*")) {
                    result = this.numbersArray.get(i) * this.numbersArray.get(i + 1);
                    this.numbersArray.set(i, result);
                    this.numbersArray.remove(i + 1);
                    this.operationsArray.remove(i);
                    i--;
                } else if (this.operationsArray.get(i).equals("/")) {
                    result = this.numbersArray.get(i) / this.numbersArray.get(i + 1);
                    this.numbersArray.set(i, result);
                    this.numbersArray.remove(i + 1);
                    this.operationsArray.remove(i);
                    i--;
                }
                i++;
            }
            this.result = this.numbersArray.get(0);
            for (i = 0; i < this.operationsArray.size(); i++) {
                if (this.operationsArray.get(i).equals("+")) {
                    this.result += this.numbersArray.get(i + 1);
                } else if (this.operationsArray.get(i).equals("-")) {
                    result -= this.numbersArray.get(i + 1);
                }
            }

        }
    }

    public String getResult() {
        return String.valueOf(result);
    }

    public ArrayList<Double> getNumbersArray() {
        return numbersArray;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public ArrayList<String> getOperationsArray() {
        return operationsArray;
    }

    public void setNumbersArray(ArrayList<Double> numbersArray) {
        this.numbersArray = numbersArray;
    }

    public void setOperationsArray(ArrayList<String> operationsArray) {
        this.operationsArray = operationsArray;
    }
}