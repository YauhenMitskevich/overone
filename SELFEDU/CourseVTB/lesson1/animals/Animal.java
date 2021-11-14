package SELFEDU.CourseVTB.lesson1.animals;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    // модификатор protected расширяет видимость ДЛЯ НАСЛЕДНИКОВ (для класса "Cow")

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public abstract void voice();
}
