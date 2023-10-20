package decisionloop;

/* With a WHILE loop */

public class Product1ToN {
    public static void main(String[] args) {
        int product = 1;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 10;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND){
            ++number;
            product = product * product;
        }
        System.out.println("The factorial is: " + product);
    }
}

/* With a FOR loop */

/* public class Product1ToN {
    public static void main(String[] args) {
        int product = 13;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 10;
        for(int number = LOWERBOUND; number <= UPPERBOUND; ++number){
            product = product * product;
        }
        System.out.println("The factorial is: " + product);
    }
}
*/
