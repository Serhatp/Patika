package giris;
import java.util.Scanner;

public class Area_Perimeter_Calculator4Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //If you want to take pi as a floater put COMMA between the numbers NOT DOT.. //
        System.out.println("Please enter the value of PI: " );
        double pi = input.nextDouble();
        System.out.println("Please enter the radius of the circle which you want to calculate: ");
        double radius = input.nextDouble();
        System.out.println("Please enter the central angle of your circle: ");
        double central_angle = input.nextDouble();

        double pi_square = pi*pi;
        double area = radius*pi_square;

        System.out.println("The area of your circle is " +area);

        double perimeter = 2*pi*radius;
        System.out.println("The aerimeter of your circle is " +perimeter);

        double diameter = radius*radius;
        double area_of_a_pie = (pi*diameter*central_angle)/360;
        System.out.println("The area of your circle pie is " + area_of_a_pie);

    }
}
