package com.elfinlas.codility.lessons;

/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
 * Created by mhlab(dex) on 2019-06-01.
 */

public class FrogJmp {
    //int result = FrogJmp.solution(1, 5, 2);
    public static int solution(int X, int Y, int D) {
        if (X == Y) { return 0; } //만약 시작점과 도착점이 같은 경우
        else {
            int result = ((Y - X) / D);
            return ((Y - X) % D) == 0 ? result : result + 1; //도착점에서 시작점을 빼고 그것을 점프 길이와 나눠서 0일 경우와 아닌 경우로 반환
        }
    }
}
