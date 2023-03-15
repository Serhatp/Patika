package giris;
import java.util.Scanner;

public class Green_Grocery {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pear_price = 2.14, apple_price = 3.67, tomato_price = 1.11, banana_price = 0.95, orange_price = 5.00;

        System.out.println("" +
                "--PRICE LIST--" +
                "\nPear - 2,14" +
                "\nApple - 3,67" +
                "\nTomato - 1,11" +
                "\nBanana - 0,95" +
                "\nOrange - 5,00");
        System.out.println("How many kgs of pears would you like to buy? ");
        int pear = input.nextInt();

        System.out.println("How many kgs of apples would you like to buy? ");
        int apple = input.nextInt();

        System.out.println("How many kgs of tomatoes would you like to buy? ");
        int tomato = input.nextInt();

        System.out.println("How many kgs of bananas would you like to buy? ");
        int banana = input.nextInt();

        System.out.println("How many kgs of ornages would you like to buy? ");
        int orange = input.nextInt();

        double total_cost = (pear*pear_price)+(apple*apple_price)+(tomato*tomato_price)+(banana*banana_price)+(orange*orange_price);
        System.out.println(total_cost);
    }
}
