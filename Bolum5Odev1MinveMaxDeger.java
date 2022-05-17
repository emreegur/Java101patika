package Giris;
//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
//ve bu sayıları ekrana yazan programı yazın.
import java.util.Scanner;
public class Bolum5Odev1MinveMaxDeger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int max= 0,min = 0;
        int adet;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        adet = input.nextInt();
        do {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi=input.nextInt();
            i++;
            if (i == 1){
                min= sayi;
                max= sayi;
            }else{
                if(sayi >max){
                    max = sayi;
                }else if (min > sayi){
                    min = sayi;
                } }
            }while (i <= adet);
        System.out.println("Girdiğiniz sayıların arasından en büyük sayı: " + max);
        System.out.println("Girdiğiniz sayıların arasından en küçük sayı: " + min);
        }
}

