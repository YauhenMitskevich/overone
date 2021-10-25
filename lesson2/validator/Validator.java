package by.overone.lesson2.validator;

/**
 * @author Yauheni Mitskevich
 * public class Validator
 */

public class Validator {
    public static void main(String[] args) {
        double chance1 = 45.67;
        int chance2 = 732478634;
        double result1 = chance1 + chance2;
        double result2 = chance2 - chance1;
        double result3 = chance1 * chance2;
        System.out.printf("result1=%.3f, result2=%.4f, result3=%.2f \n", result1, result2, result3);

    }
}
