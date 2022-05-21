package Giris;
//Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
import java.util.Scanner;
public class Bolum6Odev1RecursiveUsluSayi {
    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int taban = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int us = input.nextInt();
        System.out.print("Sonuç : ");
        System.out.print(power(taban,us));



    }
}
