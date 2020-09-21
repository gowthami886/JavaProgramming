import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i <= n)
        {
            int j = n;
            while (j > i)
            {
                System.out.print(" ");
                j -= 1;
            }
            int k = 1;
            while(k <= i)
            {
                System.out.print("*");
                k +=1;
            }
            int dec = 1;
            while(dec < i)
            {
                System.out.print("*");
                dec += 1;
            }
            i += 1;
            System.out.println();
        }
		
	}

}

