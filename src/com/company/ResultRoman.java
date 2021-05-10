package com.company;

import java.util.Arrays;

public class ResultRoman {

    public static String calc (int first, int second, String action) throws Exception {
/*        String [] romanResult = {"0","I","II","III","IV","V","VI","VII","VIII","IX","X",
                "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
                "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
                "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
                "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",
                "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
                "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
                "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
                "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XС",
                "XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};*/

        int result;
        if (first < 0 | first > 10 | second <0 | second > 10 ) {
            throw new Exception("Числа должны быть от I до X");
        }
        switch (action) {
            case "+":
                result = first + second;
                break;
            case "-":
                if (first<second) {
                    throw new Exception("Результат не может быть отрицательным");
                }
                result = first - second;
                break;
            case "/":
                if (first/second == 0) {
                    throw new Exception(("Результат не может быть меньше I"));
                }
                result = first / second;
                break;
            case "*":
                result = first * second;
                break;
            default:
                throw new Exception("Введите верное действие");
        }
        return String.valueOf(result);
    }
}