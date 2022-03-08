package Giris;
import java.util.Scanner;
/*Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız. */
public class KdvHesaplama17 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Ürünün KDV'siz fiyatını giriniz: ");
        double kdvsiz = input.nextDouble();
        if (kdvsiz >0.0 && kdvsiz<= 1000.0) {
        double kdvli;
        kdvli = ((kdvsiz * 0.18) + (kdvsiz));
        System.out.println("Ürünün KDV'li fiyatı" + kdvli);
    }
        else  {
            double kdvli2;
            kdvli2 = ((kdvsiz * 0.08) + (kdvsiz));
            System.out.println("Ürünün KDV'li fiyatı"+ kdvli2);
        }
} }
