package giris;
import java.util.Scanner;

public class Doubles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loop = 0, total = 0;

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 0; i <= number; i++ ){
            if (i % 3 == 0 && i % 4 == 0){
                loop += 1;
                total += i;
            }
        }

        if (loop > 0){
            double average = total / loop;
            System.out.println("Arithmetic mean is  " + average);
        }
        else System.out.println("Couldn't found the number");
    }
}
