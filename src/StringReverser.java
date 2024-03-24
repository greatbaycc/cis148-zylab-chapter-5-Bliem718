import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i;
        String input;

        input = scnr.nextLine();

        while (!input.equals("Quit") && !input.equals("quit") && !input.equals("q")) {
            for (i = input.length() - 1; i >= 0; --i) {
                System.out.print(input.charAt(i));
            }
            System.out.println();
            input = scnr.nextLine();
        }
    }
}
