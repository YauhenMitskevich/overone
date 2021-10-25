package lesson15.Homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input text:");
        String str = scan.nextLine();
        int count = str.split(" +").length;
        System.out.println("Count of words: " + count);
    }
}
