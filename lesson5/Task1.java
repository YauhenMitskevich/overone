package by.overone.lesson5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid number");
            scanner.next();
        }
        int num = scanner.nextInt();
        long sum = 0L;
        for (int i = 1; i < num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
