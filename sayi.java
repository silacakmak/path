
import java.util.Scanner;

public class sayi {
    public static void insertionSort(int D[], int n) {
        int j, k, key;
        for (j = 1; j < n; j++) { 
            key = D[j];
            for (k = j-1; k>=0 && key <= D[k]; k--) {
                D[k+1] = D[k]; 
            }
            D[k+1] = key; 
        }
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: :");
        int x=input.nextInt();
        int[] arr = new int[x];
    
        for (int i=0; i<x; i++) {
            System.out.println((i+1) + ". Sayıyı giriniz: ");
            int sayi=input.nextInt();
            arr[i]=sayi;
        }
        
        insertionSort(arr , x);
        System.out.println("en büyük sayı:" + arr[x-1]);
        System.out.println("en küçük sayı:" + arr[0]);
        
       
    }
}







