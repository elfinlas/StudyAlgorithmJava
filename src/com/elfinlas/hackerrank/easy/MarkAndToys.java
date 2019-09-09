package com.elfinlas.hackerrank.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * https://www.hackerrannk.com/challenges/mark-and-toys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 * Created by mhlab(dex) on 2019-06-08.
 */

public class MarkAndToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        //큰 값 제외
        List<Integer> list = Arrays.stream(prices)
                .boxed()
                .sorted(Integer::compareTo)
                .filter(integer -> integer <= k)
                .collect(Collectors.toList());

        int sum = 0;
        int cnt = 0;
        for (int value : list) {
            sum += value;
            if (sum >= k) { break; }
            else { cnt++; }
        }
        System.out.println("cnt = " + cnt);
        return cnt;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void run() throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

/*
[문제 해결]
* 문제 의미 : 첫 번째는 전달되는 가격 리스트, 두 번째는 맥스 가격
즉 먼저 가격이 담긴 배열을 내림차순 정렬을 하고,
스트림 등을 사용해서 최대 가격보다 높은 값은 잘라낸다.
그리고 남은 가격으로 갯수를 카운트 해서 반환

 */