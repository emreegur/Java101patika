package Giris;
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
import java.util.Scanner;
public class DortveBesinKuvvetleriniYazma40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = input.nextInt();
        System.out.print("Dördün kuvvetleri : ");
        for (int i = 1; i <=n; i*=4){
            System.out.print(i + ",");
        }
        System.out.println("");
        System.out.print("Beşin Kuvvetleri : ");
        for (int a = 1; a <=n; a*=5){
            System.out.print(a + ",");
        }

    }
}
