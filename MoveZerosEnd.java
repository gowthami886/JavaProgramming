import java.util.*;
public class MoveZerosEnd{
	public static void Move(int arr[])
	{
		int n = arr.length;
		int count = 0;
		for(int i = 0; i < n; i += 1)
		{
			if(arr[i] != 0)
			{ 
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count +=1;
			}	
		}
		for(int i = 0; i < n; i += 1)
		{
			System.out.print(arr[i]+" ");
		}
		 
		
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);	
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i += 1)
		{
			arr[i] = s.nextInt();
		}
		Move(arr);		
		System.out.println();
	}
}
