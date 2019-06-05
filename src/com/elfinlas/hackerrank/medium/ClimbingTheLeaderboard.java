package com.elfinlas.hackerrank.medium;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 * Created by MHLab on 2019-06-05..
 */

public class ClimbingTheLeaderboard {
    private static final Scanner scanner = new Scanner(System.in);

    static int[] nonDuplicate(int[] arr) {
        if (arr.length <= 1) return arr;
        List<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if (arr[i-1] == arr[i]) { continue; }
            list.add(arr[i]);
        }
        int[] resultArr = new int[list.size()];
        for (int i =0; i<list.size(); i++) {
            resultArr[i] = list.get(i);
        }
        return resultArr;
    }

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] nonDuplicateArr = nonDuplicate(scores);
        int[] resultArr = new int[alice.length]; //

        for (int i=0; i<alice.length; i++) {
            int aliceScore = 1;
            for (int j=0; j<nonDuplicateArr.length; j++) {
                //스코어가 엘리스보다 작은 경우
                if (nonDuplicateArr[j] <= alice[i]) { break; }
                else if (nonDuplicateArr[j] > alice[i]) { aliceScore++; }//스코어가 더 큰 경우
            }
            resultArr[i] = aliceScore;
//            //출력
//            System.out.println(aliceScore);
        }
        return resultArr;
    }

    public static void run() throws Exception {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        climbingLeaderboard(scores, alice);
//        int[] result = climbingLeaderboard(scores, alice);
//
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

/*
[문제 풀이]
위 코드로는 완벽하게 안됨 -> Timeout 8번 쪽
그래서 이 부분은 https://duzi077.tistory.com/159 이 부분을 참고해봐야 함




 */
