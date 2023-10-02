import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) throws Exception {
        int[] grades;
        final int NUM;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        NUM = in.nextInt();
        grades = new int [NUM];
        do{
            for(int stnum = 1; stnum <= NUM; stnum++){
                System.out.println("Enter the grade for student " + stnum);
                
            }
        }while(grades.length<=NUM);
    }
}