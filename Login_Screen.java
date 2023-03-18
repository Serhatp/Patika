package giris;
import java.util.Scanner;

public class Login_Screen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Username is "Patika" and the password is "Java101" //


        System.out.println("Please enter your username: ");
        String username = input.nextLine();
        System.out.println("Please enter your password: ");
        String password = input.nextLine();


        if (username.equals("Patika") && password.equals("Java101")){
            System.out.println("Logging into the system... ");
            System.out.println("Welcome! ");
        }
        else{
            System.out.println("Username or password is incorrect. ");
            System.out.println("Do you want to reset your password?\n Please type 1 for yes, 2 for no...");
            String password_reset = input.nextLine();
            if (password_reset.equals("1")){
                System.out.println("Please enter new password: ");
                String new_password = input.nextLine();

                System.out.println("Please enter username: ");
                String verify_username = input.nextLine();

                System.out.println("Please enter new password: ");
                String verify_password = input.nextLine();

                if (verify_username.equals("Patika") && new_password.equals(verify_password)){
                    System.out.println("Logging in...\nWelcome!");
                }
                else{
                    System.out.println("Incorrect password or username!\nLogging procces was failed...");
                }

            }
            if (password_reset.equals("2")){
                System.out.println("The logging process wasn't successful... ");
            }


        }










}}
