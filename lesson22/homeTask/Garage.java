package lesson22.homeTask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Garage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car saab = new Saab("Saab", "9-5", 2002, 250, 2.3);
        Car honda = new Honda("Honda", "Legend", 2004, 200, 2.5);
        Car toyota = new Toyota("Toyota", "Supra", 2000, 600, 3.0);
        Car volvo = new Volvo("Volvo", "S90", 1998, 220, 2.5);
        HashMap<Car, Integer> map = new HashMap<>();
        Integer saabCount = 4;
        Integer hondaCount = 9;
        Integer toyotaCount = 8;
        Integer volvoCount = 1;
        map.put(saab, saabCount);
        map.put(honda, hondaCount);
        map.put(toyota, toyotaCount);
        map.put(volvo, volvoCount);
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("{" + entry.getKey() + ": " +
                    entry.getValue() + "}");
        }

//         Saab cars left
        System.out.println("How many Saab cars left?");
        while (true) {
            int carLeft = scanner.nextInt();;
            Integer newSaabCount = saabCount - carLeft;
            map.replace(saab, saabCount, newSaabCount);
            map.put(saab, newSaabCount);
            if (newSaabCount < 0) {
                System.out.println("Wrong input! Input correct number:");
            } else {
                System.out.println("There are " + map.get(saab) + " Saab cars left in the garage.");
                break;
            }
        }
    }
}