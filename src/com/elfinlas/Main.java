package com.elfinlas;

import com.elfinlas.codility.lessons.BinaryGap;
import com.elfinlas.etc.CodilityType;
import com.elfinlas.hackerrank.easy.MarkAndToys;
import com.elfinlas.hackerrank.easy.PlusMinus;
import com.elfinlas.hackerrank.easy.Staircase;
import com.elfinlas.hackerrank.medium.ClimbingTheLeaderboard;
import com.elfinlas.hackerrank.medium.Pairs;

import static com.elfinlas.etc.CodilityType.*;

public class Main {

    public static void main(String[] args) throws Exception {
        runByCodility(BINARY_GAP);

        //Staircase.run();
        //PlusMinus.run();
//        ClimbingTheLeaderboard.run();
//        Pairs.run();
        //MarkAndToys.run();

    }

    /**
     * 코딜리티 문제 수행 메서드
     */
    public static void runByCodility(CodilityType codilityType) {
        if (codilityType.equals(BINARY_GAP)) {
            int value = 529; //전달 데이터
            BinaryGap.solutionBinaryGap(value);
        }
        else { System.out.println("No type code = "+ codilityType.name()); }
    }

}
