import java.util.Scanner;
public class OddSquare {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = "";
        int i , j, num;
            int c [] = new int[n];
            j = 0;
            num = 1;
            while(j < n)
            {
                c[j] = num;
                num += 2;
                j +=1;
            }
            for(j = 0; j < c.length; j += 1)
            {
                str += Integer.toString(c[j]);
            }

            System.out.println(str);
            int k = n-1;
            while(k > 0)
            {
                
                int temp = c[0];

                for(i = 0; i < c.length-1; i += 1)
                {
                    c[i] = c[i+1];
                }
                c[i] = temp;
                String str1 = "";
                for(int l = 0;l < c.length;l += 1)
                {
                    str1 += Integer.toString(c[l]);
                }
                System.out.println(str1);
                k -= 1;
            }
        }
    }



