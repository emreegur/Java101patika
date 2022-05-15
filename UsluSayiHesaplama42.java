package Giris;
import java.util.Scanner;
// Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
public class UsluSayiHesaplama42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, us, total =1;
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        sayi = input.nextInt();
        System.out.print("Üssü giriniz: ");
        us = input.nextInt();
        for (int i = 1; i <= us; i++) {
            total *= sayi;
        }
        System.out.println("Sonucunuz : " + total);
    }
}
