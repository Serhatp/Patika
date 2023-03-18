package giris;
import java.util.Scanner;

public class Weather_Suggestions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the weather heat (Celcius): ");
        int weather = input.nextInt();

        if(weather <= 5){
            System.out.println("We recommend you to go skiing and have a nice vacation trip on the snowy mountains!");
        }

        if (weather > 5 && weather <= 15 ){
            System.out.println("We recommend you to go to a cinema to see a film with one of your loved one!");
        }

        if (weather > 15 && weather <= 25 ){
            System.out.println("We recommend you to go to a picnic with your family!");
        }

        if (weather > 25){
            System.out.println("We recommend you to go to a beach or pool to dive in some fresh water!");
        }
    }
}
