package Giris;
import java.util.Scanner;
//Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
//100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
public class Bolum4Odev3ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();
        if (year <0){
            System.out.println("Hatalı giriş yaptınız.");
        }else if ((year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " artık bir yıldır.");
        } else if ((year % 100 == 0) && (year % 400 != 0)) {
            System.out.println(year + " artık bir yıl değildir.");
        } else if (year % 4 == 0) {
            System.out.println(year + " artık bir yıldır.");
        } else {
            System.out.println(year + " artık bir yıl değildir.");
        }
    }
}
/*Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl.
Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir. */