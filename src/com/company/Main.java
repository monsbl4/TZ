import com.company.ResultArabic;
import com.company.ResultRoman;
import com.company.ToRoman;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        String [] roman = {"0","I","II","III","IV","V","VI","VII","VIII","IX","X"};

        System.out.println("Добро пожаловать в калькулятор арабских и римских чисел");
        while (true) {
            System.out.println("Введите значения от 1 до 10 через пробел");
            String inValue =scanner.nextLine();

            try {


                String [] symbol = inValue.split(" ");
                if (symbol.length !=3) throw new Exception("Введите правельные значения через пробел");
                if (Character.isDigit(symbol[0].charAt(0)) != Character.isDigit(symbol[2].charAt(0)) ||
                        Character.isLetter(symbol[0].charAt(0)) != Character.isLetter(symbol[2].charAt(0)))
                    throw new Exception("Числа должны быть одного формата");
                try {
                    int firstNumber = Integer.parseInt(symbol[0]);
                    int secondNumber = Integer.parseInt(symbol[2]);
                    String result = ResultArabic.calc(firstNumber, secondNumber, symbol[1]);
                    System.out.println("Результат: " + result);
                }
               catch (NumberFormatException e) {
                    int firstNumber = Arrays.asList(roman).indexOf(symbol[0]);
                    int secondNumber = Arrays.asList(roman).indexOf(symbol[2]);
                    int result = Integer.parseInt(ResultRoman.calc(firstNumber, secondNumber, symbol[1]));
                    System.out.println("Результат: " + ToRoman.Convert(result));
                }
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
                break;
            }
        }
    }
}
