import java.util.*;
public class LeftRotateDistance{
	public static void DistancebyOne(int arr[])
	{
		int n = arr.length;
		int temp = arr[0];
		for(int i = 0; i < n - 1; i += 1)
		{
		
			arr[i] = arr[i + 1];
		}
		arr[n-1] = temp;
		for(int i = 0; i < n; i += 1)
		{
			System.out.print(arr[i]+ " ");
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
		DistancebyOne(arr);
	}	
}	
