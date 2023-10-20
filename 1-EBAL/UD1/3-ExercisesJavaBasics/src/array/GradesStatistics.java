import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) throws Exception {
        int[] grades;
        final int NUM;
        double avg;
        int mingrade, maxgrade, sum, grade, stgrade;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        NUM = in.nextInt();
        grades = new int[NUM];
        for (int stnum = 0; stnum < NUM; stnum++) {
            System.out.println("Enter the grade for student " + (stnum + 1));
            stgrade = in.nextInt();
            grades[stnum] = stgrade;
        }
        in.close();
        
        mingrade = grades[0];
        maxgrade = grades[0];
        sum = grades[0];

        for (int i = 1; i < NUM; i++) {
            grade = grades[i];
            sum += grade;
            if (grade < mingrade) {
                mingrade = grade;
            }
            if (grade > maxgrade) {
                maxgrade = grade;
            }
        }
        avg = (double) sum / NUM;

        System.out.printf("Average: %.2f", avg);
        System.out.println("");
        System.out.println("Minimum grade: " + mingrade);
        System.out.println("Maximum grade: " + maxgrade);
    }
}