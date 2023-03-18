package Coding_ninjas;

import java.util.Scanner;

public class Binary_search {
	
	 public static int binarySearch(int[] arr, int x)
	 {
		 int start=0,end =arr.length-1,mid;
		 
		 while(start<=end)
		 {
			 mid=(start+end)/2;
			 
			 if (arr[mid]==x)
			 {
				 return mid;
			 }
			 else if (arr[mid]< x)
			 {
				 start=mid+1;
			 }
			 else 
			 {
				 end =mid-1;
			 }
			 
		 }
		 return-1;
		 
	 }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("size:");
        int n=scan.nextInt();    
		int arr[]=new int[n];
		System.out.print("array");
		
			for (int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();	
		}
		
			System.out.print("element to be searched: ");
			   int x=scan.nextInt(); 
			   
		int a =binarySearch(arr,x);
		System.out.print(a);

	}

}
