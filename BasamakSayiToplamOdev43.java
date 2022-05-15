package Giris;
//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
import java.util.Scanner;
public class BasamakSayiToplamOdev43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi = input.nextInt();
        int basamakSayi = 0, tempsayi = sayi;
        int basamakdeger;
        int sonuc = 0;
        while (tempsayi != 0) {
            tempsayi /= 10;
            basamakSayi++;
        }
        System.out.println("Basamak Sayısı :" + basamakSayi);
        tempsayi = sayi;
        while (tempsayi != 0) {
            basamakdeger = tempsayi % 10;
            sonuc += basamakdeger;
            tempsayi /= 10;
        }
        System.out.println("Basamak sayılarının toplamı : " + sonuc);
    }
}
