package Giris;
//Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
import java.util.Scanner;
public class EBOBveEKOKBulma47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.println("EBOB ve EKOK bulma programına hoşgeldiniz.");
        System.out.print("Lütfen 1. sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz: ");
        n2 = input.nextInt();
        int ebob=1, kucuk = n1, ekok=1;
        int i =1;
        if(n1>n2){
            kucuk=n2;
        }
        while (i<=kucuk){
            if(n1%i==0 && n2%i==0){
                ebob=i;
            }
            i++;
        }
        while (i<= n1*n2){
            if(i%n1==0 && i%n2==0){
                ekok=i;
                break;
            }
            i++;
        }
        //int ekok = (n1*n2)/ebob;  (2. Ekok bulma yolu)

        System.out.println("Sayıların EBOB'u: " + ebob + "\nSayıların EKOK'u: " + ekok);


    } }
