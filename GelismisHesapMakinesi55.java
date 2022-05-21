package Giris;
//Aynı projeye mod almak ve dikdörtgen alan çevre hesabını yapan metotları yazıp menüde işlevsel hale getiriniz.
import java.util.Scanner;
public class GelismisHesapMakinesi55 {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplama : " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci sayı sıfırdan farklı olmalı.");
            return  0;
        } int result = a/b;
            System.out.println("Bölme : " + result);
            return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(a + " tabanlı " + b + " üslü sayının değeri : " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod Alma : " + result);
        return result;
    }

    static void rectangle(int a, int b) {
        if ((a > 0) && (b > 0)){
        System.out.println("Çevre : " + (2 * (a + b)));
        System.out.println("Alan : " + (a * b));
        }else System.out.println("Hatalı giriş yaptınız.");
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);

        while (true) {
            System.out.print("Bir işlem seçiniz:");
            select = input.nextInt();
            if (select == 0){
                System.out.println("Güle Güle");
                break;
            } if ((select > 7) || (select <0)){
                System.out.println("Geçersiz bir işlem girdiniz.");
                break;
            }
            System.out.print("İlk sayı : ");
            int a = input.nextInt();
            System.out.print("İkinci sayı : ");
            int b = input.nextInt();
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    rectangle(a, b);
                    break;
            }


        }
    }
}
