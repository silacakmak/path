
import java.util.Scanner;


public class desen {
    public static int re1 (int y, int z){
        if(y==z){
            System.out.print(" "+y);
        return y;
        
        }
        System.out.print(" "+y);
        return re1(y+5,z);
    }
    
    public static int recursive (int x,int b){
       
        if(x<=0){
            
            
            return re1 (x,b) ;
        
        }
        System.out.print(" "+x);
        return x - recursive(x-5,b) ;
        

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı:");
        int a=input.nextInt();
        int c=a;
        recursive(a,c);
        

}
}
