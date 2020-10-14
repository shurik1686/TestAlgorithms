package ru.shurik16.testalgorithms;

import java.util.Arrays;

public class TestAlgorithms {

    public static void main(String[] args) {
        System.out.println("Rez " + CountMax.repeatedNumber(Arrays.asList(1, 3, 1, 3, 2, 3, 3, 3, 2)));
        System.out.println("Rez " + CountMax.repeatedNumber1(Arrays.asList(1, 3, 1, 3, 2, 3, 3, 3, 2)));
        System.out.println("Rez " + CountMax.repeatedNumber2(Arrays.asList(1, 3, 1, 3, 2, 3, 3, 3, 2)));
        System.out.println("Rez " + Arrays.toString(CountMax.repeatedNumber3(Arrays.asList(1, 3, 1, 3, 2, 3, 3, 3, 2), 2)));
        System.out.println("Rez " + CountMax.repeatedNumberS(Arrays.asList(1, 3, 1, 3, 2, 3, 3, 2, 2), 2));

        System.out.println(StringAlgorithms.testString("()({()}[])()"));
        System.out.println(StringAlgorithms.testString("({()}([)])"));
        System.out.println(StringAlgorithms.testString("(({(("));
        System.out.println(StringAlgorithms.testString(")}})"));
    }


}
