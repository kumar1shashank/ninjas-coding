package Coding_ninjas;
import java.util.Scanner;

public class linear_search {
	
	public static int linearSearch(int arr[], int x) {
		int size=arr.length;
		for (int i=0;i<size;i++)
		{
			if (arr[i]==x)
			{
				System.out.println("position: ");
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("size of array");
		int size=s.nextInt();
		System.out.println("array: ");
		int input[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			input[i]=s.nextInt();
		}
		System.out.println("element to be search: ");
		int n=s.nextInt();
		int x=linearSearch(input,n);
		
		System.out.println(x);

	}

}
