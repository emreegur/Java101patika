package Giris;
//Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
//Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
import java.util.Arrays;
import java.util.Scanner;
public class Bolum9Odev1KBSıralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : " );
        int n = input.nextInt();
        if (n>0){
        int[] arr = new int[n];
        for(int i =1; i<= n; i++){
            System.out.print(i+ ". Elemanı : ");
            int a = input.nextInt();
            arr[i-1] = a;
        }
        Arrays.sort(arr);
        System.out.print("Sıralama : ");
        System.out.print(Arrays.toString(arr));
        }
        else{
            System.out.print("Hatalı giriş yaptınız.");
        }

    }
}
/*
ÖRNEK ÇIKTI
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99
 */