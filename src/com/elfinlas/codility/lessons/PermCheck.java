package com.elfinlas.codility.lessons;

import java.util.HashSet;
import java.util.Set;

/**
 * https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
 *
 * Created by mhlab(dex) on 2019-06-01.
 */

public class PermCheck {
    public static int solution(int[] A) {
        Set<Integer> dataSet = new HashSet<>();

        for (int value : A) {
            if (value > A.length || dataSet.contains(value)) { //순열의 조건이 아닌 것을 체크
                return 0;
            }
            dataSet.add(value);
        }
        return 1;
    }
}
