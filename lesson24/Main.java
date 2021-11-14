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
}
