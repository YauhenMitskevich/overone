package by.overone.lesson6;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        int max = 0;
        int min = 0;
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(90) - 50;
            System.out.print(array[i] + "; ");
            if (array[min] > array[i]) {
                min = i;
            }
            else if (array[max] < array[i]) {
                max = i;
            }

        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);

        int tmp = array[max];
        array[max] = array[min];
        array[min] = tmp;
        System.out.println(array[max]);
        System.out.println(array[min]);

    }
}
