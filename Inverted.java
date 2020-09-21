import java.util.Scanner;
public class Solution {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1, j =1;
		int var = n;
		while(i <= n)
		{
			j = n;
			while(j >= i)
			{
				System.out.print(var);
				j -= 1;
			}
			var -= 1;
			System.out.println();
			i += 1;
		}

}
}

