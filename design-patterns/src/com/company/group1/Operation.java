package com.company.group1;

public class Operation {
    public double num1;
    public double num2;
    public String mathOps;

    public Operation(double num1, double num2, String mathOps) {
        this.num1 = num1;
        this.num2 = num2;
        this.mathOps = mathOps;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getMathOps() {
        return mathOps;
    }

    public void setMathOps(String mathOps) {
        this.mathOps = mathOps;
    }
}
