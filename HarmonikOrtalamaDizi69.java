package Giris;

public class HarmonikOrtalamaDizi69 {
    public static void main(String[] args) {
    double[] dizi = {1,2,3,4,};
    double sum = 0;
    for(double i: dizi){
        sum += 1/i;
    }
    double ort = dizi.length / sum;
        System.out.println("Elemanların harmonik serisi : " + sum);
        System.out.println("Harmonik Ortalama : " + ort);
    }
}
/*
Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

Harmonik Seri Formülü :
1/k =  1/1 + 1/2 + 1/3 + ... + 1/k
 */