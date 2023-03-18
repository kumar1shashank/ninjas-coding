package Coding_ninjas;

import java.util.Scanner;

public class remove_consecutive {
	
	public static String removeConsecutiveDuplicates(String input) 
	{
		String output="";
		int count;
		for (int i=0;i<input.length();i=i+count)
		{
			count=1;
			output=output+input.charAt(i);
			System.out.println("output= "+output+i+" =i");
			
			for (int j=i+1;j<input.length();j++)
			{
				if (input.charAt(i)==input.charAt(j))
				{
					count++;
					
				}
				else 
				{
					break;
				}
			}
		}
	return output;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		System.out.print(removeConsecutiveDuplicates(str));

	}

}
