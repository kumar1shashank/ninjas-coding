package Coding_ninjas;
import java.util.Scanner;

public class AP_series {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        
        int i,pro=0;
        for (i=1;i<=num;i++)
        {
        	pro=(3*i)+2;
//        	System.out.print(" "+pro);
       
        if ((pro%4)==0)
        {
        	num=num+1;
        }
        else {
        	System.out.print(pro+" ");
        	
        }
        }

	}

}
