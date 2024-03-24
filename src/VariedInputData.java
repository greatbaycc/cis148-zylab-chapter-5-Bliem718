import java.util.Scanner;

public class VariedInputData {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i = 0;
        int n;
        int average = 0;
        int max = 0;

        n = scnr.nextInt();

        while (n >= 0) {
            average += n;
            ++i;

            if (n > max) {
                max = n;
            }
            n = scnr.nextInt();
        }
        System.out.print(average / i);
        System.out.println(" " + max);

    }
}
