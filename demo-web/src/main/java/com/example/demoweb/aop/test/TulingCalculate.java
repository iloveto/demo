package com.example.demoweb.aop.test;

import com.example.demoweb.aop.Calculate;

public class TulingCalculate implements Calculate {

    public int add(int numA, int numB) {

        return numA+numB;
    }

    public int reduce(int numA, int numB) {
        return numA-numB;
    }

    public int div(int numA, int numB) {
        return numA/numB;
    }

    public int multi(int numA, int numB) {
        return numA*numB;
    }
}