package lesson21;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Person hleb = new Person(1, "Hleb");
        Person boris = new Person(2, "Boris");
        people.add(hleb);
        people.add(boris);

        for (Person person : people) {
            System.out.println(person);
        }

        people.remove(hleb);
        people.remove(boris);

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println(people.contains(boris));
    }
}