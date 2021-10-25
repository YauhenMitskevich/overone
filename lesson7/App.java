package by.overone.lesson7;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int size = 7;
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + " ");
        }
        int[] existNumbers = new int[size];
        int sum = 8;
        int indexLastAddNum = 0;
        for (int j = 0; j < array.length; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (array[j] + array[k] == sum) {
                    for (int d = 0; d < existNumbers.length; d++) {
                        if (existNumbers[d] != array[j] || existNumbers[d] != array[k]) {
                            existNumbers[indexLastAddNum] = array[j];
                            existNumbers[indexLastAddNum + 1] = array[k];
                            indexLastAddNum += 2;
                            System.out.print("\n" + array[j] + " + " + array[k] + " = " + sum);
                        }
                    }
                }
            }
        }
    }
}
