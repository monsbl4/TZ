package com.company;

public class ResultArabic {
    public static String calc (int first, int second, String action) throws Exception {

        int result;
        if (first < 0 | first > 10 | second <0 | second > 10 ) {
            throw new Exception("Числа должны быть от 1 до 10");
        }
        switch (action) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "/":
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