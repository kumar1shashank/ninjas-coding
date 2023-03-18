
package Coding_ninjas;

import java.util.Scanner;

public class swap_alternate {
	
	public static void swapAlternate(int arr[]) {
		int size=arr.length;
		//System.out.println(size);

		  for (int i=0;i<arr.length-1;i=i+2)
	        {
	            int temp=arr[i];
	            arr[i]=arr[i+1];
	            arr[i+1]=temp;
	        }
		  for (int i=0;i<arr.length;i=i+1) {
			System.out.print(arr[i]);
	        }
	return;
}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int arr[]=new int[n];
		
		for (int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();	
		}
		
		swapAlternate(arr);	
	}

}
