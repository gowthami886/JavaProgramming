import java.util.*;
class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1, j;
        while(i <= n)
        {	
     				char c = (char)('A' + i -1);
        		j = 1;
           		while(j <= i)
            	{
                System.out.print(c);
                c = (char)(c + 1);
                j+= 1;
           	 }
           System.out.println();
           i+= 1;
        }
		
	}

}

