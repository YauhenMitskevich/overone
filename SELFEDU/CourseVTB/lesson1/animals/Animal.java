package SELFEDU.CourseVTB.lesson1.animals;

public class Animal {
    String name;
    String color;
    int age;

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void voice() {
        System.out.println(name + " voice");
    }
}
