package Giris;
//Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

//Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi
//sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme
//işleminde sayının son değerini ekrana yazdırın.
import java.util.Scanner;
public class Bolum6Odev3DeseneGoreMetot {
    public static void kural(int n){
        int temp = n;
        System.out.print(temp + " ");
        for(int i =1; i < 2*((n/5)+1/2); i++) {
            temp -= 5;
            System.out.print(temp + " ");
        if (temp <= 0){
                for(int ii =1; ii < ((n/5)+1); ii++){
                    temp += 5;
                    System.out.print( "," + temp );
                    if (temp == n){
                        break;
                    }
            }
                break;
        }
    }
        System.out.print("," + n);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int N = input.nextInt();
        kural(N);


    }
}
