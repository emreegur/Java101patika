package Giris;
import java.util.Scanner;
import java.lang.Math;

public class DikUcgen18 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double kenar1 , kenar2 , hipotenus , alan , cevre ;
        System.out.print("Dik üçgenin 1.dik kenarının uzunluğunu giriniz: ");
        kenar1 = input.nextDouble();
        System.out.print("Dik üçgenin 2.dik kenarının uzunluğunu giriniz: ");
        kenar2 = input.nextDouble();

        alan = (kenar1 * kenar2) / 2;
        System.out.println("Üçgenin alanı : " + alan);
        hipotenus = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.println("Hipotenüs'ün uzunluğu" + hipotenus);

        cevre = (kenar1 + kenar2 + hipotenus);
        System.out.println("Üçgenin çevresi" + cevre);

    }
}
