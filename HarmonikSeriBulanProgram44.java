package Giris;
//Java ile girilen sayının harmonik serisini bulan program yazacağız.
// Harmonik Seri Formülü : 1 + (1/2) + (1/3) + ... + (1/n)
import java.util.Scanner;
public class HarmonikSeriBulanProgram44 {
    public static void main(String[] args) {
        double sonuc =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        for(int i=1; i<=sayi; i++){
            sonuc += (1.05/i);
        }
        System.out.println("Girdiğiniz sayının harmonik seri sonucu : " + sonuc);
} }
