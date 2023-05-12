import java.util.Scanner;


public class artikyil {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Yıl Giriniz :");

        int x=input.nextInt();
        if(x<100 && x%4==0){
            System.out.println(x+" bir artık yıldır.");
        }
        if(x%4==0 ) {
            if((x%100!=0)|| (x%100==0 && x%400==0)){
            System.out.println(x+" bir artık yıldır.");
        }
        else{
            System.out.println(x+ " bir artık yıl değildir.");
        }
    }
    else{
        System.out.println(x+ " bir artık yıl değildir.");
    }
}
}
