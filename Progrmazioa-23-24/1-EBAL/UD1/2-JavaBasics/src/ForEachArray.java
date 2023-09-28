public class ForEachArray {
    public static void main(String[] args) {
        int[] numbers = { 8, 2, 6, 4, 3 };
        int sum = 0, sumSq = 0;
        for (int number : numbers) { // for each int number in int[] numbers
            sum += number;
            sumSq += number * number;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The square sum is: " + sumSq);
    }
}