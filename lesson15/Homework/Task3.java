package lesson15.Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scan.nextLine();
        System.out.println("Enter the word:");
        String word = scan.next();
        String res = str + " " + word;
        System.out.println(res);
        String[] words = res.split(" ",3);
        String firstWord = words[0];
        String lastWord = res.substring(res.lastIndexOf(" ") + 1);
        System.out.println("The first word: " + firstWord);
        System.out.println("The last word: " + lastWord);
        if (firstWord.equals(lastWord)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

