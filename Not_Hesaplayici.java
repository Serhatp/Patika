package giris;
import java.util.Scanner;

public class Not_Hesaplayici {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("Lütfen Matematik sınav notunuzu giriniz: ");
        int mat = input.nextInt();

        System.out.print("Lütfen Türkçe sınav notunuzu giriniz: ");
        int turk = input.nextInt();

        System.out.print("Lütfen Tarih sınav notunuzu giriniz: ");
        int tarih = input.nextInt();

         float sonuc = ((mat + turk + tarih) / 3);
          String kosul = sonuc >= 60 ? "Tebrikler sınıfı geçtiniz!" : "Üzgünüz sınıfta kaldınız.";
        System.out.print(kosul);

    }
}
