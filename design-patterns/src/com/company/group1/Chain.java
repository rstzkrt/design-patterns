package com.company.group1;

public interface Chain {
    void setNextChain(Chain nextChain);
    void calculate(Operation ops);
}
