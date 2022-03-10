package Giris;
import java.util.Scanner;
public class HesapMakinesiProgrami26 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n1 , n2 , select;
        System.out.print("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Mod Alma");
        System.out.print("Lütfen bu işlemlerden birini seçiniz : ");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                switch(n2) {
                    case 0 :
                        System.out.println("Bir sayı 0'a bölünemez.");
                        break;
                    default :
                        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                        break;
                }
                break;
            case 5:
                System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız, tekrar deneyiniz.");
        }
        }
    }

