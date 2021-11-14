package SELFEDU.CourseVTB.lesson1.animals;

public class Cat extends Animal{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
}
