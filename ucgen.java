import java.util.Scanner;

public class ucgen {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        System.out.print("basamak sayisini giriniz : ");
        int x = input.nextInt();

        for (int i = 1; i <= x; i++)
        {
            System.out.print("\n");
            for (int k = x; k >= i; k--)
            {
                System.out.print(" *");
            }
            

        }
    }
}