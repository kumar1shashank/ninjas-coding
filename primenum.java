package Coding_ninjas;
import java.util.Scanner;

public class primenum {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	
		int i=1,j,temp=0;
		int p;
		
		while (i<=n)
		{
			j=1;
		while ((n-i)>=j)
		{
			
			System.out.print(" ");
			j++;
		}
		j=0;
		while ( j<i)
		{
			System.out.print(i+j);
			j++;
		}
		
		j=1;
		
		while (j<i)
		{
			p=(i-1)*2-j+1;
			System.out.print(p);
			j++;
		
		}
		System.out.println();
		i++;
		}

	}
}

