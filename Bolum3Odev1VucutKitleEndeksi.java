package Giris;
import java.util.Scanner;
public class Bolum3Odev1VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double kilo , boy , endeks ;
        System.out.println("Lütfen kilonuzu \"kg\" cinsinden giriniz: ");
        kilo = input.nextDouble();
        System.out.println("Lütfen boyunuzu \"metre\" cinsinden giriniz: ");
        boy = input.nextDouble();
        endeks = (kilo / (boy * boy));
        System.out.println("Vücut Kitle Endeksiniz : " + endeks);
       if (endeks < 18.50) {
            System.out.println("Zayıf"); }
        else if (endeks > 18.5 && endeks <25){
           System.out.println("Sağlıklı Kilo"); }
       else if (endeks >= 25 && endeks < 30){
           System.out.println("Aşırı Kilolu"); }
       else {
           System.out.println("Obez"); }
        }
    }

