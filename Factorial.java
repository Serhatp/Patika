package giris;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int last_number = 1;
        int i;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for (i = 1; i <= number; i++) {
            last_number = last_number * i;
        }

        System.out.println(last_number);

    }
}
