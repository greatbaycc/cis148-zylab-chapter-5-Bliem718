import java.util.Scanner;

public class IntegerStringChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString;
        int i;
        boolean output = true;

        userString = scnr.next();

        for (i = 0; i < userString.length(); ++i) {
            if (!Character.isDigit(userString.charAt(i))) {
                output = false;
            }
        }
        if (output) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
