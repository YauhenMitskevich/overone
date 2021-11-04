package lesson20.homeTask;

import java.util.*;

public class StudGrades {
    public static int getGrades() {
        return (int) (Math.random() * 10) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input count of students: ");
        int countOfStudents = scanner.nextInt();

        List<Integer> grades = new ArrayList<>();
        for (int i = 0; i < countOfStudents; i++) {
            grades.add(getGrades());
        }
        System.out.println("All grades: " + grades);

        //1st reverse method. very nice method
        Collections.reverse(grades);
        System.out.println(grades);
        Collections.reverse(grades);

        //2nd reverse method
        for (int i = countOfStudents - 1; i >= 0; i--) {
            System.out.printf(grades.get(i) + ", ");
        }

        int min = grades.get(0);
        int max = grades.get(0);
        for (Integer i : grades) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        System.out.println("\nMinimal grade: " + min);
        System.out.println("Maximal grade: " + max);

        ListIterator<Integer> it = grades.listIterator();
        while (it.hasNext()) {
            int s = it.next();
            if (s < 4) {
                it.remove();
            }
        }
        System.out.println("All acceptable grades: " + grades);
    }
}
