package Giris;
import java.util.Scanner;
public class Bolum5Odev3TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();

        for (int i=0;i<=n;i++){
            for (int boslukk=0; boslukk<=i; boslukk++){
                System.out.print(" ");
            }
            for (int y=1; y<=2*(n-i)-1; y++){
                // yıldız formülü : 2(n-satır)-1
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
