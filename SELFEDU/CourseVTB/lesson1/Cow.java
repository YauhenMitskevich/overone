package SELFEDU.CourseVTB.lesson1;

import SELFEDU.CourseVTB.lesson1.animals.Animal;

public class Cow extends Animal {
    public Cow(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    @Override
    public void voice() {
        System.out.println(name + " say moooo");
    }
}
