package Coding_ninjas;
import java.util.Scanner;

public class reverse_num {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        
        int rem,rev=0;
        
        while (num>0)
        {
        	rem=num%10;
        	num=num/10;
        	
        	rev=rev+rem;
        	
        	if (num>0)
        	{
        		rev=rev*10;
        	}
        	else 
        	{
        		System.out.print(rev);
        	}
        	
        }

	}

}
