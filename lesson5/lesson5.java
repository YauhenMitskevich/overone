package by.overone.lesson5;

import java.util.Scanner;

public class lesson5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = sc.nextInt();
        int[] arr = new int[number];
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum +=i;
            sum = arr[i] + arr[number];
        }


        System.out.println(sum);
    }
}
