package Giris;
import java.util.Arrays;
/*
Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu
(devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği),
A^T (A üzeri T) ile gösterilir.
 */
public class Bolum9Odev3MatrisTranspoz {
    public static void main(String[] args) {
        int[][] matris = {{1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Matris :");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "    ");
            }
            System.out.println(" ");
        }
        System.out.println("Transpoze :");
        for (int i = 0; i < matris[0].length; i++) {
            for (int j = 0; j < matris.length; j++) {
                System.out.print(matris[j][i] + "     ");
            }
            System.out.println(" ");
        }
    }
}
/*
Senaryo
Matris :
2    3    4
5    6    4
Transpoze :
2    5
3    6
4    4

Matris :
1    2    3
4    5    6
Transpoze :
1    4
2    5
3    6
 */