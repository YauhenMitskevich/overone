package lesson24;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 323);
        Fruit.Bone AppleBone = apple.new Bone();
        AppleBone.getAmount();
    }
}
