package Coding_ninjas;

import java.util.Scanner;

public class Arrange_Numbers_in_Array {
	


	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("array size: ");
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		 int idx=0;
	        System.out.println(arr.length + " ");
	        for (int i=1;i<=n;i=i+2)
	        {
	            arr[idx]=i;
	            System.out.print(arr[idx]+ " ");
	            idx=idx+1;
	            
	        }
	        int i=0;
	        
	        if (n%2==0)
	        {
	            i=n;
	        }
	        else
	        {
	            i=n-1;
	        }
	        
	        for (;i>=2;i=i-2)
	        {
	            arr[idx]=i;
	            System.out.print(arr[idx]+ " ");
	            idx=idx+1;
	            
	        }
	        System.out.println("");
	        
	}

	
}
