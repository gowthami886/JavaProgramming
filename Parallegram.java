import java.util.Scanner;
public class Parallegram {

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i, j, dec, k;
        System.out.println("*");
        for(i = 1; i <= n; i+= 1)
        {
    	    System.out.print("*");
            for(j = 1; j <= i; j += 1)
            {
                System.out.print(j);
            }
            dec = j - 2;
            for(k = dec; k >= 1; k -= 1)
            {
                System.out.print(k);
                dec -= 1;

            }
            System.out.print("*");
            System.out.println();
        }
        n = n - 1;
        for(i = 1;i <= n; i += 1)
        {
         	System.out.print("*");
            for(j = 1; j <= n - i + 1; j += 1)
            {
                System.out.print(j);
    
            }
            
            dec = n - i;
            for(k = dec; k >= 1; k -= 1)
            {
                System.out.print(k);

            }
            System.out.print("*");
            System.out.println();
                
        }
        System.out.print("*");
    }
}
