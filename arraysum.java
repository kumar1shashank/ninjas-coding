package Coding_ninjas;

import java.util.Scanner;

public class arraysum {

	public static int sum(int[][] arr) {
    int i=0;
    int sum[] =new int[arr.length];
    
    while (i<arr.length)
    {
    	sum[i]=0;
    for (int j=0;j<arr.length;j++)
    	{
            sum[i]=sum[i]+arr[i][j];
        }
    i++;
    }
    System.out.print("in arraysum");
    return sum[i];  
			
		}
		
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt(); 
			int size=s.nextInt();  
			
			int input[][] =new int[n][size];
	int j=0;
	while (j<n)
	{		
			for (int i=0;i<size;i++)
			{
				input[j][i]=s.nextInt();
			}
			System.out.print("j+1");
		j++;			
		}
			int tot=sum(input);
			System.out.print(tot);
	}
	}

