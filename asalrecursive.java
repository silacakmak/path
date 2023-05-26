
import java.util.Scanner;


public class asalrecursive {

    public static void recursive(int x,int i){
       
        if(x==i){
            System.out.print(x+" asal sayıdır");
            return;
   
        }

        
        else if(x%i == 0 ){
            System.out.print(x+" asal sayı değildir");
            return;

        }
        recursive(x,i+1);
        
    }
        
        
    

    public static void main(String[] args) {
        System.out.print("Sayı Giriniz :");
        Scanner input=new Scanner(System.in);
       
        int a=input.nextInt();
       recursive(a,2);


}
}

