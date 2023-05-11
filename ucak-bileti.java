import java.util.Scanner;
class Main {
   
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Mesafeyi km türünden giriniz :");
    float km =input.nextFloat();
    System.out.println("Yaşınızı giriniz :");
    float yas =input.nextFloat();
    System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
    float yt =input.nextFloat();
    float top1;
   float ind;
   float ind1;




    if ((yas < 0 && km < 0) && (yt != 1 || yt!= 2)) {
    
        System.out.println("Hatalı Veri Girdiniz !");

    }

    else{
       
    if(yas<12 && yas>0 ){
        top1=km/10;
        ind=top1/2;
        top1=top1-ind;

        // top1=top1-(top1*(1/2));
        if(yt==2){
            
            ind1=top1*(2/10);
            top1=(top1-ind1)*2;
            // top1=(top1-(top1*(2/10)))*2;
            System.out.println("Toplam Tutar =" + top1);
            
    }
        
        else {
            
            System.out.println("Toplam Tutar =" + top1);
           
            
        }
    }
    
     else if (yas>12 && yas<24 ){
        top1=km/10;
        
        top1=top1-(top1/10);
        // System.out.println("Toplam Tutar ="+top1);
       
        if(yt==2){
          
            ind1=top1/5;
            top1=(top1-ind1)*2;
        
         
              System.out.println("Toplam Tutar ="+top1);
            
     }
     else{
        System.out.println("Toplam Tutar ="+top1);
     }
    
      
     }

     else if(yas > 65 ){
        top1=km/10;
        ind=(top1*3)/10;
        top1=top1-ind;
       
        // top1=top1-(top1*(3/10));
        if(yt==2){
       
            
            ind1=(top1*2)/10;
            top1=(top1-ind1)*2;
            // top1=(top1-(top1*(2/10)))*2;
            System.out.println("Toplam Tutar ="+top1);
            // System.out.println(top1);
    }
        else{
        
            System.out.println("Toplam Tutar ="+top1);
            // System.out.println(top1);
        }
    }
    else {
        top1=km/10;
        System.out.println(top1);
    }
  
}
}
}