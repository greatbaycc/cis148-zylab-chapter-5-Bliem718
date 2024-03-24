import java.util.Scanner;

public class Max {

    public int findMax() {
        Scanner scnr = new Scanner(System.in);
        int input;
        int maxNumber = 0;

        input = scnr.nextInt();

        while (input >= 0) {
            if (input > maxNumber) {
                maxNumber = input;
            }
            input = scnr.nextInt();
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        Max test = new Max();
        System.out.println(test.findMax());
    }
}
