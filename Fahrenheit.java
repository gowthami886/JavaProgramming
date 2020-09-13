import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
	
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        while(S <= E)
        {
            double C = ((S - 32) * (0.5556));
            System.out.println(S+" "+(int)C);
            S = S + W;
        }
        
	}

}

