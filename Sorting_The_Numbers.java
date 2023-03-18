package giris;
import java.util.Scanner;

public class Sorting_The_Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to sort your numbers from biggest to smallest or from smallest to biggest?");
        System.out.println("Type 1 for biggest to smallest, Type 2 for smallest to biggest");
        String decision = input.nextLine();

        if (decision.equals("1")){
            System.out.println("Please enter the first number: ");
            double a = input.nextDouble();
            System.out.println("Please enter the second number: ");
            double b = input.nextDouble();
            System.out.println("Please enter the third number: ");
            double c = input.nextDouble();

            if (a > b && a >c ){
                if (b> c ){
                    System.out.println(a + ">" + b +">" +c);
                }
                else{
                    System.out.println(a + ">" + c + ">" + b);
                }
            }

            if (b >a && b >c){
                if (a > c){
                    System.out.println(b + ">" + a +">" +c);
                }
                else {
                    System.out.println(b + ">" + c +">" +a);
                }
            }

            if (c > a && c > b){
                if (a > b){
                    System.out.println(c +">" + a +">" + b);
                }
                else {
                    System.out.println(c + ">" + b + ">" +a);
                }
            }
        }

        if (decision.equals("2")){
            System.out.println("Please enter the first number: ");
            double a = input.nextDouble();
            System.out.println("Please enter the second number: ");
            double b = input.nextDouble();
            System.out.println("Please enter the third number: ");
            double c = input.nextDouble();

            if (a > b && a >c ) {
                if (b > c) {
                    System.out.println(a + "<" + b + "<" + c);
                } else {
                    System.out.println(a + "<" + c + "<" + b);
                }
            }

            if (b >a && b >c){
                if (a > c){
                    System.out.println(b + "<" + a +"<" +c);
                }
                else {
                    System.out.println(b + "<" + c +"<" +a);
                }
            }

            if (c > a && c > b){
                if (a > b){
                    System.out.println(c +"<" + a +"<" + b);
                }
                else {
                    System.out.println(c + "<" + b + "<" +a);
                }
            }
        }


    }
}
