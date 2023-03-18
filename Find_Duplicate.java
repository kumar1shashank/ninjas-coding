package Coding_ninjas;

import java.util.Scanner;

public class Find_Duplicate {
	
	 public static int duplicateNumber(int arr[])
	 {

			int size= arr.length;
			int val=0;
			
			for (int i=0;i<size;i++)
			{
				int count =1;
				
				for (int j=0;j<size;j++)
				{
					if (arr[i]==arr[j] && i!=j)
					{
						count++;
						
					}
					
					}
				if (count==2)
				{
					val= arr[i];
				}
				}
			return val;
	 }

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();    
		int arr[]=new int[n];
		
		for (int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();	
		}
		
		int a=duplicateNumber(arr);
		System.out.println(a);

	}

	}


