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
            int var = i;
            while(k <= i)
            {
                System.out.print(var);
                var += 1;
                k +=1;
            }
            int dec = 1;
            var = var - 2;
            while(dec < i)
            {
                System.out.print(var);
                dec += 1;
                var -= 1;
            }
            i += 1;
            System.out.println();
        }
		
	}

}

