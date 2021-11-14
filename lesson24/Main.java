package lesson24;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 323);
        Fruit lemon = new Fruit("Lemon", 35);
        Fruit.Bone AppleBone = apple.new Bone();
        Fruit.Bone LemonBone = lemon.new Bone();
        AppleBone.getAmount();
        LemonBone.getAmount();
    }
    public static class Fruit {
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
}
