package Coding_ninjas;
import java.util.Scanner;

public class bin_to_dec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        
        int limit=0,rev=0,rem;
        
        while (num>0)
        {
        	rem=num%10;
        	num=num/10;
        	
        	rev=(int)Math.pow(2, limit)*rem+rev;
        	limit=limit+1;
        }
        System.out.print(rev);
        	
        	
        }

	}


