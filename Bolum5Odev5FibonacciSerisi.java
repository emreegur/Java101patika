package Giris;
//Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
import java.util.Scanner;
public class Bolum5Odev5FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı bir fib serisi istiyorsunuz ? : ");
        int count = input.nextInt();
        int n1=0,n2= 1,n3;
        System.out.print(n1 + " " + n2);
        for (int i =2;i<count;i++){
            n3=n1+n2;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;
        }




    }
}
