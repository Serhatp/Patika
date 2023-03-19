package giris;
import java.util.Scanner;

public class Plane_Ticket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the distance you want to travel (km): ");
        int distance = input.nextInt();
        if (distance < 50){
            System.out.println("You can only travel minimum of 50 kms. Please enter a valid number, restart the process");
            System.exit(0);
        }

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if (age <= 0){
            System.out.println("Please enter a valid age. Restart the process...");
        }

        System.out.println("Type 1 for one-way, type 2 for round trip");
        int travel_type = input.nextInt();
        if (travel_type < 1 || travel_type > 2){
            System.out.println("Type 1 for one-way, type 2 for round trip. Please restart the process...");
        }

        double total_price = distance * 0.10;
        if (age > 0 && age < 12 ){
            total_price = total_price/2;
        }
        if (age >= 12 && age < 24 ){
            total_price = total_price-total_price*0.1;
        }
        if (age >= 24 && age < 65){
            total_price = total_price-total_price*0.3;
        }

        if (travel_type == 2){
            total_price = total_price-total_price*0.2;
        }

        System.out.println("Your total is " + total_price);




    }
}
