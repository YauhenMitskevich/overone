package by.overone.lesson7.hometask;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number: ");
        int n;
        if (scan.hasNextInt()) {
            n = scan.nextInt();
        } else {
            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("It's not a number! Please, input correct number: ");
            }
            n = scan.nextInt();
        }
        int num0 = 0;
        int num1 = 1;
        int num2;
        System.out.print(num0 + " " + num1 + " ");
        for (int i = 3; i <= n; i++) {
            num2 = num0 + num1;
            System.out.print(num2 + " ");
            num0 = num1;
            num1 = num2;
        }
        System.out.println();
    }
}
