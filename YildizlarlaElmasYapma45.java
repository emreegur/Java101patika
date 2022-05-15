package Giris;
//Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
import java.util.Scanner;
public class YildizlarlaElmasYapma45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();
        for (int i=1; i<=n; i++){
            for(int bosluk=1; bosluk<= (n - i);bosluk++){
                System.out.print(" ");
            }for (int y=1; y<= (2*i - 1);y++){
                System.out.print("*");
        }
            System.out.println(" ");
        } //üçgen tamam, şimdi de ters üçgeni yapıp elmas şekli çıkarmak lazım.
        for (int ii =6; ii<= (2*n -1);ii++){
            for(int boslukk =1; boslukk <= (ii - 5); boslukk++){
                System.out.print(" ");
            } for(int yy=7; yy<=ii;yy++){
                System.out.print("*******");
            } System.out.println(" ");
        }
} }
