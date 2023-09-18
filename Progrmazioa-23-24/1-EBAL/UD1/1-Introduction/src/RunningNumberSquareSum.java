public class RunningNumberSquareSum {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int number = 1;
        int sum = 0;
        while (number <= UPPERBOUND) {
            sum = sum + (number * number);
            number++;
        }
        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }
}