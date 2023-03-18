package Coding_ninjas;
import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        
        int i,j;
        for (i=1;i<=num;i++)
        {
        	for (j=num;j>0;j--)
        		if (j==i)
        		{
        			System.out.print("*");
        		}
        		else { 
        			System.out.print(j);
        		}
        	System.out.println();
        		}
        
	}

}
