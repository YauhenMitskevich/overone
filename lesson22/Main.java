package lesson22;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> countries = new HashMap<>();
        countries.put(1, "Belarus");
        countries.put(2, "Belgium");
        countries.put(3, "Ukraine");
        countries.put(4, "Norway");
        countries.put(5, "Canada");
        countries.put(6, "UK");
        System.out.println(countries.get(4));
        System.out.println(countries);
        countries.remove(3);
        countries.remove(4);
        System.out.println(countries.keySet());
        System.out.println(countries.values());
        System.out.println(countries.containsValue("Norway"));
    }
}
