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
    //binary int input = 37;
    public static int solutionBinaryGap(int input) {
        int max = 0;
        int [] result = Arrays.stream(Integer.toBinaryString(input).split("")).mapToInt(Integer::parseInt).toArray();
        List<Integer> onNumList = new ArrayList<>();

        for (int i=0; i<result.length; i++) {
            if (result[i]==1) { onNumList.add(i); }
        }

        for (int i=0; i<onNumList.size()-1; i++) {
            //-1의 사유는 마지막의 값이 1을 빼야 하기 때문에 진행했다.
            int tmpBinSize = onNumList.get(i+1) - onNumList.get(i) -1;
            if (tmpBinSize > max) { max = tmpBinSize; }
        }
        return max;
    }
}
