import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i;
        String input;
        String output = "";

        input = scnr.nextLine();

        for (i = 0; i < input.length(); ++i) {
            if (!Character.isWhitespace(input.charAt(i))) {
                output += input.charAt(i);
            }
        }
        System.out.println(output);
    }
}
