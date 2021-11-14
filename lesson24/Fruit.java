package lesson24;

public class Fruit {
    private String fruit;
    private int countOfBones;

    public Fruit(String fruit, int countOfBones) {
        this.fruit = fruit;
        this.countOfBones = countOfBones;
    }

    class  Bone {
        public void getAmount() {
            System.out.println(fruit + " has " + countOfBones + " bones!");
        }
    }
}
