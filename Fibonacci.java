package com.company;

import java.math.BigInteger;

public class Fibonacci {
    public static BigInteger fibonacci(int n){
        BigInteger F0 = new BigInteger("0");
        BigInteger F1 = new BigInteger("1");
        BigInteger Fn = new BigInteger("1");
        if(n == 0){
            Fn = F0;
        } else if (n == 1) {
            Fn = F1;
        } else if(n > 1) {
            Fn = F0.add(F1);
            F0 = F1;
            F1 = Fn;
        }
        return Fn;
    }
}
