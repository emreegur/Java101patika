package Giris;
//Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazarak GitHub reposunu bizimle paylaşmalısın.
import java.util.Arrays;
public class DiziTekrarEdenCift72 {
    static boolean isFind (int[] dizi, int value){
        for (int i: dizi){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {2,3,4,5,8,11,8,751,2,567,870,4,870,751};
        int[] dupli = new int [array.length];
        int endex = 0;
        for(int i=0; i< array.length; i++){
            for(int j=0; j< array.length; j++){
                if((j!=i) && (array[i] == array[j]) && (array[i] % 2 == 0)){
                    if (!isFind(dupli,array[i])){
                    dupli[endex++] = array[i];
                    }
                }
            }
        }
        //System.out.print(Arrays.toString(dupli));
        for(int deger: dupli){
            if(deger != 0){
                System.out.print(deger + " ");
            }
        }

    }
}
