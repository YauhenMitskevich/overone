package lesson15;

public class Main2 {

    public static void main(String[] args) {
        String str = "Я изучаю Java ";
        StringBuilder strBuilder = new StringBuilder(str);
        System.out.println(strBuilder.hashCode());
        StringBuilder newStringBuilder = strBuilder.append("и английский тоже надо");
        System.out.println(strBuilder.hashCode());
        System.out.println(strBuilder);
        System.out.println(newStringBuilder.hashCode());
        System.out.println(newStringBuilder);
    }
}