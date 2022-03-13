package Giris;
import java.util.Scanner;
public class Bolum4Odev1UcakBiletiFiyati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance, age, type ;
        double tutar = 0 ;
        System.out.print("Gideceğiniz mesafeyi \"km\" cinsinden giriniz : ");
        distance = input.nextInt();
        if (distance <= 0) System.out.println("Hatalı Giriş Yaptınız.");
        tutar += (distance * 0.1);
        System.out.println("İndirimsiz bilet fiyatı : " + (distance * 0.1) + "TL");
        System.out.print("Yaşınızı Giriniz : ");
        age = input.nextInt();
        if (age < 0) {
            System.out.println("Hatalı giriş yaptınız.");
        }else if (age >= 0 && age <12) {
            tutar -= (tutar/2);
            System.out.println("Yaş İndirimi sonucu tutar : " + (tutar) + "TL");
        }else if (age >= 12 && age < 24){
            tutar -= (tutar/10);
            System.out.println("Yaş İndirimi sonucu tutar : " + (tutar) + "TL");
        } else if (age > 65) {
            tutar -= (tutar * 3 / 10);
            System.out.println("Yaş İndirimi sonucu tutar : " + (tutar) + "TL");
        }
        System.out.print("Bilet Türünüzü Seçiniz \n1 : Tek Yön\n2: Gidiş-Dönüş ");
        type = input.nextInt();
        switch (type ){
            case 1 :
                System.out.println("Bilet Türüne göre bir indirim uygulanmadı.");
                break;
            case 2 :
                tutar -= (tutar * 2 / 10);
                tutar *= 2;
                System.out.println("Bilet Türüne göre indirim sonucu tutar : " + tutar + "TL");
                break;
            default :
                System.out.println("Hatalı Giriş Yaptınız.");
                break;

        }
        System.out.println("Ödenecek tutar : " + tutar + "TL");


    }
}
