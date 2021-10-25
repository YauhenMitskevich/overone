package lesson15.Homework;

public class Task6 {
    public static void main(String[] args) {
        String str = "JJJaaavvvaaa";
        str = str.replaceAll("([a-zA-Z])\\1+", "$1");
        System.out.println(str);
    }
}
