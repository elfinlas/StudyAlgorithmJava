package com.elfinlas.programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * 프로그래머스 문제
 *
 * Created by mhlab(dex) on 09/09/2019.
 */

public class LevelOne {

    //나눠서 떨어지는 문제 구하기
    public static int[] proExam02(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i%divisor ==0) {list.add(i);}
        }
        if (list.isEmpty()) { list.add(-1); }
        list.sort(Integer::compareTo);
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("lis = " + list);
        return answer;
    }


    //약수 구하기
    public static int proExam01(int n) {
        int total = 0;
        for (int i=1; i<=n; i++) {
            if (n%i==0) { total += i; }
        }
        return total;
    }


}
