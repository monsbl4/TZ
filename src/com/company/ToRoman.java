package com.company;

import java.util.TreeMap;

public class ToRoman {
    private final static TreeMap< Integer, String > romanChars = new TreeMap<>();

    static {
        romanChars.put(1, "I");
        romanChars.put(4, "IV");
        romanChars.put(5, "V");
        romanChars.put(9, "IX");
        romanChars.put(10, "X");
        romanChars.put(40, "XL");
        romanChars.put(50, "L");
        romanChars.put(90, "XC");
        romanChars.put(100, "C");
    }
    public static String Convert(int number) {

        int i = romanChars.floorKey(number);

        if (number == i) {
            return romanChars.get(number);
        }
        return romanChars.get(i) + Convert(number - i);
    }
}
