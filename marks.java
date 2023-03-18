package Coding_ninjas;
import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	int i=1,j,temp;
	
	while (i<=n)
	{
		j=1;
		while (j<=n)
		{
			if ((i+j)>=(n+2))
			{
				System.out.print("*");
			}
			else 
			{
				System.out.print(j);
			}
			j++;
		}
		j=n+1; temp=n;
		while (j<=2*n)
		{
			if ((j-i)<=(n-1))
			{
				System.out.print("*");
			}
			else 
			{ 
				
				System.out.print(temp);
			}
			temp--;
			j++;
			}
		System.out.println();
	i++;
	}
	}

}
