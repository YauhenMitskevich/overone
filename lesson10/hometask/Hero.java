package by.overone.lesson10.hometask;

public class Hero {
    private String name;

    public String getName() {
        return name;
    }

    public Hero(String heroName) {
        name = heroName;
    }

    public void attackEnemy() {
        System.out.println(name + " attacks Enemy...");
    }
}