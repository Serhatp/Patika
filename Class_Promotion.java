package giris;
import java.util.Scanner;

public class Class_Promotion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your maths note: ");
        int maths = input.nextInt();
        if (maths <0 || maths > 100){
            maths = 0;
        }

        System.out.println("Please enter your physics note: ");
        int physics = input.nextInt();
        if (physics <0 || physics > 100){
            physics = 0;
        }

        System.out.println("Please enter your English note: ");
        int eng = input.nextInt();
        if (eng <0 || eng >100 ){
            eng = 0;
        }

        System.out.println("Please enter your chemistry note: ");
        int chem = input.nextInt();
        if (chem <0 || chem > 100){
            chem = 0;
        }

        System.out.println("Please enter your history note: ");
        int history = input.nextInt();
        if (history <0 || chem >100){
            chem = 0;
        }

        float average = (maths + physics + eng + chem + history)/5;
        if (average >= 55){
            System.out.println("Congratulations! You passed the class!!!");
        }
        if (average < 55){
            System.out.println("We are sorry to tell you, you didn't pass the class. You are going to have to repeat the class for the next year.\n" +
                    "For more information please visit 'www.schoolwebsite.edu'");
        }



    }
}
