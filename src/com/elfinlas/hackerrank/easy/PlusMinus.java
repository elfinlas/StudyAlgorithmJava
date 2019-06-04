package com.elfinlas.hackerrank.easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 * Created by MHLab on 2019-06-05..
 */

public class PlusMinus {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positiveCnt = 0;
        int negativeCnt = 0;
        int zeroCnt = 0;
        int totalSize = arr.length;

        //갯수를 구한다.
        for (int value : arr) {
            if (value == 0) { zeroCnt++; }
            else if (value > 0) { positiveCnt++; }
            else { negativeCnt++; }
        }

        System.out.println((double)positiveCnt/totalSize);
        System.out.println((double)negativeCnt/totalSize);
        System.out.println((double)zeroCnt/totalSize);
    }

    public static void run() {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

/*
[문제 해법]
쉬운 문제다.
결국 그냥 소수점 구해주면 되는 문제.
난이도가 몹시 낮아서 그냥 코드 보면서 이해하자.

 */