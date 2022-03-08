package Giris;
import java.util.Scanner;
public class NotOrtalamasiHesaplama16 {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Matematik Notunuzu Giriniz: ");
        int math = input.nextInt();
        System.out.println("Lütfen Fizik Notunuzu Giriniz: ");
        int physics = input.nextInt();
        System.out.println("Lütfen Kimya Notunuzu Giriniz: ");
        int chemistry = input.nextInt();
        System.out.println("Lütfen Türkçe Notunuzu Giriniz: ");
        int turkish = input.nextInt();
        System.out.println("Lütfen Tarih Notunuzu Giriniz: ");
        int history = input.nextInt();
        System.out.println("Lütfen Müzik Notunuzu Giriniz: ");
        int music = input.nextInt();
        int ort = (math + physics + chemistry + turkish + history + music );
        double sonuc = (ort/6);
        System.out.println("Ortalamanız: " + sonuc);
        String z = sonuc>=60 ? "Geçti" : "Kaldı";
           System.out.println(z);


    }
}
// Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik