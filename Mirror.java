import java.util.Scanner;
public class Solution {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1, j;
        while(i <= n)
        {
        	j = n;
        	while(j > i )
        	{
        		System.out.print(" ");
        		j -= 1;
        	}
        	int k = 1;
        	while(k <= i)
        	{
        		System.out.print(k);
        		k += 1;
        	}
        	System.out.println();
        	i += 1;
        }
        
        }
}




