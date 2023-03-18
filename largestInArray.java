package Coding_ninjas;

import java.util.Scanner;

public class largestInArray {
	
	public static int[] takeInput()
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int input[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			input[i]=s.nextInt();
		}
		return input;
		}
	
	public static void print(int input[])
	{
		int size=input.length;
		for(int i=0;i<size;i++)
		{
		System.out.print(input[i]+" ");
		
		}
		System.out.println();
	}

	public static int largestINarray(int input[])
	{
	 int max=Integer.MIN_VALUE;
	 for (int i=0;i<input.length;i++)
	 {
		 if (input[i]>max)
		 {
		 max=input[i];
		 }
	 }
	 return max;
	}
	public static void main(String[] args) {
		
		int arr[]=takeInput();
		print(arr);
		int largest=largestINarray(arr);
		System.out.print("largest-"+largest);

	}

}
