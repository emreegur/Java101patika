package Giris;

public class Bolum5Odev4AsalSayiBulma {
    public static void main(String[] args) {
        int number,count;
        System.out.print(" Prime Numbers from 1 to 100 are : ");
        for (int i =1;i<=100;i++){
            count = 0;
            for (number =2; number <=i/2; number++){
                if(i % number == 0){
                    count++;
                    break;
                }} if ((count == 0) && (i != 1)){
                    System.out.print(i + ", ");
                }

            } }}