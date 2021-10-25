package by.overone.lesson4;

public class Task1 {
    public static void main(String[] args) {
        int[] arrNum = {13, 12, 45, 67, 66, 2, 56};

        int temp2 = 0;

        for (int i = arrNum.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrNum[j] > arrNum[j + 1]) {
                    int temp1 = arrNum[j];
                    arrNum[j] = arrNum[j + 1];
                    arrNum[j + 1] = temp1;
                }
            }
        }
        for (int i = 0; i < arrNum.length; i++) {
            System.out.print(arrNum[i] + " ");
        }
        for (int i = 0; i < arrNum.length; i++) {
            for (int j = i + 1; j < arrNum.length; j++) {
                if (arrNum[i] < arrNum[j]) {
                    temp2 = arrNum[i];
                    arrNum[i] = arrNum[j];
                    arrNum[j] = temp2;
                }

            }

            System.out.print(arrNum[i] + " ");
        }


    }
}