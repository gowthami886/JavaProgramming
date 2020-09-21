import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int spaces1 = (n/2);
        int spaces2 = 0;
        for (int i = 1; i < n; i += 2) {
          for (int j = spaces1; j > 0; j -= 1 ) {
            System.out.print(' ');
          }
          spaces1 -= 1;
          for (int k = 1; k <= i; k += 1) {
            System.out.print('*');
          }
          System.out.println();
        }

        for (int i = n; i > 0; i -= 2) {
          for (int j = spaces2; j > 0; j -= 1) {
            System.out.print(' ');
          }
          spaces2 += 1;
          for (int k = 1; k <= i; k += 1) {
            System.out.print('*');
          }
          System.out.println();
        }
		
	}

}

