package lesson15.Homework;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scan.next();
        System.out.println("Input patronymic:");
        String patronymic = scan.next();
        System.out.println("Input surname:");
        String surname = scan.next();
        String fullNPS = name + " " + patronymic + " " + surname;
        String fullNPSUpper = fullNPS.toUpperCase(Locale.ROOT);
        String[] subStr = fullNPSUpper.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < subStr.length; i++) {
            result.append(subStr[i].charAt(0)).append(". ");
        }
        System.out.println(result);
    }
}
