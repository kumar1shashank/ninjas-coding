package Coding_ninjas;

import java.util.Scanner;

public class array_Pair_Sum {
	
	public static int pairSum(int arr[], int x)
	{
		int size=arr.length;
		int count=0;
		for (int i=0;i<size;i++)
		{
			for (int j=0;j<size;j++)
			{
				if (i!=j)
				{
					if(arr[i]+arr[j]==x)
					{
						count++;
					}
				}
			}
		}
		return count/2;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();    
		int arr[]=new int[n];
		
	System.out.println("X");
	   int x=scan.nextInt();  
		for (int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();	
		}
		
		int c=pairSum(arr,x);
		System.out.println("num: "+c);

	}

}
