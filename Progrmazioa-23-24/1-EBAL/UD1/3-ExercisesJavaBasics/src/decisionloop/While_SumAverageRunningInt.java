package decisionloop;

/**
 * Compute the sum and average of running integers from a lowerbound to an
 * upperbound using loop.
 */
public class While_SumAverageRunningInt { // Save as "SumAverageRunningInt.java"
    public static void main(String[] args) {
        // Define variables
        int sum = 0; // The accumulated sum, init to 0
        double average; // average in double
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int number = LOWERBOUND;
        // Use a for-loop to sum from lowerbound to upperbound
        while(number<=UPPERBOUND){
            sum += number;
            ++number;
        }
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is "+ sum);
        average = sum / 100.0;
        System.out.println("Average is: " + average);
    }
}