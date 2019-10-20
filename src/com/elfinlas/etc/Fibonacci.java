package com.elfinlas.etc;

/**
 * Created by MHLab on 2019/10/16..
 */

public class Fibonacci {


    public static int fibo(int n) {
        if (n<=1) { return n; }
        else {
            return fibo(n-2) + fibo(n-1);
        }
    }

}
