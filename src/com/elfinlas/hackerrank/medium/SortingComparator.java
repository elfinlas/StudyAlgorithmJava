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
        //
        // complete this method
        public int compare(Player a, Player b) {
            if (a.score < b.score) { return 1; }
            else if (a.score > b.score) { return -1; }
            else { return a.name.compareTo(b.name); } //서로 값이 상동한 경우
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
자바에서 Comparable 관 Comparator 에 대한 이해를 체크하는 유형
문제는 결국 점수는 내림차순,  영문은 오름차순을 처리하는게 목표이다.
compare의 경우 기본 정렬과는 다른 방향으로 구현함
compareTo 의 경우 기본 정렬

참고 사이트
* https://gmlwjd9405.github.io/2018/09/06/java-comparable-and-comparator.html
 */