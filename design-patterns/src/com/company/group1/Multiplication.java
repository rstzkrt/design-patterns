package com.company.group1;

public class Multiplication implements Chain{
    public Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain=nextChain;
    }

    @Override
    public void calculate(Operation ops) {
        if(ops.mathOps.equals("MUL")){
            System.out.println((ops.getNum1()*ops.getNum2()));
        }
        else nextChain.calculate(ops);
    }
}