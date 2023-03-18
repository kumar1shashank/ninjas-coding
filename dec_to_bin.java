package Coding_ninjas;
import java.util.Scanner;

public class dec_to_bin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        
        long rem,rev=0,lim=0;
        
        while (num>0)
        {
        	rem=num%2;
        	num=num/2;
        	
        	rev=(long)Math.pow(10, lim)*rem+rev;
        	lim=lim+1;
        }
        
       System.out.print(rev);

	}

}
