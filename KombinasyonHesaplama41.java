package Giris;
//N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak
//adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
//Java ile kombinasyon hesaplayan program yazınız.
// C(n,r) = n! / (r! * (n-r)!)
import java.util.Scanner;
public class KombinasyonHesaplama41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total1 = 1, total2 = 1, total3 = 1;
        System.out.print("Kombinasyonlarını hesaplamak istediğiniz iki sayıdan ilkini giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int sayi2 = input.nextInt();
        for (int i = 1; i <= sayi1; i++) {
            total1 *= i;
        }
        for (int ii = 1; ii <= sayi2; ii++) {
            total2 *= ii;
        }
        for (int iii = 1; iii <= (sayi1 - sayi2); iii++) {
            total3 *= iii;
        }
        double komb = (total1 / (total2 *  total3));
        System.out.println("Sayıların Kombinasyonu : " +komb);
    }
}

