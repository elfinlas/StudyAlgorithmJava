package com.elfinlas.hackerrank.easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 *
 * Created by MHLab on 2019-06-05..
 */

public class Staircase {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the staircase function below.
    static void staircase(int n) {
        for (int x=0; x<n; x++) {
            for (int y=0; y<n; y++) {
                if ( (x+y) >= n-1 ) { System.out.print("#"); }
                else { System.out.print(" "); }
            }
            System.out.println();
        }
    }

    public static void run() {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        staircase(n);
        scanner.close();
    }

}

/*
[문제 해법]
일단 #이 오른쪽 정렬이 되어야 하는데 코드 상으로는 두번의 반복문을 돌리는 것으로 처리
2차원 배열 식으로 처리한다고 생각하면 편하다.

Ex : input 4

[ ][ ][ ][#]
[ ][ ][#][#]
[ ][#][#][#]
[#][#][#][#]

핵심은 저 공백을 잡아주는 건데 위 코드를 참고하면 이해 더 쉬울듯

 */
