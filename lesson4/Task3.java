package by.overone.lesson4;

import java.util.Random;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        double[] arr1 = new double[1000];


        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextDouble();
        }
        System.out.println(Arrays.toString(arr1));

        double max = arr1[0];
        double min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
            if (arr1[i] < max) {
                min = arr1[i];
            }
        }
        System.out.println("maximum value: " + max);
        System.out.println("minimum value: " + min);


        double average = 0;
        for (int i = 0; i < arr1.length; i++) {
            average += arr1[i];
        }
        System.out.println(average);


    }

}
