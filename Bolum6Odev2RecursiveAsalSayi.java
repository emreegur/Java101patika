package Giris;
//Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
import java.util.Scanner;
public class Bolum6Odev2RecursiveAsalSayi {
    static void asal(int a){
        int sonuc = 0;
        for(int i=2; i<=a/2;i++){
            if (a % i == 0){
                sonuc ++;
                break;
        }} if ((sonuc == 0) && (a > 1)){
                System.out.println(a + " sayısı asal sayıdır.");
            }else System.out.println(a + " sayısı asal sayı değildir.");
            }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi = input.nextInt();
        asal(sayi);
    }
}
