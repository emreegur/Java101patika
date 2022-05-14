package Giris;
//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
//ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
import java.util.Scanner;
public class Ciftve4unKatlariToplama39 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int toplam =0, n;
        do{
            System.out.print("Sayı Giriniz:");
            n =input.nextInt();
            if (n%4 == 0){
                toplam +=n;
            }
        }while (n %2 == 0);
        System.out.println("Toplam: " + toplam);

    }
}
