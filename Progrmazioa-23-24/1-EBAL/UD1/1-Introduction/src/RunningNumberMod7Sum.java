public class RunningNumberMod7Sum {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        int number = 7;
        int sum = 0;
        while (number <= UPPERBOUND) {
            if (sum % 7 == 0) {
                sum = sum + number;
                number = number + 7;
            }
        }
        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }
}