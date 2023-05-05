import java.util.Scanner;
class Main {
   
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
  
    System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
    float boy=input.nextFloat();
    System.out.println("Lütfen kilonuzu giriniz");
    float kilo=input.nextFloat();
    System.out.println("Vücut Kitle İndeksiniz :");
    float index=kilo/(boy*boy);
  System.out.println(index);
  }
}