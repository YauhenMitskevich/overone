package by.overone.lesson7.hometask;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int array1[] = {1, 4, 5, 3, 5, 6, 3, 5, 7};
        int array2[] = {1, 4, 5, 3, 5, 6, 3, 5, 7};
        if (Arrays.equals(array1, array2)) {
            System.out.println("Arrays are equals");
        } else {
            System.out.println("Arrays are different");
        }
    }
}
