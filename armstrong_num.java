package Coding_ninjas;
import java.util.Scanner;

public class armstrong_num {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        
        int rem,arm=0,i=0,n=num,k=num;
        
        while (k>0)
        {
        	rem=k%10;
        	k=k/10;
        	i++;
        }
        
        while (num>0)
        {
        	rem=num%10;
        	num=num/10;
        	arm=arm+(int)Math.pow(rem,i);
        	
        }
        if (arm==n)
        {
        	System.out.print("true");
        }
        else {
        	System.out.print("false");
        }

	}

}
