package com.elfinlas;

import com.elfinlas.codility.lessons.BinaryGap;
import com.elfinlas.codility.lessons.CodilityType;
import com.elfinlas.etc.Factorial;
import com.elfinlas.etc.Stack;
import com.elfinlas.etc.ThreadExam;

import static com.elfinlas.codility.lessons.CodilityType.*;

public class Main {

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis(); //시작하는 시점 계산

        runByEtc();

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

    ////////

    static void runByEtc() {
        //
        Stack stack = new Stack();
        stack.testStack();

        //피보니치
//        int result = Factorial.fact(4);
//        System.out.println("result = " + result);
//
//        ThreadExam.runThread();
    }




}
