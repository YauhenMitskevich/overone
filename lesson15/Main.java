package lesson15;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String str = "Я изучаю Java";
        String str2 = " Я иЗуЧаЮ Java";
        String str3 = "Я изучаю Ruby";
        System.out.println(str.compareTo(str3));
        System.out.println(str.compareToIgnoreCase(str2));
        byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
        System.out.println(Arrays.toString(bytes));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.replace('a', 'А'));
        System.out.println("a" + str.charAt(1) + "b");
        char[] dst = str.toCharArray();
        char[] newArray = new char[30];
        str2.getChars(0, 13, newArray, 5);
        System.out.println(Arrays.toString(newArray));
    }
}