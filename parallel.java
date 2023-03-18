package Coding_ninjas;
import java.util.Scanner;

public class parallel {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int n=scan.nextInt();
	        
	        int i,j,k;
	        
	        for (i=1;i<=(2*n);i++)
	        {
	        	
	        	
	        	if ((i%2)!=0)
	        	{
	        	k=i;
	        		while (k<(2*n))
	        		{
	        			if (k%2!=0)
	        			{
	        			System.out.print(" "+k);
	        			}
	        			k++;
	        		}
	        		
	        		
	        		j=1;
	        		
	        		
	        		while (j<i)
	        		{
	        			if (j%2!=0)
	        			{
	        			System.out.print(" "+j);
	        					}
	        			j++;
	        			}
	        	}
	        	System.out.println();
	        }


	}

}
