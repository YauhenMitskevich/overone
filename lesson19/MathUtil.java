package lesson19;

public class MathUtil<T> {
    public static <T extends Number> Number sum(Math<T> number) throws Exception {
        T num1 = number.getNum1();
        T num2 = number.getNum2();
        if (num1 instanceof Integer) {
            return num1.intValue() + num2.intValue();
        } else if (num1 instanceof Double) {
            return num1.doubleValue() + num2.doubleValue();
        } else {
            return num1.floatValue() + num2.floatValue();
        }
        throw new Exception("Invalid");
        public static <T extends Number > void multiply (Math < T > number) throws Exception {

        }
    }
}
