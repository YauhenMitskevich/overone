package lesson15.Homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a;
        if (scan.hasNextInt()) {
            a = scan.nextInt();
        } else {
            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Wrong number... Enter number: ");
            }
            a = scan.nextInt();
        }
//        concat & String
        String st1 = "Hello! ";
        for (int i = 0; i < a; i++) {
            st1 = st1.concat("I like you!!!");
        }
        System.out.println(st1);
        long x = System.currentTimeMillis();
//         StringBuilder & append
        String str = "Змея кусаех хвост змеи";
        StringBuilder st2 = new StringBuilder(str);
        String newst2 = ", которая кусает хвост змеи";
        for (int i = 0; i < a; i++) {
            st2.append(newst2);
            str = newst2;
        }
        System.out.println(st2);
        long y = System.currentTimeMillis();
        if (x>y) {
            System.out.println("(Concat + String) faster than (StringBuilder + append)");
        }
        else {
            System.out.println("(StringBuilder + append) faster than (Concat + String)");
        }
    }
}

