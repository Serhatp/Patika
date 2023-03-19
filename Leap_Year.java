package giris;
import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        int year = input.nextInt();

        if(year%4 == 0 || year %400 == 0){
            System.out.println(year + " is a leap year!");
        }

        else{
            System.out.println(year + " is not a leap year.");
        }

    }
}
