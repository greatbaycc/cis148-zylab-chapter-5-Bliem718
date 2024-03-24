import java.util.Scanner;

public class Hailstone {

    public int hailstone(int num) {
        int i = 1;
        if (num == 1) {
            System.out.print(num);
        }
        else {
            System.out.print(num + "\t");
        }
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
                System.out.print(num);
            }
            else if (num % 2 == 1) {
                num = (num * 3) + 1;
                System.out.print(num);
            }
            if (num != 1) {
                System.out.print("\t");
            }
            else {
                break;
            }
            ++i;
            if (i >= 10) {
                System.out.println();
                i = 0;
            }
        }
        System.out.println();
        return num;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Hailstone labObject = new Hailstone();
        int num;

        num = scnr.nextInt();
        labObject.hailstone(num); // Call hailstone() to print out the hailstone sequence.
    }
}
