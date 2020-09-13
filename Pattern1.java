import java.util.Scanner;
public class Solution {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i, j;
	    char c = (char)('A' + n - 1);
        for(i = 1; i <= n; i += 1)
        {
            for(j = 1; j <= i; j += 1)
            {
            	
				System.out.print((char)(c - i + j));
            }
            System.out.println();
        }

	}
}

