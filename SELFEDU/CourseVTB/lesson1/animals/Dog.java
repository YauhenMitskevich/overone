package SELFEDU.CourseVTB.lesson1.animals;

public class Dog extends Animal {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    @Override
    public void voice() {
        System.out.println(name + " say gav-gav");
    }
}

