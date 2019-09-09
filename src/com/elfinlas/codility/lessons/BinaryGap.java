package com.elfinlas.codility.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 *
 * Created by mhlab(dex) on 2019-06-01.
 */

public class BinaryGap {
    public static int solutionBinaryGap(int input) {
        int max = 0; //0 갯수를 담을 변수

        //전달된 값을 이진화 하여 배열화 시킨다.
        int [] result = Arrays.stream(Integer.toBinaryString(input).split("")).mapToInt(Integer::parseInt).toArray();
        List<Integer> onNumList = new ArrayList<>();

        //이진 배열을 돌면서 1일 경우 해당 인덱스를 배열에 담아준다.
        //
        for (int i=0; i<result.length; i++) {
            if (result[i]==1) { onNumList.add(i); }
        }

        //반복문을 돌면서 아래 로직 수행
        //반복문에는 1의 인덱스 값들이 있기에 1 값의 차이 값이 0의 길이 값이 된다.
        for (int i=0; i<onNumList.size()-1; i++) {
            //-1의 사유는 마지막의 값이 1을 빼야 하기 때문에 진행했다.
            int tmpBinSize = onNumList.get(i+1) - onNumList.get(i) -1;
            if (tmpBinSize > max) { max = tmpBinSize; }
        }
        return max;
    }
}
