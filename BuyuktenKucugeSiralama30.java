package Giris;
import java.util.Scanner;
public class BuyuktenKucugeSiralama30 {
    public static void main(String[] args) {
        int num1 , num2 , num3 ;
        Scanner input = new Scanner (System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        num1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        num2 = input.nextInt();
        System.out.print("3. Sayıyı Giriniz : ");
        num3 = input.nextInt();
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.print(num1 + ">" + num2 + ">" + num3);
            } else {
                System.out.print(num1 + ">" + num3 + ">" + num2);
            }
        }
        if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.print(num2 + ">" + num1 + ">" + num3);
            } else {
                System.out.print(num2 + ">" + num3 + ">" + num1);
            }
        }
        if (num3 > num1 && num3 > num2) {
            if (num1 > num2) {
                System.out.print(num3 + ">" + num1 + ">" + num2);
            } else {
                System.out.print(num3 + ">" + num2 + ">" + num1);
            }
        }

    }
}
// Girilen 3 sayıyı "büyükten küçüğe" sıralayan programı yazınız.