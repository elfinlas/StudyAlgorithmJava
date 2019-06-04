package com.elfinlas.codility.lessons;

/**
 * https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 * Created by mhlab(dex) on 2019-06-01.
 */

public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        if (A.length == 1) { return A[0]; }
        else {
            int typeA = A[0];
            int typeB = A[1];

            for (int i = 2; i<A.length; i++) {
                if (typeA != A[i] && typeB != A[i]) { return A[i]; }
            }
            return 0;
        }

//        if (A.length >=3) {
//            int typeA = A[0];
//            int typeB = A[1];
//
//            Set<Integer> set = IntStream.of(A).boxed().collect(Collectors.toSet());
//
//            for(int i : set) {
//                if (typeA != i && typeB != i) { return i; }
//            }
//            return 0;
//        }
//        else { return A[1]; }
    }
}
