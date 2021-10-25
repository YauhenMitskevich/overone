package by.overone.lesson7.hometask;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {8, 5, 6, 4, 2, 3, 7, 9};
        int min = array[0];
        int max = array[0];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            sum += array[i];
        }
        System.out.println("Minimal + Maximal: " + min + " + " + max);
        double average = (sum - min - max)/ (array.length-2);
        System.out.println("Average value equal to: " + average);
    }
}