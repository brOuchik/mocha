package com.calc.math;

public class Result {
    private long mult;
    private long sum;

    public Result(long num1, long num2) {
        this.mult = num1*num2;
        this.sum = num2+num1;
    }

    public long getMult() {
        return mult;
    }

    public long getSum() {
        return sum;
    }




}
