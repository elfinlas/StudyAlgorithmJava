package com.elfinlas.codility.lessons;

import java.util.Arrays;

/**
 * https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 *
 * Created by mhlab(dex) on 2019-06-01.
 */

public class PermMissingElem {
    //PermMissingElem.solution(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13});
    public static int solution(int[] A) {
        //이 코드는 80%
        int size = A.length; //전달된 배열의 길이
        int arrLengthSum = 0; //전달된 배열의 길이의 총 합
        int arrTotalSum = Arrays.stream(A).sum(); //전달된 배열의 총 합

        if (size == 0) { return 1; }
        else {
            if (size % 2 == 0) { arrLengthSum = (1 + size) * (size / 2); } //짝수의 경우 총합
            else { arrLengthSum = ((1 + size) * (size / 2)) + ((size/2) + 1); } //홀수의 경우 총합
            arrLengthSum += (size+1); //총 길이의 값이 추가를 해준다.

            if ((arrTotalSum + size+1) != arrLengthSum) { return arrLengthSum - arrTotalSum; }
            else { return size+1; }
        }
    }

//이거는 100%
//        long N = A.length +1;
//        long totalSum = (N*(N+1))/2;
//
//        for(int i=0; i<A.length; i++){
//            totalSum -= A[i];
//        }
//
//        return (int)totalSum;
}
