package Coding_ninjas;

import java.util.Scanner;

public class merge_sorted_array {

	public static int[] merge(int arr1[], int arr2[])
	{
		int i=0,j=0,k=0;
		int fin_arr= arr1.length+arr2.length;
		int fin[]=new int[fin_arr];
		
		 for(k=0;k<(arr1.length + arr2.length);k++)
		 {
			 if (i<)
		 }
		
		
		return -1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("size1:");
        int n1=scan.nextInt(); 
       int arr1[]=new int[n1];
		
		System.out.println("array 1:");
		for (int i=0;i<n1;i++) // array 1
		{
			arr1[i]=scan.nextInt();	
		}
			
			System.out.print("size1:");
			 int n2=scan.nextInt(); 
			 int arr2[]=new int[n2];
			 
			System.out.println("array 2");
			for (int i=0;i<n2;i++) // array 2
		{
			arr2[i]=scan.nextInt();	
		}

			merge(arr1,arr2);
			
	}

}
