package com.company.group1;

public class Main {

    public static void main(String[] args) {

        Chain chain1=new Addition();
        Chain chain2=new Subtraction();
        Chain chain3=new Division();
        Chain chain4=new Multiplication();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);

        Operation addOps=new Operation(1,2,"ADD");
        Operation subOps=new Operation(1,2,"SUB");
        Operation mulOps=new Operation(1,2,"MUL");
        Operation divOps=new Operation(1,2,"DIV");

        chain1.calculate(addOps);
        //chain1.calculate(subOps);
        //chain1.calculate(mulOps);
        //chain1.calculate(divOps);

    }
}
