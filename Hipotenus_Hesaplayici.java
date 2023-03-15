package giris;
import java.util.Scanner;

public class Hipotenus_Hesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üçgenin ilk kenarının uzunluğunu giriniz: ");
        float ilkkenar = input.nextFloat();
        System.out.println("Lütfen üçgenin ikinci kenarının uzunluğunu giriniz: ");
        float ikincikenar = input.nextFloat();
        float a = ilkkenar*ilkkenar;
        float b = ikincikenar*ikincikenar;
        double c = Math.sqrt(a+b);
        System.out.println("Üçgeninizin 3. kenarının uzunluğu " + c);
        double x = ilkkenar+ikincikenar+c;
        double d = x/2;
        System.out.println("Üçgeninizin çevresi " +x);
        double alan_alan = d*(d-ilkkenar)*(d-ikincikenar)*(d-c);
        double asil_alan = Math.sqrt(alan_alan);
        System.out.println("Üçgeninizin alanı " +asil_alan);



    }
}
