package Coding_ninjas;
import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		   {
			   Scanner s=new Scanner(System.in);
				int rows=s.nextInt();
				int i,j,k;
				
				i=1;
				while (i<=((rows+1)/2))
				{
				j=1;
				while ((((rows+1)/2)-i) >=j)
				{
					System.out.print(" ");
					j++;
				}
				j=0;
				while (j<i)
				{
					System.out.print("*");
					j++;
				}
					
				j=1;
				while (j<i)
				{
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
				}
				
		
				i = rows - ((rows+1)/2);
				while( i > 0 ) 
			{
					j = 1 ;
					while ( j <= (((rows+1)/2)-i) ) 
					{
						System.out.print(" ");
						j++;
					}
					k = 1 ;
					while( k <= i * 2 - 1 ) 
					{
						System.out.print("*");
						k++;
					}
					System.out.println();
					i--;
				
		   }
	}
}
	
}
