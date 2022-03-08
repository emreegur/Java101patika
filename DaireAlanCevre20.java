package Giris;
import java.util.Scanner;
public class DaireAlanCevre20 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double pi , r , cevre , alan , aci, dilimalan, dilimcevre ;
        pi = 3.14;
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();
        cevre = (2 * pi * r);
        System.out.println("Girdiğiniz " + r + " yarıçaplı dairenin çevresi: " + cevre );
        alan = ( pi * r * r );
        System.out.println("Girdiğiniz " + r + " yarıçaplı dairenin alanı: " + alan );
        System.out.println("");
        System.out.print(r + " yarıçaplı dairede alanını ve çevresini hesaplamak istediğiniz dilimin açısını giriniz:");
        aci = input.nextDouble();
        dilimalan = (alan * aci/360);
        System.out.println("Daire diliminin alanı : " + dilimalan);
        dilimcevre = ((2 * r) + (2 * pi * r * aci/360));
        System.out.println("Daire diliminin çevresi : " + dilimcevre);

    }
}
