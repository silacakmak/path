import java.util.Scanner;
import java.lang.Math;


public class ushesap{
    public static double recursive(double x,double y){
        

            if(y ==0){
                return 1;
            }
            return x*recursive(x,y-1);

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int a =input.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int b =input.nextInt();
       
        System.out.println("Sonuç:");
        System.out.print(recursive(a,b));
        

    }
}