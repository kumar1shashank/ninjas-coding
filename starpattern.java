package Coding_ninjas;
import java.util.*;
public class starpattern {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        int N=scan.nextInt();
	        for (int i=1;i<=N;i++)
	        {
	            for (int j=1;j<i;j++)
	            {
	                System.out.print("0");
	            }
	            System.out.print("*");
	            
	            for (int j=1;j<=(N-i);j++)
	            {
	                System.out.print("0");
	            }
	            System.out.print("*");
	            
	            for (int j=N-i;j>=1;j--)
	            {
	                System.out.print("0");
	            }
	            System.out.print("*");
	            
	            for (int j=1;j<i;j++)
	            {
	                System.out.print("0");
	            }
	            
	            System.out.println("");   
	        }


	}

}
