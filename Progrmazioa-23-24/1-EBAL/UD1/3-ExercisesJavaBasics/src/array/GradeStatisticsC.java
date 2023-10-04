import java.util.Scanner;

public class GradeStatisticsC {
    public static void main(String[] args) {

        double average;
        int numStudents;
        int[] grades;
        int grade;
        int minGrade;
        int maxGrade;
        int sum;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numStudents = input.nextInt();

        grades = new int[numStudents];

        // Solicitar las calificaciones de cada estudiante y almacenarlas en el arreglo

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grade = input.nextInt();

            // Validar que la calificación esté dentro del rango de 0 a 100
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
                i--; // Restar 1 al contador para volver a solicitar la calificación
            } else {
                grades[i] = grade;
            }
        }

        input.close();
        // Calcular el promedio, la calificación mínima y la calificación máxima

        minGrade = grades[0];
        maxGrade = grades[0];
        sum = grades[0];
        for (int i = 1; i < numStudents; i++) {
            grade = grades[i];
            sum += grade;
            if (grade < minGrade) {
                minGrade = grade;
            }
            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }

        average = (double) sum / numStudents;

        System.out.printf("Average: %.2f", average);
        System.out.println();
        System.out.println("Minimum grade: " + minGrade);
        System.out.println("Maximum grade: " + maxGrade);
    }
}
