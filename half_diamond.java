package Coding_ninjas;
import java.util.Scanner;

public class half_diamond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        
        int i,j,k;
        
        //first half
        
        for(i=0;i<=n;i++)
        {
        	System.out.print("*");
        	if (i>0)
        	{
        	j=1;
        	
        	while (j<=i)
        	{
        		System.out.print(j);
        		j++;
        	}
        	j=(i-1); 
        	while (j>0)
        	{
        		System.out.print(j);
        		j--;
        	}
        	System.out.print("*");
        	}
        	System.out.println();
        	}
//second half
        for (i=(n-1);i>0;i--)
        {
        	System.out.print("*");
        	if (i>0)
        	{
        		j=1;
        		while (j<=i)
        		{
        			System.out.print(j);
        			j++;
        		}
        		j=i-1;
        		while (j>0)
        		{
        			System.out.print(j);
        			j--;
        		}
        	}
        System.out.println("*");
        }
        System.out.print("*");
	}

}
