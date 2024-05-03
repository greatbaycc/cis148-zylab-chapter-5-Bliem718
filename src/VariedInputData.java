import java.util.Scanner;

public class VariedInputData {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int MAX_AMOUNT = 100; // The maximum amount of integers possible in the program.
        int[] intArray = new int[MAX_AMOUNT]; // The int array.
        int i = 0; // Used for counting how many numbers are inputted.
        int j; // Used for iterating over the integer array.
        int n; // User input.
        int average = 0;
        int min;
        int max = 0;

        // Reminds the user of how many numbers the user can input and that a negative number ends the input.
        // First input sets min.
        System.out.println("Enter up to " + MAX_AMOUNT + " numbers. A negative number ends the input.");
        n = scnr.nextInt();
        min = n;

        // Runs while input n is not below 0.
        while (n >= 0) {
            // Adds n to average, which is divided by i at the end. Also adds n to the int array and increments i.
            average += n;
            intArray[i] = n;
            ++i;

            // Sets min number to input n if input n is less than the min number.
            if (n < min) {
                min = n;
            }

            // Sets max number to input n if input n is more than the max number.
            if (n > max) {
                max = n;
            }

            // Prints out the current array of numbers.
            System.out.println();
            System.out.println("Current numbers:");
            for (j = 0; j < i; ++j) {
                if (j == i - 1) {
                    System.out.println(intArray[j]);
                }
                else {
                    System.out.print(intArray[j] + ", ");
                }
            }

            // Breaks out of the while loop if the index limit of 100 is reached.
            if (i == MAX_AMOUNT) {
                break;
            }

            n = scnr.nextInt();
        }

        // If no numbers are inputted, print out a message reminding the user to input a positive number.
        // Otherwise, prints the average, min, and max number from user's every input.
        // Also prints out the user's input if the user ended the loop early by inputting a negative number.
        if (i <= 0) {
            System.out.println();
            System.out.println("Please input a positive number before a negative number.");
        }
        else if (i < MAX_AMOUNT) {
            System.out.println();
            System.out.println("Current numbers:");
            for (j = 0; j < i; ++j) {
                if (j == i - 1) {
                    System.out.println(intArray[j]);
                }
                else {
                    System.out.print(intArray[j] + ", ");
                }
            }
        }
        System.out.println();
        System.out.println("Average: " + average / i);
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
