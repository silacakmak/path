


public class asal {



    
    public static void main(String[] args) {
        int sayi=0;
int arr[]=new int[100];
for (int i=1;i <= 100; i++){
    for (int k=1; k<i; k++){
        if((i%k) == 0 ){
            sayi++;
        }
    }
    if(sayi == 1){
        System.out.print(i+ " ");
    }
    sayi=0;
}
    }




    }
    



    

