package Coding_ninjas;

import java.util.Scanner;

public class Intersection_Two_Arrays {
	
	 public static void intersections(int arr1[], int arr2[]) {
		 	int n1=arr1.length;
	        int n2=arr2.length;
	        
	        for (int i =0;i<n1-1;i++)
	        {
	        	 for (int j =0;j<n2-1;j++)
	        	 {
	        		 if (arr1[i]==arr2[j])
	        		 {
	        			 System.out.println(arr1[i]);
	        		 }
	        	 }
	        }
		 
	 }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n=scan.nextInt(); 
        int n2=scan.nextInt(); 
		int arr1[]=new int[n];
		int arr2[]=new int[n2];
		System.out.println("array 1");
		
		for (int i=0;i<n;i++)
		{
			arr1[i]=scan.nextInt();	
		}

		System.out.println("array 2");
		for (int i=0;i<n2;i++)
		{
			arr2[i]=scan.nextInt();	
		}
		
		intersections(arr1,arr2); 
	}

}
