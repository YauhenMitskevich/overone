package by.overone.lesson5;

import java.util.Random;
import java.util.Scanner;

public class HomeTask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        int K;

        System.out.println("Input number N:");

        if (scan.hasNextInt()) {
            N = scan.nextInt();
        } else {
            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("You entered some bullshit!!! Enter number!");
            }
            N = scan.nextInt();
        }
        System.out.println("Input number K:");
        if (scan.hasNextInt()) {
            K = scan.nextInt();
        } else {
            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("WTF?! Does this look like a number to you? Enter NUMBER!!!");
            }
            K = scan.nextInt();
        }

        int[] A = new int[N];
        Random random = new Random();
        long sum = 0L;
        for (int i = 0; i < A.length; i++) {
            do {
                A[i] = random.nextInt();
            }
            while (A[i] < 0);
            if (A[i] % K == 0) {
                sum = sum + A[i];
            }
            System.out.println(A[i] + " " + (A[i] % K == 0));
        }
        System.out.println("Summa: " + sum);
    }
}