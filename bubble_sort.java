package Coding_ninjas;

import java.util.Scanner;

public class bubble_sort {
	
	 public static void bubbleSort(int[] arr)
	 {
		 for (int i=0;i<arr.length;i++)
	        {
	            for (int j=0;j<arr.length-i-1;j++)
	            {
	                if (arr[j]>arr[j+1])
	                {
	                    int temp=arr[j];
	            		arr[j]=arr[j+1];
	            		arr[j+1]=temp;
	                }
	            }
	        }
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	 }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("size:");
        int n=scan.nextInt();    
		int arr[]=new int[n];
		System.out.println("array");
		
			for (int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();	
		}
		
			bubbleSort(arr);	

	}

}
