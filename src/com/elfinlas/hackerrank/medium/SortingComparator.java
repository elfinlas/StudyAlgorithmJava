package com.elfinlas.hackerrank.medium;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by mhlab(dex) on 2019-06-08.
 */

public class SortingComparator {

    //해당 클래스 완성 시키기
    class Checker implements Comparator<Player> {
        //https://gmlwjd9405.github.io/2018/09/06/java-comparable-and-comparator.html
        // complete this method
        public int compare(Player a, Player b) {
            if (a.score < b.score) { return 1; }
            else if (a.score == b.score) { return 0; }
            else { return -1; }//a > b

//            if (a.score < b.score) { //점수에 대해서는 오름 차순
//                //return (x < y) ? -1 : ((x == y) ? 0 : 1);
//            }
//            else { //A의 점수가 높거나 같은 경우
//                return a.name.compareTo(b.name);
//            }
        }
    }

    public void run() throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

    class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

}

/*
[문제 해결]
* 정렬에 대한 이해가 필요함
- Compare
- CompareTo 비교 찾기

 */