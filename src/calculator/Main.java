package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NewException {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите выражение");
        String sum = in.nextLine();

        String result = calc(sum);

        System.out.println(result);
    }
    public static String calc(String input) throws NewException {
        String[] arguments = input.split(" ");

        int[] variables = Converter.convert(arguments[0], arguments[2]);

        if (variables[1]>10 || variables[1]<0 || variables[2]>10 || variables[2]<0) {
            throw new NewException("Ошибка, значения не входят в интервал от 1 до 10");
        } else {
            switch (arguments[1]) {
                case "+":
                    if (variables[0] == 2){
                        return Converter.romanian[variables[1] + variables[2] -1];
                    } else {
                        return String.valueOf(variables[1] + variables[2]);
                    }
                case "-":
                    if (variables[0] == 2){
                        return Converter.romanian[variables[1] - variables[2] - 1];
                    } else {
                        return String.valueOf(variables[1] - variables[2]);
                    }
                case "/":
                    if (variables[0] == 2){
                        return Converter.romanian[variables[1] / variables[2] - 1];
                    } else {
                        return String.valueOf(variables[1] / variables[2]);
                    }
                case "*":
                    if (variables[0] == 2){
                        return Converter.romanian[variables[1] * variables[2] - 1];
                    } else {
                        return String.valueOf(variables[1] * variables[2]);
                    }
            }
        }
        return null;
    }
}
