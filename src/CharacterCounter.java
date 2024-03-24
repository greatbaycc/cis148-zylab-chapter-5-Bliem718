import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i;
        int counter = 0;
        String inputLetter;
        char letter;
        String word;

        inputLetter = scnr.next();
        letter = inputLetter.charAt(0);
        word = scnr.nextLine();

        for (i = 0; i < word.length(); ++i) {
            if (letter == word.charAt(i)) {
                ++counter;
            }
        }
        System.out.println(counter);
    }
}
