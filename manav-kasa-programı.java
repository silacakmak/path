import java.util.Scanner;//konsoldan veri almak için eklediğim sınıf
class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    float armut=2.14f;
     float elma =  3.67f;
     float domates=1.11f;
     float muz=0.95f;
     float patlican=5.00f;
     System.out.println("Armut kaç kilo?");
       float ka=input.nextFloat();
       System.out.println("Elma kaç kilo?");
       float ke=input.nextFloat();
       System.out.println("Domates kaç kilo?");
       float kd=input.nextFloat();
       System.out.println("Muz kaç kilo?");
       float km=input.nextFloat();
       System.out.println("Patlıcan kaç kilo?");
       float kp=input.nextFloat();
       float toplam=(ka*armut)+(ke*elma)+(kd*domates)+(km*muz)+(kp*patlican);
       System.out.println(toplam+" TL");
    }
}