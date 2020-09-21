import java.util.*;
public class SumPattern {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i, result = 0;
        String str = "";
        for(i = 1; i <= n; i += 1)
        {	
            int sum = 0;
            String sumStr = "";
            String resultStr = "";
            for (int j = 1; j <= i; j += 1)
            {
                sum  += j;
                String str1 = Integer.toString(j);
                sumStr += str1;
                if( j != i) 
                {
                  sumStr += "+";
                }
            }
            resultStr += (sumStr + "=" + Integer.toString(sum));
            System.out.println(resultStr);
        }
	}
}
