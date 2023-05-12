import java.util.Scanner;
// import java.util.stream.IntStream;

public class mksayi{
  
    public static void main(String[] args) {
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        
        int sayi= input.nextInt();
        for(int i=1;i<sayi; i++){
            if(sayi%i==0){
                sum=sum+i;
            }
        }
        if(sum==sayi){
            System.out.println(sayi+" mükemmel sayıdır");
        }
        else{
            System.out.println(sayi +"mükemmel sayı değildir");
        }
    }

}