package Giris;
import java.util.Scanner;
import java.util.Arrays;
public class InputMaxMinArray70 {
    //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {1,23,57,543,6,-2,-345,1004,34,78,347};
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.print("Girilen Sayı :");
        int value = input.nextInt();
        Arrays.sort(list);

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (value > i) {
                min = i;
            }
            if (value < i) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük sayıya en yakın eleman :  " + min);
        System.out.println("Girilen sayıdan büyük sayıya yakın eleman :  " + max);
    }
    /*
    int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
     */
}
