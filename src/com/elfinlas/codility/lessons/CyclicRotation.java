package com.elfinlas.codility.lessons;

/**
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 * Created by mhlab(dex) on 2019-06-01.
 */

public class CyclicRotation {
    /**
     * CyclicRotation  int[] result = solution(new int[]{1, 1, 2, 3, 5}, 42);  //42
     * @param A 빈배열, 값이 하나인 배열
     * @param K 배열보다 큰 사이즈,
     * @return
     */
    public static int[] solutionCyclicRotation(int[] A, int K) {
        int arrSize = A.length;
        int[] resultArr = new int[arrSize];

        if (arrSize <= 1 || arrSize == K) { //빈 배열이 오거나 1개의 요소만 있거나, 반복 횟수가 배열의 길이와 동일한 경우
            return A;
        }
        else { //배열이 1보다 큰 경우
            K = K > arrSize ? K%arrSize : K; //배열의 길이보다 크게 올 경우 K 값을 재 조정
            for (int i=0; i<arrSize; i++) {
                int tmpIdx = i+K<arrSize?i+K:i+K-arrSize;
                resultArr[tmpIdx] = A[i];
            }
        }
        return resultArr;
    }
}
