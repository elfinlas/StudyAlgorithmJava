package com.elfinlas.etc;

import java.util.Stack;

/**
 * Created by MHLab on 2019/10/16..
 */

public class Factorial {

    public static int fact(int n) {
        Stack stack;
        if (n <= 1) { return n; }
        else { return fact((n-1)) * n; }
    }
}
