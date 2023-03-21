package giris;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1000;
        int login_failed = 3;
        int decision;


        while ( login_failed > 0 ) {

            System.out.println("Enter your user id: ");
            String user_id = input.nextLine();

            System.out.println("Enter your password: ");
            String password = input.nextLine();

            if (user_id.equals("user123") && password.equals("password123")) {
                System.out.println("Logged in successfully...");
                do {
                    System.out.println("1-Deposit money\n2-Withdraw money\n3-Balance inquiry\n4-Exit");
                    decision = input.nextInt();

                    if (decision == 1) {
                        System.out.println("How much money would you like to deposit?");
                        int money_deposit = input.nextInt();
                        if (money_deposit < 0) {
                            System.out.println("Enter a valid number!");
                        } else {
                            int last_money = balance + money_deposit;
                            System.out.println("Your new balance is : " + last_money);
                            balance = last_money;
                        }
                    }

                    if (decision == 2) {
                        System.out.println("How much money would you like to draw?");
                        int money_draw = input.nextInt();
                        if (money_draw < 0) {
                            System.out.println("Enter a valid number!");
                        }
                        if (money_draw > balance) {
                            System.out.println("You don't have enough money");
                        } else {
                            int last_money = balance - money_draw;
                            System.out.println("Balance: " + last_money);
                            balance = last_money;
                        }
                    }

                    if (decision == 3) {
                        System.out.println("Your balance :" + balance);
                    }
                } while (decision != 4);
                System.out.println("Thanks for using us!");
                break;
            }
            else{
                login_failed--;
                System.out.println("Login process failed. You have "+ login_failed + " rights.");
            }


        }



        }

    }
