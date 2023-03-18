package Coding_ninjas;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		{ 
		    int n; 
		    Scanner sc=new Scanner(System.in); 
		    n=sc.nextInt();// scan value for pattern 
		  
		  int j;
		    int i=1;
		    while (i<=n)
		    {
		    	j=1;
		    	while (j<=n) 
		    		{
		    		int temp=n;
		    	if ((i*j)<(i*i))
		    	{
		    		temp=temp-i;
		    		System.out.print(temp+j);
		    	}
		    	else 
		    	{
		    		System.out.print(n);
		    	}
		    	j++;
		    		}
	    	
		    	System.out.println();
		    	i++;
		    }
		    }
		  
		} 
	}
