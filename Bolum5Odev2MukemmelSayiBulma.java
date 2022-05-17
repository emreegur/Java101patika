package Giris;
import java.util.Scanner;
public class Bolum5Odev2MukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean dongu= true;
        while(dongu){
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int sorgu =0;
        for(int i=1;i <sayi;i++){
            if(sayi % i == 0){
                sorgu += i;
            } } if (sorgu == sayi){
                System.out.println(sayi + " Mükemmel sayıdır.");
            } else{
                System.out.println(sayi + " Mükemmel sayı değildir.");
            }
        }
        }
}
