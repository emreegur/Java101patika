package Giris;
import java.util.Scanner;
public class Bolum3Odev2ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Fiyat listesi aşağıdadır.\nArmut : 2,14 TL\n" +
                "Elma : 3,67 TL\n" +
                "Domates : 1,11 TL\n" +
                "Muz: 0,95 TL\n" +
                "Patlıcan : 5,00 TL");
        double armut , elma , domates , muz , patlican , tutar ;
        System.out.print("Kaç kg armut almak istersiniz ?");
        armut = input.nextDouble();
        System.out.print("Kaç kg elma almak istersiniz ?");
        elma = input.nextDouble();
        System.out.print("Kaç kg domates almak istersiniz ?");
        domates = input.nextDouble();
        System.out.print("Kaç kg muz almak istersiniz ?");
        muz = input.nextDouble();
        System.out.print("Kaç kg patlican almak istersiniz ?");
        patlican =  input.nextDouble();
        if (armut <0 || elma <0 || domates <0 || muz <0 || patlican <0) {
            System.out.println("Miktar 0'dan küçük olamaz."); }
        else {
            tutar = ((armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.0));
           System.out.println("Ödenecek tutar : " + tutar);
        }
    }
}
