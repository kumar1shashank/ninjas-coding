package Coding_ninjas;

import java.util.Scanner;

public class print_pairs {

	public static void printpairs(int arr[])
	{
	 for (int i=0;i<arr.length;i++)
	 {
		 for (int j=i;j<arr.length;j++)
		 {
			 System.out.println("("+arr[i]+","+arr[j]+") ");
		 }
	 }
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("size1:");
        int n1=scan.nextInt(); 
       int arr1[]=new int[n1];
		
		System.out.println("array:");
		for (int i=0;i<n1;i++)
		{
			arr1[i]=scan.nextInt();	
		}

		printpairs(arr1);
	}

}
