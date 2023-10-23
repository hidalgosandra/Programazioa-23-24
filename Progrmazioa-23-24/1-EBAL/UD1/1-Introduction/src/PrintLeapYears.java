public class PrintLeapYears {
    public static void main(String[] args){
        final int LOWERBOUND = 999;
        final int UPPERBOUND = 2010;
        int count = 0;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            if (((number % 4 == 0) && (number %100 != 0)) || (number % 400 == 0)) {
                count++;
                System.out.println(number );
                number++;
            }
            else number++;
        }
        System.out.println("The number of leap years between " + LOWERBOUND + " and " + UPPERBOUND + " is " + count);
    }
}