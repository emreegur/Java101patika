package Giris;
import java.util.Scanner;
public class SinifGecmeDurumu28 {
    public static void main(String[] args) {
        int mat , fizik , turkce , kimya , muzik ;
        double average = 0;
        Scanner input = new Scanner (System.in);
        System.out.print("Lütfen Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();
        if (mat >= 0 && mat<=100){
            average += mat ;}
        System.out.print("Lütfen Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik<=100){
            average += fizik ;}
        System.out.print("Lütfen Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce<=100){
            average += turkce ;}
        System.out.print("Lütfen Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya<=100){
            average += kimya;}
        System.out.print("Lütfen Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik<=100){
            average += muzik ;}


        if ((average/5) < 55) {
            System.out.println("Kaldınız.");
            System.out.println("Ortalamanız : " + average/5);
        }else {
            System.out.println("Geçtiniz.");
            System.out.println("Ortalamanız : " + average/5);
        }



    }
}
