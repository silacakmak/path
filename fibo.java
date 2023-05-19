
import java.util.Scanner;

class Main {


  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number");
    int a=s.nextInt();
    int n1=0;
    int n2=1;
    int n3;
     System.out.print(n1+" "+n2);
    for(int i=0;i<a;i++){
      n3=n1+n2;
      n1=n2;
      n2=n3;
       System.out.print(" "+n3+" ");
    }
   

  }

}