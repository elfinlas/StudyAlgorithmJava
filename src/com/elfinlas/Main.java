package com.elfinlas;

import com.elfinlas.codility.lessons.BinaryGap;
import com.elfinlas.etc.CodilityType;
import com.elfinlas.etc.ProgrammersType;
import com.elfinlas.programmers.LevelOne;

import static com.elfinlas.etc.CodilityType.*;
import static com.elfinlas.etc.ProgrammersType.*;

public class Main {

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis(); //시작하는 시점 계산


        long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
        System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초"); //실행 시간 계산 및 출력
    }


    ///Programmers


    ////////

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

    /**
     * 프로그래머스 문제 수행 메서드
     */
    public static void runByProgrammers(ProgrammersType programmersType) {
        if (programmersType.equals(LEVEL_ONE_1)) {
            LevelOne.proExam01(12);
        }
        else {
            LevelOne.proExam02(new int[]{5,9,7,10}, 5);
            //proExam02(new int[]{3,2,6}, 10);
        }

    }


}
