package by.overone.lesson4;

public class Task2 {
    public static void main(String[] args) {
        int num = 0;
        int[] array = new int[100];

        for (int i = 13; i >= 13; i++) {
            if (i % 13 == 0 || i % 17 == 0) {
                array[num] = i;
                System.out.print(array[num] + " ");
                num++;
            }

            if (num == 100) break;
        }

    }
}
