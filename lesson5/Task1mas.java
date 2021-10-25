package by.overone.lesson5;

public class Task1mas {
    public static void main(String[] args) {
        int num = 0;
        int[] array = new int[100];

        for (int i = 1; i < array.length ; i++) {
            if (i % 5 == 0) {
                array[num] = i;
                System.out.print(array[num] + " ");
                num++;
            }

            if (num == 100) break;
            int sum = i*i;
            System.out.println(sum);
        }

    }
}
