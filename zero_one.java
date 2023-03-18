package Coding_ninjas;

import java.util.Scanner;

public class zero_one {
	
	public static void sortZeroesAndOne(int[] arr)
	{
		int size=arr.length;
		int countz=0, counto=0,i;
		 for (i=0;i<size-1;i++)
		 {
			 if (arr[i]==0)
			 {
				countz++;
			 }
		 }
		 for (i=0;i<countz;i++)
		 {
			 System.out.print("0 ");
		 }
		 //System.out.println(i); 
		 for (int j=i;j<size;j++)
		 {
			 System.out.print("1 "); 
		 }
		 
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();    
		int arr[]=new int[n];
		  
		for (int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();	
		}
		
		sortZeroesAndOne(arr);

	}

}
