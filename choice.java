package Coding_ninjas;
import java.util.Scanner;

public class choice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int choice=scan.nextInt();
        
        int i,sum=0,pro=1;
        if (choice ==1)
        {
        	for (i=1;i<=num;i++)
        	{
        	sum=sum+i;	
        	}
        	System.out.print(sum);
        }
        
        else if (choice==2)
        {
        	for (i=1;i<=num;i++)
        	{
        		pro=pro*i;
        	}
        	System.out.print(pro);
        }
        else 
        {
        	System.out.print("-1");
        }
        

	}

}
