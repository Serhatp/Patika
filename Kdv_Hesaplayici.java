package giris;
import java.util.Scanner;

public class Kdv_Hesaplayici {
    public static void main(String[] args) {
        /*KDV oranı, ürün 1000 TL'den pahalı ise %8; ucuz ise %18 olarak belirlenmiştir.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Almak istediğiniz ürünün fiyatını giriniz: ");
        double fiyat = input.nextDouble();
        double a = (fiyat + fiyat*0.18);
        double b = (fiyat+(fiyat*0.8));
        String kosul = fiyat <= 1000 ? "ücretiniz "+a+"TL" :"ücretiniz "+b+"TL";
        System.out.println(kosul);


    }
}
