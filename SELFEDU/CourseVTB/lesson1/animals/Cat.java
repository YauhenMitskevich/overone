package SELFEDU.CourseVTB.lesson1.animals;
// от final класса нельзя наследоваться
public final class Cat extends Animal {
    @Override
    public String toString() {
        return "CAT [" + name + " " + color + " " + age + "]";
    }

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

    @Override
    public void voice() {
        System.out.println(name + " say meow");
    }

    public void catMethod() {
        System.out.println("Jump");
    }
}
