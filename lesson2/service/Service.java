package by.overone.lesson2.service;

/**
 * @author Yauheni Mitskevich
 * public class Service
 */


public class Service {
    public static void main(String[] args) {
        double point1 = 3.456786;
        float point2 = 54.656565f;
        double result1 = point1 + point2;
        double result2 = point1 - point2;
        double result3 = point1 * point2;
        System.out.printf("result1=%.1f, result2=%.1f, result3=%.1f \n", result1, result2, result3);
    }
}
