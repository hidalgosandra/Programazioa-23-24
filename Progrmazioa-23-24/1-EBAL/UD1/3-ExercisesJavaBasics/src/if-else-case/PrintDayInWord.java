/**
 * Trying nested-if and switch-case statements.
 */
public class PrintDayInWord { // Save as "PrintNumberInWord.java"
    public static void main(String[] args) {
        int number = 6; // Set the value of "number" here!

        // Using nested-if
        if (number == 1) { // Use == for comparison
            System.out.println("MONDAY");
        } else if (number == 2) {
            System.out.println("TUESDAY");
        } else if (number == 3) {
            System.out.println("WEDNSDAY");
        } else if (number == 4) {
            System.out.println("THURSDAY");
        } else if (number == 5) {
            System.out.println("FRIDAY");
        } else if (number == 6) {
            System.out.println("SATURDAY");
        } else if (number == 7) {
            System.out.println("SUNDAY");
        } else {
            System.out.println("Not a valid day.");
        }

        // Using switch-case-default
        switch (number) {
            case 1:
                System.out.println("MONDAY");
                break; // Don't forget the "break" after each case!
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNSDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Not a valid day.");
        }
    }
}