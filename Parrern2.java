import java.util.*;
class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, j;
		for(i = 1;i <= n; i+= 1)
		{
			for (j = i; j >= 1; j-= 1)
			{
				System.out.print(j);

			}			
			System.out.println();

		}

}
}
