package com.elfinlas.codility.lessons;

import java.util.HashSet;
import java.util.Set;

/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 *
 * Created by mhlab(dex) on 2019-06-01.
 */

public class FrogRiverOne {
    public static int solution(int X, int[] A) {
        Set<Integer> dataSet = new HashSet<>(); //개구리가 이동한 값을 저장할 셋

        for (int idx=0; idx<A.length; idx++) {
            if (A[idx] <= X) { //전달된 목적지보다 작거나 같을 때만 진행
                dataSet.add(A[idx]);

                if (dataSet.size() == X) { //만약 이동한 데이터와 목적지가 같은 경우
                    return idx;
                }
            }
        }
        return -1;
    }
}
