package by.overone.lesson6;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int N = 5;
        int countNegative = 0;
        int countPositive = 0;
        int countZero = 0;

        int[] array = new int[N];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(90) - 50;
            if (array[i] < 0) {
                countNegative = countNegative + 1;
            } else if (array[i] > 0) {
                countPositive = countPositive + 1;
            } else{
                countZero = countZero +1;
            }
        }
        System.out.println("count 'negative' = " + countNegative);
        System.out.println("count 'positive' = " + countPositive);
        System.out.println("count 'zerro' = " + countZero);

    }
}

