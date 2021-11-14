package SELFEDU.CourseVTB.lesson1;

import SELFEDU.CourseVTB.lesson1.animals.Animal;
import SELFEDU.CourseVTB.lesson1.animals.Cat;
import SELFEDU.CourseVTB.lesson1.animals.Dog;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Malkuth", "leopard", 2);
        Cat cat2 = new Cat("Kaisa", "Black", 1);
//        cat.voice();
//        cat.info();

        Dog dog = new Dog("Barry", "Brown", 4);
//        dog.voice();
//        dog.info();

        Cow cow = new Cow("Zorka", "Pink", 32);
//        cow.voice();
//        cow.info();

        Animal[] catsDogsCows = {
                cat, cat2, dog, cow
        };
        for (Animal o : catsDogsCows) {
            o.voice();
        }

        Animal cat3 = new Cat("A", "B", 1);
        if (cat3 instanceof Cat) {
            ((Cat) cat3).catMethod();
        } else {
            System.out.println("Not Cat!");
        }

        Object obj = new Cat("A", "B", 1);
        System.out.println(obj);    // метод toString переопределен в классе Cat


        //далее операции с Box. переопределяем методы equals() и hashCode().
        Box box1 = new Box("Black", 4);
        Box box2 = new Box("Black", 4);
        System.out.println(box1.equals(box2));  // метот equals() переопределен в классе Box

    }
}
