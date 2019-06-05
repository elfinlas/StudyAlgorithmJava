package com.elfinlas.hackerrank.medium;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/pairs/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=search
 *
 * Created by MHLab on 2019-06-06..
 */

public class Pairs {

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
        int cnt = 0;
        Arrays.sort(arr);
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                int tmpCalc = (arr[i] - arr[j]);
                if (tmpCalc < 0) { tmpCalc *= -1; } //0보다 작은 경우 양수 변환

                //타깃과 동일하다면 카운트 증가
                if (tmpCalc == k) { cnt++; }
                else if (tmpCalc > k) { break; }
            }
        }
        return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void run() {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = pairs(k, arr);
        System.out.print("result = " + result);
    }
}

/*
[문제 풀이]
생각보다 안 어려운 문제
주어진 배열을 순회하면서 각 값과 뺄셈을 해서 타겟 값과 동일한 경우의 총 갯수를 반환하는 문제
첫 번째 라인의 첫 전달인자는 주어질 배열의 길이, 두 번째는 두  타깃
두 번째 라인은 검색할 배열

키 포인트는 불 필요한 연산을 줄이는 것
위에 코드를 보면 먼저 정렬을 함으로써 타깃 값 보다 큰 경우 부터는 존재할 수 없기에 break를 건다.
이 부분이 생략될 경우 timeout이 뜰거다.

아래의 코드가 딱 대표적인 예
int cnt = 0;
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                int tmpCalc = (arr[i] - arr[j]);
                if (tmpCalc < 0) { tmpCalc *= -1; } //0보다 작은 경우 양수 변환

                //타깃과 동일하다면 카운트 증가
                if (tmpCalc == k) { cnt++; }
            }
        }
        return cnt;

 */
