package calculator;

public class Converter {
    public static String[] romanian = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
            "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII",
            "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII",
            "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII",
            "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII",
            "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV",
            "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV",
            "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV",
            "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII",
            "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
    public static int[] convert(String operand1, String operand2) throws NewException {
        int range = 0;
        int a = 0;
        int b = 0;

        for (int i = 0; i < romanian.length; i++) {
            if (operand1.equals(romanian[i])) {
                a = i + 1;
                range++;
            }
            if (operand2.equals(romanian[i])) {
                b = i + 1;
                range++;
            }
        }

        if (range == 0) {
            a = Integer.parseInt(operand1);
            b = Integer.parseInt(operand2);
        } else if (range == 1) {
            throw new NewException("Ошибка, используются одновременно разные системы счисления");
        }

        int[] variables = new int[3];
        variables[0] = range;
        variables[1] = a;
        variables[2] = b;

        return variables;
    }
}
