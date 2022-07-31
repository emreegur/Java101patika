package Giris;
import java.util.Scanner;

public class MayinOyun77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satir sayisi : ");
        int a = input.nextInt();
        System.out.print("Sutun sayisi : ");
        int b = input.nextInt();
        String[][] alan = MayinTarlasi77.mayinTarlasiAlani(a, b);
        String[][] bosAlan = MayinTarlasi77.bosAlan(a, b);
        MayinTarlasi77.print(bosAlan);

        //MayinTarlasi77.print(alan);

        MayinTarlasi77.check(alan, bosAlan, a, b);
    }
}
