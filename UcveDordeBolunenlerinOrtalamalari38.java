package Giris;
//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
// ortalamasını hesaplayan programı yazınız.
import java.util.Scanner;
public class UcveDordeBolunenlerinOrtalamalari38 {
    public static void main(String[] args) {
        int sayi = 0 , toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int k = input.nextInt();
        for (int i = 0; i <=k; i++) {
            if ((i %3 == 0) && (i%4 == 0) && (i !=0) ){
                sayi++;
                toplam +=i;
            }
        }
        double ort = (toplam / sayi);
        System.out.println("Sayınıza Göre Ortalamanız : " + ort);
    }
}
