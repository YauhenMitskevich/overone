package by.overone.lesson7.hometask;

import java.sql.SQLOutput;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {20, 5, 6, 10, 2, 3, 15, 9};
        System.out.println("All leaders of this array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    if (j == array.length-1) {
                        System.out.println(array[i]);
                    }
                } else {
                    break;
                }
            }
        }
    }
}
