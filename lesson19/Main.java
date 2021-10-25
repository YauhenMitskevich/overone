package lesson19;

public class Main {

    public static void main(String[] args) throws Exception {
        Math<Integer> number = new Math<>(2, 3);
        Number sum = MathUtil.sum(number);
        Number multiply = MathUtil.multiply(number);

        System.out.println(sum);
        System.out.println(multiply);
    }
}
