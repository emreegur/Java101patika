package Giris;
/** @author Emre Gür, 2022  */
/*Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir. */
import java.util.Scanner;
public class TaksimetreHesaplayici19 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double kmfiyat, acilis , hesap ;
        System.out.print("Gideceğiniz mesafeyi \"km\" cinsinden giriniz: ");
        int mesafe = input.nextInt();
        acilis = 10.0;
        kmfiyat = 2.20;
        hesap = (acilis) + (mesafe * kmfiyat);
        if (hesap < 20.0) {
            System.out.println("Ödenecek Tutar 20TL'dir"); }
            else {
                System.out.println("Ödenecek Tutar" + hesap);
            }
        }



    }

