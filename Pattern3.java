import java.util.Scanner;
class Solution {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
       	int n = s.nextInt();
        int i, j;
        for(i = 1; i <= n; i+= 1)
        {
            char Alpha = (char)('A' + i - 1);
            for(j = 1; j <= i; j+= 1)
            {
                System.out.print(Alpha);
            }
            System.out.println();
        }
    }
}
