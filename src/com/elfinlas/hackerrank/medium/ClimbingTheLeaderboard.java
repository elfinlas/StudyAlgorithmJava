package com.elfinlas.hackerrank.medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 * Created by MHLab on 2019-06-05..
 */

public class ClimbingTheLeaderboard {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] peopleRank = new int[scores.length];
        int[] aliceRank = new int[alice.length];

        peopleRank[0] = 1; //처음 값은 1등

        //기존 점수의 스코어 배열을 정리한다.
        for (int i=1; i<scores.length; i++) {
            //전 값과 동일한 경우
            if (scores[i-1] == scores[i]) { peopleRank[i] = peopleRank[i-1]; }
            else {
                //
                if (peopleRank[i] == peopleRank[i-1]) { //만약 같은 등수라면

                }
                else {
                    peopleRank[i] = peopleRank[i-1]++;
                }
            }//다음 값이 작은 경우
        }

        for(int score : peopleRank) {
            System.out.println("score = " + score);
        }

        //엘리스의 스코어를 순회하면서 엘리스 점수 배열을 만든다.
        for (int x=0; x<alice.length; x++) { //엘리스 순회
            for (int y=0; y<scores.length; y++) { //스코어 순회

                //만약 기존 스코어보다 큰 값인 경우
                if (alice[x] >= scores[y]) {
                    System.out.println("Find alice more big or eq  " );
                    aliceRank[x] = peopleRank[y];
                    break;
                }
                else if (alice[x] < scores[y]) { //엘리스가 기존 스코어보다 작은 값
                    //두 스코어가 같지 않을 때만 증가
                    if (aliceRank[x] != peopleRank[y]) {
                        System.out.println("Find alice more low and not same score " );
                        aliceRank[x] = peopleRank[y]++; }
                }
            }
            System.out.println("~~Loop~~");
        }

        for (int i =0; i<aliceRank.length; i++) {
            System.out.println("alice = " + aliceRank[i]);
        }

        return null;
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

 */
